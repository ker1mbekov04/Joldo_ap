package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class QuizRezults extends AppCompatActivity {

    MediaPlayer mediaPlayerNext, mediaPlayerFail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_rezults);

        mediaPlayerNext = MediaPlayer.create(this, R.raw.najati);
        mediaPlayerFail = MediaPlayer.create(this, R.raw.vix);
        final AppCompatButton startNewQuizBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswears = findViewById(R.id.correctAnswears);
        final TextView incorrectAnswears = findViewById(R.id.incorrectAnswears);
        final TextView otvet = findViewById(R.id.otvet);

        // Найдите текстовые поля для баллов и процента
        final TextView scoreText = findViewById(R.id.scoreText);
        final TextView percentageText = findViewById(R.id.percentageText);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getInCorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        // Вычисляем общее количество вопросов
        int totalQuestions = getCorrectAnswers + getInCorrectAnswers;

        // Вычисляем процент правильных ответов
        double percentage = (double) getCorrectAnswers / totalQuestions * 100;

        // Отображаем результаты
        correctAnswears.setText("Количество верных ответов: " + getCorrectAnswers);
        incorrectAnswears.setText("Количество неверных ответов: " + getInCorrectAnswers);

        // Отображаем баллы и процент
        scoreText.setText("Баллы: " + getCorrectAnswers); // Отображаем количество правильных ответов как баллы
        percentageText.setText("Процент: " + String.format("%.2f", percentage) + "%"); // Отображаем процент с двумя знаками после запятой

        // Проверка по баллам и процентам
        if (getCorrectAnswers >= 18 && percentage >= 90) {
            // Если правильных ответов больше или равно 5 и процент правильных ответов больше или равен 70%
            // выполняем соответствующее действие
            // например, показываем сообщение о том, что пользователь прошел тест
            otvet.setText("Тест пройден ");
        } else {
            // Если не выполнены условия, показываем сообщение о неудаче или выполняем другие действия
            otvet.setText("Тест не пройден ");
        }

        startNewQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerNext.start();
                startActivity(new Intent(QuizRezults.this, MainActivity.class));
                finish();
            }
        });

    }
}