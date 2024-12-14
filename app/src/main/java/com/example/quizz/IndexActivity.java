package com.example.quizz;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TableRow;

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

        // Привязка ScrollView и секций
        ScrollView scrollView = findViewById(R.id.scrollView); // Ваш ScrollView

        // Если это TableRow, измените тип на TableRow
        TextView historyHeader = findViewById(R.id.history_header);
        TextView typesHeader = findViewById(R.id.type_code);;
        TableRow codesHeader = findViewById(R.id.codes);
        TableRow type1Header = findViewById(R.id.type_1);
        TableRow type2Header = findViewById(R.id.type_2);
        TableRow type3_4Header = findViewById(R.id.type_3_4);
        TableRow type5Header = findViewById(R.id.type_5);

        // Обработка кликов по пунктам содержания
        findViewById(R.id.go_to_history).setOnClickListener(view -> {
            // Прокручиваем к нужному элементу
            scrollView.smoothScrollTo(0, historyHeader.getTop());
        });

        findViewById(R.id.go_to_code).setOnClickListener(view -> {
            scrollView.smoothScrollTo(0, codesHeader.getTop());
        });

        findViewById(R.id.go_to_type).setOnClickListener(view -> {
            scrollView.smoothScrollTo(0, typesHeader.getTop());
        });

        findViewById(R.id.go_to_type_1).setOnClickListener(view -> {
            scrollView.smoothScrollTo(0, type1Header.getTop());
        });

        findViewById(R.id.go_to_type_2).setOnClickListener(view -> {
            scrollView.smoothScrollTo(0, type2Header.getTop());
        });

        findViewById(R.id.go_to_type_3_4).setOnClickListener(view -> {
            scrollView.smoothScrollTo(0, type3_4Header.getTop());
        });

        findViewById(R.id.go_to_type_5).setOnClickListener(view -> {
            scrollView.smoothScrollTo(0, type5Header.getTop());
        });
    }
}