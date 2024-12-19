package com.example.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TemaActivity extends AppCompatActivity {

    private TextView pack1, pack2, pack3, pack4, pack5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);

        // Инициализация текстовых элементов (тем)
        pack1 = findViewById(R.id.pack1);
        pack2 = findViewById(R.id.pack2);
        pack3 = findViewById(R.id.pack3);
        pack4 = findViewById(R.id.pack4);
        pack5 = findViewById(R.id.pack5);

        // При нажатии на каждую тему передаем выбранную тему в QuizActivity
        pack1.setOnClickListener(v -> openQuizWithTopic("Дорожные знаки"));
        pack2.setOnClickListener(v -> openQuizWithTopic("Проезд перекрестков"));
        pack3.setOnClickListener(v -> openQuizWithTopic("Дорожная разметка"));
        pack4.setOnClickListener(v -> openQuizWithTopic("Первая помощь"));
        pack5.setOnClickListener(v -> openQuizWithTopic("Движение через железнодорожные пути"));
    }

    private void openQuizWithTopic(String topic) {
        Intent intent = new Intent(TemaActivity.this, QuizActivity.class);
        intent.putExtra("selectedTopic", topic); // Передаем выбранную тему
        startActivity(intent);
    }
}