package com.example.deafndumb;

public class QuestionModel {
    String question;
    int pic1;
    int pic2;
    int pic3;
    int pic4;
    String correct_ans;

    public QuestionModel(){

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPic1() {
        return pic1;
    }

    public void setPic1(int pic1) {
        this.pic1 = pic1;
    }

    public int getPic2() {
        return pic2;
    }

    public void setPic2(int pic2) {
        this.pic2 = pic2;
    }

    public int getPic3() {
        return pic3;
    }

    public void setPic3(int pic3) {
        this.pic3 = pic3;
    }

    public int getPic4() {
        return pic4;
    }

    public void setPic4(int pic4) {
        this.pic4 = pic4;
    }

    public String getCorrect_ans() {
        return correct_ans;
    }

    public void setCorrect_ans(String correct_ans) {
        this.correct_ans = correct_ans;
    }
}
