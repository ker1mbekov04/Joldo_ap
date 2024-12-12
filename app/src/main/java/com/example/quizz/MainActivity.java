package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayerNext, mediaPlayerFail, mediaPlayerOption;

    private Button startQuizBtn, btnLogout;

    private String selectedTopic = " ";

    private LinearLayout test;
    private LinearLayout testTema;
    private LinearLayout videolearn;
    private LinearLayout java;
    private LinearLayout sportLayout;
    private LinearLayout usa;
    private LinearLayout basket;
    private LinearLayout footbal;
    private LinearLayout cplus;
    TextView user;
    private SharedPreferences sharedPreferences;
    public static final String PREFS_NAME = "user_prefs";
    private static final String KEY_SELECTED_TOPIC = "selected_topic";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        startQuizBtn = findViewById(R.id.startQuizBtn);
        btnLogout = findViewById(R.id.logoutBtn);

        mediaPlayerNext = MediaPlayer.create(this, R.raw.sled);
        mediaPlayerFail = MediaPlayer.create(this, R.raw.vix);
        mediaPlayerOption = MediaPlayer.create(this, R.raw.najati);
        user = findViewById(R.id.currentUser);

        test = findViewById(R.id.testLayout);
        testTema = findViewById(R.id.testTema);
        videolearn = findViewById(R.id.sportLayout);
        java = findViewById(R.id.javaLayout);

        usa = findViewById(R.id.usa_layuot);

        SharedPreferences preferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        String username = preferences.getString("username", null);
        user.setText(username);
        loadSelectedTopic();
        // Находим элемент sportLayout по ID
        sportLayout = findViewById(R.id.sportLayout);

        // Устанавливаем обработчик клика
        sportLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаем Intent для перехода в ZnakActivity
                Intent intent = new Intent(MainActivity.this, ZnakActivity.class);

                // Передаем данные в ZnakActivity (например, изображение и описание)
                intent.putExtra("imageResId", R.drawable.p); // Замените на ваше изображение
                intent.putExtra("description", "Это описание знака"); // Описание

                // Запускаем ZnakActivity
                startActivity(intent);
            }
        });

        test.setOnClickListener(v -> setSelectedTopic("test"));

        testTema.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TemaActivity.class);
            startActivity(intent);
        });

        videolearn.setOnClickListener(v -> setSelectedTopic("sport"));

        java.setOnClickListener(v -> setSelectedTopic("java"));

        usa.setOnClickListener(v -> setSelectedTopic("usa"));

        startQuizBtn.setOnClickListener(v -> {
            if (selectedTopic.isEmpty()) {
                mediaPlayerFail.start();
                Toast.makeText(MainActivity.this, "Выберите викторину", Toast.LENGTH_SHORT).show();
            } else {
                mediaPlayerNext.start();
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("selectedTopic", selectedTopic);
                startActivity(intent);
                finish();
            }
        });

        btnLogout.setOnClickListener(v -> logout());
    }

    private void setSelectedTopic(String topic) {
        selectedTopic = topic;
        clearBorderQuizz();
        saveSelectedTopic();
        mediaPlayerOption.start();

        switch (topic) {
            case "test":
                test.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "testtema":
                testTema.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "java":
                java.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "usa":
                usa.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
        }
    }

    private void saveSelectedTopic() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_SELECTED_TOPIC, selectedTopic);
        editor.apply();
    }

    private void loadSelectedTopic() {
        selectedTopic = sharedPreferences.getString(KEY_SELECTED_TOPIC, "");

        if (!selectedTopic.isEmpty()) {
            setSelectedTopic(selectedTopic);
        }
    }

    private void logout() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        Toast.makeText(MainActivity.this, "Logged out", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void clearBorderQuizz() {
        startQuizBtn.setText(R.string.start);

        test.setBackgroundResource(R.drawable.round_back_white10);
        testTema.setBackgroundResource(R.drawable.round_back_white10);
        videolearn.setBackgroundResource(R.drawable.round_back_white10);
        java.setBackgroundResource(R.drawable.round_back_white10);

        usa.setBackgroundResource(R.drawable.round_back_white10);
    }
}
