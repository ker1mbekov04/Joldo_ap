package com.example.quizz;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ZnakActivity extends AppCompatActivity {

    // Массивы данных для знаков
    private int[] signImages = {
            R.drawable.p, // Замените на ваши ресурсы
            R.drawable.a,
            R.drawable.b
    };
    private String[] signDescriptions = {
            "Описание знака 1: Пешеходный переход...",
            "Описание знака 2: Главная дорога...",
            "Описание знака 3: Уступи дорогу..."
    };

    private int currentIndex = 0; // Текущий индекс знака

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_znak);

        // Находим элементы
        ImageView imageViewSignDetail = findViewById(R.id.imageViewSignDetail);
        TextView textViewSignDescription = findViewById(R.id.textViewSignDescription);
        Button buttonPrevious = findViewById(R.id.buttonPrevious);
        Button buttonNext = findViewById(R.id.buttonNext);

        // Отображаем первый знак
        updateSignContent(imageViewSignDetail, textViewSignDescription);

        // Обработчик кнопки "Назад"
        buttonPrevious.setOnClickListener(v -> {
            if (currentIndex > 0) {
                currentIndex--;
                updateSignContent(imageViewSignDetail, textViewSignDescription);
            }
        });

        // Обработчик кнопки "Вперед"
        buttonNext.setOnClickListener(v -> {
            if (currentIndex < signImages.length - 1) {
                currentIndex++;
                updateSignContent(imageViewSignDetail, textViewSignDescription);
            }
        });
    }

    // Метод для обновления содержимого на экране
    private void updateSignContent(ImageView imageView, TextView textView) {
        imageView.setImageResource(signImages[currentIndex]);
        textView.setText(signDescriptions[currentIndex]);
    }
}
