package com.example.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        ListView listViewCategories = findViewById(R.id.listViewCategories);

        // Список категорий
        String[] categories = {
                "Предупреждающие",
                "Приоритета",
                "Запрещающие",
                "Предписывающие",
                "Особых предписаний",
                "Информационные",
                "Сервиса",
                "Таблички",
                "Опознавательные"
        };

        // Адаптер для списка
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                categories
        );
        listViewCategories.setAdapter(adapter);

        // Обработка нажатий на элемент списка
        listViewCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Переход к экрану с деталями категории
                Intent intent = new Intent(CategoriesActivity.this, SignsActivity.class);
                intent.putExtra("category", categories[position]);
                startActivity(intent);
            }
        });
    }
}
