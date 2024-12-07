package com.example.quizz;

import android.content.Context;

public class QuestionsList {

    private String photo, option1,option2,option3,option4,question,answer;
    private String userSelectedAnswer;

    public QuestionsList(String photo, String question,String option1, String option2, String option3, String option4, String answer, String userSelectedAnswer) {
        this.photo= photo;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.question = question;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getQuestion() {
        return question;
    }

    public String getPhoto() {
        return photo;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public int getPhotoResourceId(Context context) {
        if (photo != null && !photo.isEmpty()) {
            return context.getResources().getIdentifier(photo, "drawable", context.getPackageName());
        }
        return 0; // Возвращаем 0, если фото не указано
    }



}
