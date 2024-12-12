package com.example.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ZnakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_znak);

        // Получаем ссылки на ImageView и TextView
        ImageView imageViewSignDetail = findViewById(R.id.imageViewSignDetail);
        TextView textViewSignDescription = findViewById(R.id.textViewSignDescription);

        // Получаем Intent и извлекаем переданные данные
        Intent intent = getIntent();
        int imageResId = intent.getIntExtra("imageResId", R.drawable.p); // Используйте значение по умолчанию
        String description = intent.getStringExtra("description");

        // Устанавливаем полученные данные в соответствующие элементы
        imageViewSignDetail.setImageResource(imageResId);
        textViewSignDescription.setText(description);
    }
}
