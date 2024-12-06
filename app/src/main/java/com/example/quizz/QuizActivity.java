package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    private ImageView photo;

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

        // Получаем список вопросов по выбранной теме
        final String getSelectedTopic = getIntent().getStringExtra("selectedTopic");
        questionsList = QuestionsBank.getQuestions(getSelectedTopic);

        // Инициализируем компоненты UI
        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);
        photo = findViewById(R.id.photoo);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        nextBtn = findViewById(R.id.nextBtn);

        // Звуковые эффекты
        mediaPlayerFail = MediaPlayer.create(this, R.raw.vix);
        mediaPlayerBack = MediaPlayer.create(this, R.raw.sound_false);
        mediaPlayerNext = MediaPlayer.create(this, R.raw.sled);
        mediaPlayerOption = MediaPlayer.create(this, R.raw.najati);
        mediaPlayerTrue = MediaPlayer.create(this, R.raw.sound_true);

        // Устанавливаем выбранную тему
        TextView selectedTopicName = findViewById(R.id.selectedTopicName);
        selectedTopicName.setText(getSelectedTopic);

        // Загружаем первый вопрос
        loadQuestion();

        // Запуск таймера
        startTimer((TextView) findViewById(R.id.timer));

        // Обработчик кнопки "Назад"
        ImageView backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> {
            quizTimer.purge();
            quizTimer.cancel();
            mediaPlayerBack.start();
            startActivity(new Intent(QuizActivity.this, MainActivity.class));
            finish();
        });

        // Обработчики выбора ответа
        option1.setOnClickListener(v -> handleOptionSelection(option1));
        option2.setOnClickListener(v -> handleOptionSelection(option2));
        option3.setOnClickListener(v -> handleOptionSelection(option3));
        option4.setOnClickListener(v -> handleOptionSelection(option4));

        // Обработчик кнопки "Далее"
        nextBtn.setOnClickListener(v -> {
            if (selectedOptionByUser.isEmpty()) {
                mediaPlayerFail.start();
                Toast.makeText(QuizActivity.this, "Пожалуйста сделайте выбор", Toast.LENGTH_SHORT).show();
            } else {
                mediaPlayerNext.start();
                changeNextQuestion();
            }
        });
    }

    private void showResults() {
        // Здесь можно будет отображать результаты теста
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
                    Intent intent = new Intent(QuizActivity.this, QuizRezults.class);
                    intent.putExtra("correct", getCorrectAnswers());
                    intent.putExtra("incorrect", getIncorrectAnswers());
                    startActivity(intent);
                    finish();
                } else {
                    seconds--;
                }

                runOnUiThread(() -> {
                    String finalMinutes = String.valueOf(totalTimeinMins);
                    String finalSeconds = String.valueOf(seconds);

                    if (finalMinutes.length() == 1) {
                        finalMinutes = "0" + finalMinutes;
                    }
                    if (finalSeconds.length() == 1) {
                        finalSeconds = "0" + finalSeconds;
                    }
                    timerTextView.setText(finalMinutes + ":" + finalSeconds);
                });
            }
        }, 1000, 1000);
    }

    private void loadQuestion() {
        // Загружаем вопрос и варианты ответов
        QuestionsList currentQuestion = questionsList.get(currentQuestionPosition);
        question.setText(currentQuestion.getQuestion());

        // Устанавливаем изображение для вопроса
        int photoResId = currentQuestion.getPhotoResourceId(this);
        if (photoResId != 0) {
            photo.setImageResource(photoResId);  // Если фото задано, показываем его
        } else {
            photo.setImageResource(R.drawable.norhoto);  // Если фото нет, показываем изображение по умолчанию
        }

        // Обновляем варианты ответов
        option1.setText(currentQuestion.getOption1());
        option2.setText(currentQuestion.getOption2());
        option3.setText(currentQuestion.getOption3());
        option4.setText(currentQuestion.getOption4());

        // Сброс стилей кнопок
        resetOptionsAppearance();
    }

    private void changeNextQuestion() {
        currentQuestionPosition++;

        if (currentQuestionPosition == questionsList.size()) {
            Intent intent = new Intent(QuizActivity.this, QuizRezults.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getIncorrectAnswers());
            startActivity(intent);
            finish();
        } else {
            selectedOptionByUser = "";
            resetOptionsAppearance();
            loadQuestion();
        }
    }

    private void resetOptionsAppearance() {
        option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
        option1.setTextColor(Color.parseColor("#1F6BB8"));

        option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
        option2.setTextColor(Color.parseColor("#1F6BB8"));

        option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
        option3.setTextColor(Color.parseColor("#1F6BB8"));

        option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
        option4.setTextColor(Color.parseColor("#1F6BB8"));
    }

    private int getCorrectAnswers() {
        int correctAnswer = 0;
        for (QuestionsList question : questionsList) {
            if (question.getUserSelectedAnswer().equals(question.getAnswer())) {
                correctAnswer++;
            }
        }
        return correctAnswer;
    }

    private int getIncorrectAnswers() {
        int incorrectAnswer = 0;
        for (QuestionsList question : questionsList) {
            if (!question.getUserSelectedAnswer().equals(question.getAnswer())) {
                incorrectAnswer++;
            }
        }
        return incorrectAnswer;
    }

    private void revealAnswer() {
        String correctAnswer = questionsList.get(currentQuestionPosition).getAnswer();

        if (option1.getText().toString().equals(correctAnswer)) {
            option1.setBackgroundResource(R.drawable.round_back_green10);
            option1.setTextColor(Color.WHITE);
        } else if (option2.getText().toString().equals(correctAnswer)) {
            option2.setBackgroundResource(R.drawable.round_back_green10);
            option2.setTextColor(Color.WHITE);
        } else if (option3.getText().toString().equals(correctAnswer)) {
            option3.setBackgroundResource(R.drawable.round_back_green10);
            option3.setTextColor(Color.WHITE);
        } else if (option4.getText().toString().equals(correctAnswer)) {
            option4.setBackgroundResource(R.drawable.round_back_green10);
            option4.setTextColor(Color.WHITE);
        }
    }

    private void soundForAnswerOption(String selectedOptionByUser) {
        String correctAnswer = questionsList.get(currentQuestionPosition).getAnswer();

        if (selectedOptionByUser.equals(correctAnswer)) {
            mediaPlayerTrue.start();
        } else {
            mediaPlayerBack.start();
        }
    }
}
