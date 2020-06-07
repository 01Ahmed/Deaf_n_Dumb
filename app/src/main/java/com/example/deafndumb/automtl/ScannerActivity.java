package com.example.deafndumb.automtl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.deafndumb.R;
import com.example.deafndumb.automtl.AutoMLImageLabelerProcessor;
import com.example.deafndumb.automtl.common.CameraSource;
import com.example.deafndumb.automtl.common.CameraSourcePreview;
import com.example.deafndumb.automtl.common.GraphicOverlay;
import com.google.firebase.ml.common.FirebaseMLException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScannerActivity extends AppCompatActivity {
    private static final String TAG = "ScannerActivity";
    private Context context = ScannerActivity.this;
    public static final String KEY_CAMERA_PERMISSION_GRANTED="CAMERA_PERMISSION_GRANTED";

    private CameraSourcePreview preview;
    private GraphicOverlay graphicOverlay;

    private CameraSource cameraSource = null;

    public static TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        if (getWindow() != null) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else {
            Log.e(TAG, "Barcode scanner could not go into fullscreen mode!");
        }

        text = findViewById(R.id.text);
        preview = findViewById(R.id.cameraSourcePReview);
        graphicOverlay = findViewById(R.id.graphicOverlay);

        if (preview != null){
            if (preview.isPermissionGranted(true, mMessageSender))
                new Thread(mMessageSender).start();
        }

        if (graphicOverlay == null) {
            Log.d(TAG, "graphicOverlay is null");
        }
    }

    private void createCameraSource() {

        if (cameraSource == null) {
            cameraSource = new CameraSource(this, graphicOverlay);
            cameraSource.setFacing(CameraSource.CAMERA_FACING_BACK);
        }

        try {
            Log.d(TAG, "createCameraSource: ");
            cameraSource.setMachineLearningFrameProcessor(new AutoMLImageLabelerProcessor(this, AutoMLImageLabelerProcessor.Mode.LIVE_PREVIEW));
        } catch (FirebaseMLException e){
            e.printStackTrace();
        }

        startCameraSource();
    }

    /**
     * Starts or restarts the camera source, if it exists. If the camera source doesn't exist yet
     * (e.g., because onResume was called before the camera source was created), this will be called
     * again when the camera source is created.
     */
    private void startCameraSource() {
        if (cameraSource != null && preview != null && graphicOverlay != null) {
            try {
                preview.start(cameraSource, graphicOverlay);
            } catch (IOException e) {
                Log.e(TAG, "Unable to start camera source.", e);
                cameraSource.release();
                cameraSource = null;
            }
        } else {
            Log.d(TAG, "startCameraSource: unable to start camera");
        }
    }

    @SuppressLint("HandlerLeak")
    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            Log.d(TAG, "handleMessage: ");

            if (preview != null)
                createCameraSource();

        }
    };

    private final Runnable mMessageSender = () -> {
        Log.d(TAG, "mMessageSender: ");
        Message msg = mHandler.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putBoolean(KEY_CAMERA_PERMISSION_GRANTED, false);
        msg.setData(bundle);
        mHandler.sendMessage(msg);
    };

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        startCameraSource();
    }

    /**
     * Stops the camera.
     */
    @Override
    protected void onPause() {
        super.onPause();
        preview.stop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (cameraSource != null) {
            cameraSource.release();
        }
    }
}
