package com.example.quizz;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_index);

        // Обработка системных отступов
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Привязка ScrollView
        ScrollView scrollView = findViewById(R.id.scrollView);

        // Привязка заголовков
        TextView historyHeader = findViewById(R.id.history_header);
        TextView typesHeader = findViewById(R.id.type_code);
        TextView codesHeader = findViewById(R.id.codes);
        TextView type1Header = findViewById(R.id.type_1);
        TextView type2Header = findViewById(R.id.type_2);
        TextView type3_4Header = findViewById(R.id.type_3_4);
        TextView type5Header = findViewById(R.id.type_5);

        // Привязка кнопок и обработка кликов
        findViewById(R.id.go_to_history).setOnClickListener(view -> smoothScrollToTarget(scrollView, historyHeader));
        findViewById(R.id.go_to_code).setOnClickListener(view -> smoothScrollToTarget(scrollView, codesHeader));
        findViewById(R.id.go_to_type).setOnClickListener(view -> smoothScrollToTarget(scrollView, typesHeader));
        findViewById(R.id.go_to_type_1).setOnClickListener(view -> smoothScrollToTarget(scrollView, type1Header));
        findViewById(R.id.go_to_type_2).setOnClickListener(view -> smoothScrollToTarget(scrollView, type2Header));
        findViewById(R.id.go_to_type_3_4).setOnClickListener(view -> smoothScrollToTarget(scrollView, type3_4Header));
        findViewById(R.id.go_to_type_5).setOnClickListener(view -> smoothScrollToTarget(scrollView, type5Header));
    }

    /**
     * Метод для плавной прокрутки ScrollView к целевому элементу.
     *
     * @param scrollView ScrollView, который будет прокручиваться.
     * @param targetView Элемент, к которому нужно прокрутить.
     */
    private void smoothScrollToTarget(ScrollView scrollView, View targetView) {
        // Вычисление Y-позиции целевого элемента
        int targetY = targetView.getTop() - scrollView.getPaddingTop();
        scrollView.smoothScrollTo(0, targetY);
    }
}