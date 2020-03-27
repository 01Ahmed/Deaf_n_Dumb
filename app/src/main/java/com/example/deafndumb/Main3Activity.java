package com.example.deafndumb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private Button button31;
    private Button button32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this, AlphabetTestActivity.class);
                Main3Activity.this.startActivity(intent);
            }
        });

        button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this, NumberTestActivity.class);
                Main3Activity.this.startActivity(intent);
            }
        });

    }
}
