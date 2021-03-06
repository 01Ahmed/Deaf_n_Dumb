package com.example.deafndumb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

public class QuestionsAdapter extends PagerAdapter {

    private Context context;
    private List<QuestionModel> questions;
    private LayoutInflater layoutInflater;

    public QuestionsAdapter(Context context, List<QuestionModel> questions) {
        this.context = context;
        this.questions = questions;
    }

    @Override
    public int getCount() {
        return questions.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.item_question, container, false);

        TextView questionText = view.findViewById(R.id.question);
        ImageView pic1 = view.findViewById(R.id.pic1);
        ImageView pic2 = view.findViewById(R.id.pic2);
        ImageView pic3 = view.findViewById(R.id.pic3);
        ImageView pic4 = view.findViewById(R.id.pic4);

        final QuestionModel question = questions.get(position);

        questionText.setText(question.getQuestion());
        pic1.setImageResource(question.getPic1());
        pic2.setImageResource(question.getPic2());
        pic3.setImageResource(question.getPic3());
        pic4.setImageResource(question.getPic4());

        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCorrectAns(question.getCorrect_ans(), "1");
            }
        });

        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCorrectAns(question.getCorrect_ans(), "2");
            }
        });

        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCorrectAns(question.getCorrect_ans(), "3");
            }
        });

        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCorrectAns(question.getCorrect_ans(), "4");
            }
        });

        container.addView(view, 0);

        return view;
    }

    private void checkCorrectAns(String correct, String choosen){
        if (correct.equals(choosen)){
            Toast.makeText(context, "Your Answer is Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Your Answer is Incorrect. Try Again!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout) object);

    }
}
