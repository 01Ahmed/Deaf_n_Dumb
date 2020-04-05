package com.example.deafndumb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AlphabetTestActivity extends AppCompatActivity {
    private static final String TAG = "AlphabetTestActivity";
    private Context context = AlphabetTestActivity.this;

    private ViewPager view_pager;
    private QuestionsAdapter adapter;
    private List<QuestionModel> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_test);

        questions = new ArrayList<>();
        view_pager = findViewById(R.id.view_pager);
        init();

    }

    private void init() {
        QuestionModel questionA = new QuestionModel();

        questionA.setQuestion("What is the sign of A?\nSigns Are:");
        questionA.setPic1(R.drawable.q);
        questionA.setPic2(R.drawable.w);
        questionA.setPic3(R.drawable.d);
        questionA.setPic4(R.drawable.a);

        questions.add(questionA);

        QuestionModel questionB = new QuestionModel();

        questionB.setQuestion("What is the sign of B?\nSigns Are:");
        questionB.setPic1(R.drawable.c);
        questionB.setPic2(R.drawable.b);
        questionB.setPic3(R.drawable.m);
        questionB.setPic4(R.drawable.z);

        questions.add(questionB);

        QuestionModel questionC = new QuestionModel();

        questionC.setQuestion("What is the sign of C?\nSigns Are:");
        questionC.setPic1(R.drawable.f);
        questionC.setPic2(R.drawable.b);
        questionC.setPic3(R.drawable.c);
        questionC.setPic4(R.drawable.d);

        questions.add(questionC);

        QuestionModel questionD = new QuestionModel();

        questionD.setQuestion("What is the sign of D?\nSigns Are:");
        questionD.setPic1(R.drawable.g);
        questionD.setPic2(R.drawable.b);
        questionD.setPic3(R.drawable.d);
        questionD.setPic4(R.drawable.o);

        questions.add(questionD);

        QuestionModel questionE = new QuestionModel();

        questionE.setQuestion("What is the sign of E?\nSigns Are:");
        questionE.setPic1(R.drawable.z);
        questionE.setPic2(R.drawable.n);
        questionE.setPic3(R.drawable.e);
        questionE.setPic4(R.drawable.p);

        questions.add(questionE);

        QuestionModel questionF = new QuestionModel();

        questionF.setQuestion("What is the sign of F?\nSigns Are:");
        questionF.setPic1(R.drawable.d);
        questionF.setPic2(R.drawable.y);
        questionF.setPic3(R.drawable.f);
        questionF.setPic4(R.drawable.k);

        questions.add(questionF);

        QuestionModel questionG = new QuestionModel();

        questionG.setQuestion("What is the sign of G?\nSigns Are:");
        questionG.setPic1(R.drawable.w);
        questionG.setPic2(R.drawable.f);
        questionG.setPic3(R.drawable.g);
        questionG.setPic4(R.drawable.l);

        questions.add(questionG);

        QuestionModel questionH = new QuestionModel();

        questionH.setQuestion("What is the sign of H?\nSigns Are:");
        questionH.setPic1(R.drawable.b);
        questionH.setPic2(R.drawable.x);
        questionH.setPic3(R.drawable.u);
        questionH.setPic4(R.drawable.h);

        questions.add(questionH);

        QuestionModel questionI = new QuestionModel();

        questionI.setQuestion("What is the sign of I?\nSigns Are:");
        questionI.setPic1(R.drawable.e);
        questionI.setPic2(R.drawable.d);
        questionI.setPic3(R.drawable.t);
        questionI.setPic4(R.drawable.i);

        questions.add(questionI);

        QuestionModel questionJ = new QuestionModel();

        questionJ.setQuestion("What is the sign of J?\nSigns Are:");
        questionJ.setPic1(R.drawable.m);
        questionJ.setPic2(R.drawable.a);
        questionJ.setPic3(R.drawable.j);
        questionJ.setPic4(R.drawable.d);

        questions.add(questionJ);

        QuestionModel questionK = new QuestionModel();

        questionK.setQuestion("What is the sign of K?\nSigns Are:");
        questionK.setPic1(R.drawable.k);
        questionK.setPic2(R.drawable.f);
        questionK.setPic3(R.drawable.s);
        questionK.setPic4(R.drawable.v);

        questions.add(questionK);

        QuestionModel questionL = new QuestionModel();

        questionL.setQuestion("What is the sign of L?\nSigns Are:");
        questionL.setPic1(R.drawable.n);
        questionL.setPic2(R.drawable.l);
        questionL.setPic3(R.drawable.w);
        questionL.setPic4(R.drawable.r);

        questions.add(questionL);

        QuestionModel questionM = new QuestionModel();

        questionM.setQuestion("What is the sign of M?\nSigns Are:");
        questionM.setPic1(R.drawable.q);
        questionM.setPic2(R.drawable.p);
        questionM.setPic3(R.drawable.m);
        questionM.setPic4(R.drawable.x);

        questions.add(questionM);

        QuestionModel questionN = new QuestionModel();

        questionN.setQuestion("What is the sign of N?\nSigns Are:");
        questionN.setPic1(R.drawable.n);
        questionN.setPic2(R.drawable.s);
        questionN.setPic3(R.drawable.y);
        questionN.setPic4(R.drawable.x);

        questions.add(questionN);

        QuestionModel questionO = new QuestionModel();

        questionO.setQuestion("What is the sign of O?\nSigns Are:");
        questionO.setPic1(R.drawable.a);
        questionO.setPic2(R.drawable.o);
        questionO.setPic3(R.drawable.e);
        questionO.setPic4(R.drawable.b);

        questions.add(questionO);

        QuestionModel questionP = new QuestionModel();

        questionP.setQuestion("What is the sign of P?\nSigns Are:");
        questionP.setPic1(R.drawable.t);
        questionP.setPic2(R.drawable.a);
        questionP.setPic3(R.drawable.r);
        questionP.setPic4(R.drawable.p);

        questions.add(questionP);

        QuestionModel questionQ = new QuestionModel();

        questionQ.setQuestion("What is the sign of Q?\nSigns Are:");
        questionQ.setPic1(R.drawable.q);
        questionQ.setPic2(R.drawable.h);
        questionQ.setPic3(R.drawable.g);
        questionQ.setPic4(R.drawable.i);

        questions.add(questionQ);

        QuestionModel questionR = new QuestionModel();

        questionR.setQuestion("What is the sign of R?\nSigns Are:");
        questionR.setPic1(R.drawable.j);
        questionR.setPic2(R.drawable.a);
        questionR.setPic3(R.drawable.r);
        questionR.setPic4(R.drawable.l);

        questions.add(questionR);

        QuestionModel questionS = new QuestionModel();

        questionS.setQuestion("What is the sign of S?\nSigns Are:");
        questionS.setPic1(R.drawable.d);
        questionS.setPic2(R.drawable.l);
        questionS.setPic3(R.drawable.w);
        questionS.setPic4(R.drawable.s);

        questions.add(questionS);

        QuestionModel questionT = new QuestionModel();

        questionT.setQuestion("What is the sign of T?\nSigns Are:");
        questionT.setPic1(R.drawable.f);
        questionT.setPic2(R.drawable.t);
        questionT.setPic3(R.drawable.q);
        questionT.setPic4(R.drawable.l);

        questions.add(questionT);

        QuestionModel questionU = new QuestionModel();

        questionU.setQuestion("What is the sign of U?\nSigns Are:");
        questionU.setPic1(R.drawable.d);
        questionU.setPic2(R.drawable.g);
        questionU.setPic3(R.drawable.z);
        questionU.setPic4(R.drawable.u);

        questions.add(questionU);

        QuestionModel questionV = new QuestionModel();

        questionV.setQuestion("What is the sign of V?\nSigns Are:");
        questionV.setPic1(R.drawable.w);
        questionV.setPic2(R.drawable.p);
        questionV.setPic3(R.drawable.v);
        questionV.setPic4(R.drawable.a);

        questions.add(questionV);

        QuestionModel questionW = new QuestionModel();

        questionW.setQuestion("What is the sign of W?\nSigns Are:");
        questionW.setPic1(R.drawable.w);
        questionW.setPic2(R.drawable.s);
        questionW.setPic3(R.drawable.h);
        questionW.setPic4(R.drawable.r);

        questions.add(questionW);

        QuestionModel questionX = new QuestionModel();

        questionX.setQuestion("What is the sign of X?\nSigns Are:");
        questionX.setPic1(R.drawable.g);
        questionX.setPic2(R.drawable.t);
        questionX.setPic3(R.drawable.k);
        questionX.setPic4(R.drawable.x);

        questions.add(questionX);

        QuestionModel questionY = new QuestionModel();

        questionY.setQuestion("What is the sign of Y?\nSigns Are:");
        questionY.setPic1(R.drawable.y);
        questionY.setPic2(R.drawable.s);
        questionY.setPic3(R.drawable.f);
        questionY.setPic4(R.drawable.e);

        questions.add(questionY);

        QuestionModel questionZ = new QuestionModel();

        questionZ.setQuestion("What is the sign of Z?\nSigns Are:");
        questionZ.setPic1(R.drawable.k);
        questionZ.setPic2(R.drawable.e);
        questionZ.setPic3(R.drawable.d);
        questionZ.setPic4(R.drawable.z);

        questions.add(questionZ);

        adapter = new QuestionsAdapter(context, questions);
        view_pager.setAdapter(adapter);
    }
}
