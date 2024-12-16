package com.example.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        // Найти TextView элементов по ID
        TextView cat1 = findViewById(R.id.cat1);
        TextView cat2 = findViewById(R.id.cat2);
        TextView cat3 = findViewById(R.id.cat3);
        TextView cat4 = findViewById(R.id.cat4);
        TextView cat5 = findViewById(R.id.cat5);

        // Установить обработчики кликов для каждого элемента
        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity("Предупреждающие");
            }
        });

        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity("Приоритета");
            }
        });

        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity("Запрещающие");
            }
        });

        cat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity("Предписывающие");
            }
        });

        cat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity("Особых предписаний");
            }
        });
    }

    // Метод для перехода на QuizActivity с передачей категории
    private void openQuizActivity(String category) {
        Intent intent = new Intent(CategoriesActivity.this, CategoriesDetailActivity.class);
        intent.putExtra("category", category); // Передаем выбранную категорию
        startActivity(intent);
    }
}