package com.example.quizz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class VideoDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detail);

        // Получение данных из Intent
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        String videoUrl = intent.getStringExtra("videoUrl");
        int thumbnailResId = getIntent().getIntExtra("thumbnailResId", -1);  // Получаем id ресурса изображения


        // Установка данных в элементы интерфейса
        TextView videoTitle = findViewById(R.id.videoTitle);
        TextView videoDescription = findViewById(R.id.videoDescription);
        Button watchVideoButton = findViewById(R.id.watchVideoButton);
        ImageView videoThumbnail = findViewById(R.id.videoThumbnail);

        videoTitle.setText(title);
        videoDescription.setText(description);
        videoThumbnail.setImageResource(thumbnailResId);

        // Обработчик нажатия на кнопку "Смотреть видео"
        watchVideoButton.setOnClickListener(v -> {
            Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl));
            startActivity(youtubeIntent);
        });
    }
}
