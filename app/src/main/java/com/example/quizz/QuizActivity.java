
        package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {
    MediaPlayer mediaPlayerNext, mediaPlayerFail, mediaPlayerOption, mediaPlayerBack, mediaPlayerTrue;
    private TextView questions;
    private TextView question;

    private AppCompatButton option1, option2, option3, option4;
    private AppCompatButton nextBtn;

    private Timer quizTimer;

    private int seconds = 0;
    private int totalTimeinMins = 1;
    private List<QuestionsList> questionsList;

    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView selectedTopicName = findViewById(R.id.selectedTopicName);

        mediaPlayerFail = MediaPlayer.create(this, R.raw.vix);
        mediaPlayerBack = MediaPlayer.create(this, R.raw.sound_false);
        mediaPlayerNext = MediaPlayer.create(this, R.raw.sled);
        mediaPlayerOption = MediaPlayer.create(this, R.raw.najati);
        mediaPlayerTrue = MediaPlayer.create(this, R.raw.sound_true);

        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        nextBtn = findViewById(R.id.nextBtn);

        final String getSelectedTopic = getIntent().getStringExtra("selectedTopic");

        selectedTopicName.setText(getSelectedTopic);

        questionsList = QuestionsBank.getQuestions(getSelectedTopic);
        startTimer(timer);

        questions.setText((currentQuestionPosition + 1) + "/" + questionsList.size());
        question.setText(questionsList.get(0).getQuestion());
        option1.setText(questionsList.get(0).getOption1());
        option2.setText(questionsList.get(0).getOption2());
        option3.setText(questionsList.get(0).getOption3());
        option4.setText(questionsList.get(0).getOption4());

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizTimer.purge();
                quizTimer.cancel();
                mediaPlayerBack.start();
                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleOptionSelection(option1);
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleOptionSelection(option2);
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleOptionSelection(option3);
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleOptionSelection(option4);
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    mediaPlayerFail.start();
                    Toast.makeText(QuizActivity.this, "Пожалуйста сделаете выбор", Toast.LENGTH_SHORT).show();
                } else {
                    mediaPlayerNext.start();
                    changeNextQuestion();
                }
            }
        });
    }

    private void handleOptionSelection(AppCompatButton option) {
        if (selectedOptionByUser.isEmpty()) {
            selectedOptionByUser = option.getText().toString();
            option.setBackgroundResource(R.drawable.round_back_red10);
            option.setTextColor(Color.WHITE);
            revealAnswer();
            questionsList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
            soundForAnswerOption(selectedOptionByUser);
            if (!selectedOptionByUser.equals(questionsList.get(currentQuestionPosition).getAnswer())) {
                Toast.makeText(QuizActivity.this, "Повторите тему", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void startTimer(TextView timerTextView) {
        quizTimer = new Timer();
        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (seconds == 0) {
                    totalTimeinMins--;
                    seconds = 59;
                } else if (seconds == 0 && totalTimeinMins == 0) {
                    quizTimer.purge();
                    quizTimer.cancel();

                    Toast.makeText(QuizActivity.this, "Время вышло", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this, QuizRezults.class);
                    intent.putExtra("correct", getCorrectAnswers());
                    intent.putExtra("incorrect", getIncorrectAnswers());

                    startActivity(intent);
                    finish();
                } else {
                    seconds--;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String finalMinutes = String.valueOf(totalTimeinMins);
                        String finalSeconds = String.valueOf(seconds);

                        if (finalMinutes.length() == 1) {
                            finalMinutes = "0" + finalMinutes;
                        }
                        if (finalSeconds.length() == 1) {
                            finalSeconds = "0" + finalSeconds;
                        }
                        timerTextView.setText(finalMinutes + ":" + finalSeconds);
                    }
                });
            }
        }, 1000, 1000);
    }

    private int getCorrectAnswers() {
        int correctAnswer = 0;
        for (int i = 0; i < questionsList.size(); i++) {
            final String getUserSelectedAnswer = questionsList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswer++;
            }
        }
        return correctAnswer;
    }

    private int getIncorrectAnswers() {
        int incorrectAnswer = 0;
        for (int i = 0; i < questionsList.size(); i++) {
            final String getUserSelectedAnswer = questionsList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();

            if (!getUserSelectedAnswer.equals(getAnswer)) {
                incorrectAnswer++;
            }
        }
        return incorrectAnswer;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        quizTimer.purge();
        quizTimer.cancel();
        mediaPlayerBack.start();
        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }

    private void revealAnswer() {
        final String getAnswer = questionsList.get(currentQuestionPosition).getAnswer();

        if (option1.getText().toString().equals(getAnswer)) {
            option1.setBackgroundResource(R.drawable.round_back_green10);
            option1.setTextColor(Color.WHITE);
        } else if (option2.getText().toString().equals(getAnswer)) {
            option2.setBackgroundResource(R.drawable.round_back_green10);
            option2.setTextColor(Color.WHITE);
        } else if (option3.getText().toString().equals(getAnswer)) {
            option3.setBackgroundResource(R.drawable.round_back_green10);
            option3.setTextColor(Color.WHITE);
        } else if (option4.getText().toString().equals(getAnswer)) {
            option4.setBackgroundResource(R.drawable.round_back_green10);
            option4.setTextColor(Color.WHITE);
        }
    }

    private void changeNextQuestion() {
        currentQuestionPosition++;

        if ((currentQuestionPosition + 1) == questionsList.size()) {
            nextBtn.setText("Готово");
        }
        if (currentQuestionPosition < questionsList.size()) {
            selectedOptionByUser = "";

            option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option1.setTextColor(Color.parseColor("#1F6BB8"));

            option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option2.setTextColor(Color.parseColor("#1F6BB8"));

            option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option4.setTextColor(Color.parseColor("#1F6BB8"));

            questions.setText((currentQuestionPosition + 1) + "/" + questionsList.size());
            question.setText(questionsList.get(currentQuestionPosition).getQuestion());
            option1.setText(questionsList.get(currentQuestionPosition).getOption1());
            option2.setText(questionsList.get(currentQuestionPosition).getOption2());
            option3.setText(questionsList.get(currentQuestionPosition).getOption3());
            option4.setText(questionsList.get(currentQuestionPosition).getOption4());
        } else {
            Intent intent = new Intent(QuizActivity.this, QuizRezults.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getIncorrectAnswers());
            startActivity(intent);
            finish();
        }
    }

    private void soundForAnswerOption(String selectedOptionByUser) {
        final String getAnswer = questionsList.get(currentQuestionPosition).getAnswer();

        if (selectedOptionByUser.equals(getAnswer)) {
            mediaPlayerTrue.start();
        } else {
            mediaPlayerBack.start();
        }
    }
}
