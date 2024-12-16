package com.example.quizz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CategoriesDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_detail);

        // Получаем данные из Intent
        Intent intent = getIntent();
        String znaktitle = intent.getStringExtra("znaktitle");
        String znakdescription = intent.getStringExtra("znakdescription");
        int znakthumbnailResId = intent.getIntExtra("znakthumbnailResId", -1);

        // Связываем элементы интерфейса
        TextView znakTitle = findViewById(R.id.znakTitle);
        TextView znakDescription = findViewById(R.id.znakDescription);
        ImageView znakThumbnail = findViewById(R.id.znakThumbnail);
        Button backButton = findViewById(R.id.buttonPrevious1);
        Button nextButton = findViewById(R.id.buttonNext1);

        // Устанавливаем начальные данные
        znakTitle.setText(znaktitle);
        znakDescription.setText(znakdescription);
        if (znakthumbnailResId != -1) {
            znakThumbnail.setImageResource(znakthumbnailResId);
        }



    }
}