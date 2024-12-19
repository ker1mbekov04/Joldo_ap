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
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, PredZnaki.class);
                startActivity(intent);
            }
        });

        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, PriorZnak.class);
                startActivity(intent);
            }
        });

        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, ZaprZnak.class);
                startActivity(intent);
            }
        });

        cat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, PredpisZnak.class);
                startActivity(intent);
            }
        });




        cat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoriesActivity.this, OsobPedZnak.class);
                startActivity(intent);
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