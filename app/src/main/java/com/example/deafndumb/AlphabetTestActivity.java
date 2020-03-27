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
        QuestionModel question1 = new QuestionModel();

        question1.setQuestion("What is the sign of A?");
        question1.setPic1(R.drawable.a);
        question1.setPic2(R.drawable.b);
        question1.setPic3(R.drawable.c);
        question1.setPic4(R.drawable.d);

        questions.add(question1);

        QuestionModel question2 = new QuestionModel();

        question2.setQuestion("What is the sign of B?");
        question2.setPic1(R.drawable.c);
        question2.setPic2(R.drawable.b);
        question2.setPic3(R.drawable.e);
        question2.setPic4(R.drawable.z);

        questions.add(question2);

        QuestionModel question3 = new QuestionModel();

        question3.setQuestion("What is the sign of D?");
        question3.setPic1(R.drawable.f);
        question3.setPic2(R.drawable.b);
        question3.setPic3(R.drawable.w);
        question3.setPic4(R.drawable.d);

        questions.add(question3);

        QuestionModel question4 = new QuestionModel();

        question4.setQuestion("What is the sign of F?");
        question4.setPic1(R.drawable.a);
        question4.setPic2(R.drawable.b);
        question4.setPic3(R.drawable.f);
        question4.setPic4(R.drawable.d);

        questions.add(question4);

        QuestionModel question5 = new QuestionModel();

        question5.setQuestion("What is the sign of S?");
        question5.setPic1(R.drawable.a);
        question5.setPic2(R.drawable.s);
        question5.setPic3(R.drawable.c);
        question5.setPic4(R.drawable.d);

        questions.add(question5);

        adapter = new QuestionsAdapter(context, questions);
        view_pager.setAdapter(adapter);
    }
}
