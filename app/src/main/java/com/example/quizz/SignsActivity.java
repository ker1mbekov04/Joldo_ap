package com.example.quizz;



import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs);

        TextView textViewCategory = findViewById(R.id.textViewCategory);
        ListView listViewSigns = findViewById(R.id.listViewSigns);

        // Получаем категорию из Intent
        String category = getIntent().getStringExtra("category");
        textViewCategory.setText(category);

        // Пример списка знаков (можно заменить реальными данными)
        String[] signs = getSignsByCategory(category);

        // Адаптер для списка
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                signs
        );
        listViewSigns.setAdapter(adapter);
    }

    // Метод для получения знаков по категории
    private String[] getSignsByCategory(String category) {
        switch (category) {
            case "Предупреждающие":
                return new String[]{"Знак 1", "Знак 2", "Знак 3"};
            case "Приоритета":
                return new String[]{"Знак A", "Знак B"};
            // Добавьте остальные категории
            default:
                return new String[]{"Нет данных"};
        }
    }
}
