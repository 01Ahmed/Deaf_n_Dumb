package com.example.deafndumb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class NumberTestActivity extends AppCompatActivity {
    private static final String TAG = "AlphabetTestActivity";
    private Context context = NumberTestActivity.this;

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
        QuestionModel question1 = new QuestionModel();

        question1.setQuestion("What is the sign of 1?\nSigns Are:");
        question1.setPic1(R.drawable.eight);
        question1.setPic2(R.drawable.one);
        question1.setPic3(R.drawable.w);
        question1.setPic4(R.drawable.p);
        question1.setCorrect_ans("2");

        questions.add(question1);

        QuestionModel question2 = new QuestionModel();

        question2.setQuestion("What is the sign of 2?\nSigns Are:");
        question2.setPic1(R.drawable.nine);
        question2.setPic2(R.drawable.zero);
        question2.setPic3(R.drawable.two);
        question2.setPic4(R.drawable.t);
        question2.setCorrect_ans("3");

        questions.add(question2);

        QuestionModel question3 = new QuestionModel();

        question3.setQuestion("What is the sign of 3?\nSigns Are:");
        question3.setPic1(R.drawable.six);
        question3.setPic2(R.drawable.l);
        question3.setPic3(R.drawable.p);
        question3.setPic4(R.drawable.three);
        question3.setCorrect_ans("4");

        questions.add(question3);

        QuestionModel question4 = new QuestionModel();

        question4.setQuestion("What is the sign of 4?\nSigns Are:");
        question4.setPic1(R.drawable.four);
        question4.setPic2(R.drawable.k);
        question4.setPic3(R.drawable.q);
        question4.setPic4(R.drawable.b);
        question4.setCorrect_ans("1");

        questions.add(question4);

        QuestionModel question5 = new QuestionModel();

        question5.setQuestion("What is the sign of 5?\nSigns Are:");
        question5.setPic1(R.drawable.seven);
        question5.setPic2(R.drawable.t);
        question5.setPic3(R.drawable.five);
        question5.setPic4(R.drawable.n);
        question5.setCorrect_ans("3");

        questions.add(question5);

        QuestionModel question6 = new QuestionModel();

        question6.setQuestion("What is the sign of 6?\nSigns Are:");
        question6.setPic1(R.drawable.nine);
        question6.setPic2(R.drawable.six);
        question6.setPic3(R.drawable.l);
        question6.setPic4(R.drawable.e);
        question6.setCorrect_ans("2");

        questions.add(question6);

        QuestionModel question7 = new QuestionModel();

        question7.setQuestion("What is the sign of 7?\nSigns Are:");
        question7.setPic1(R.drawable.zero);
        question7.setPic2(R.drawable.s);
        question7.setPic3(R.drawable.u);
        question7.setPic4(R.drawable.seven);
        question7.setCorrect_ans("4");

        questions.add(question7);

        QuestionModel question8 = new QuestionModel();

        question8.setQuestion("What is the sign of 8?\nSigns Are:");
        question8.setPic1(R.drawable.eight);
        question8.setPic2(R.drawable.w);
        question8.setPic3(R.drawable.j);
        question8.setPic4(R.drawable.seven);
        question8.setCorrect_ans("1");

        questions.add(question8);

        QuestionModel question9 = new QuestionModel();

        question9.setQuestion("What is the sign of 9?\nSigns Are:");
        question9.setPic1(R.drawable.u);
        question9.setPic2(R.drawable.c);
        question9.setPic3(R.drawable.nine);
        question9.setPic4(R.drawable.d);
        question9.setCorrect_ans("3");

        questions.add(question9);

        QuestionModel question0 = new QuestionModel();

        question0.setQuestion("What is the sign of 0?\nSigns Are:");
        question0.setPic1(R.drawable.p);
        question0.setPic2(R.drawable.zero);
        question0.setPic3(R.drawable.nine);
        question0.setPic4(R.drawable.q);
        question0.setCorrect_ans("2");

        questions.add(question0);

        adapter = new QuestionsAdapter(context, questions);
        view_pager.setAdapter(adapter);
    }
}
