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

    private LinearLayout kgz;
    private LinearLayout globus;
    private LinearLayout sport;
    private LinearLayout java;

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

        kgz = findViewById(R.id.kgzLayout);
        globus = findViewById(R.id.globusLayout);
        sport = findViewById(R.id.sportLayout);
        java = findViewById(R.id.javaLayout);

        usa = findViewById(R.id.usa_layuot);
        basket = findViewById(R.id.basket_layout);
        footbal = findViewById(R.id.footbal_layout);
        cplus = findViewById(R.id.c_layout);
        SharedPreferences preferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        String username = preferences.getString("username", null);
        user.setText(username);
        loadSelectedTopic();

        kgz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedTopic("kgz");
            }
        });

        globus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedTopic("globus");
            }
        });

        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedTopic("sport");
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedTopic("java");
            }
        });

        usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedTopic("usa");
            }
        });

        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedTopic("basket");
            }
        });

        footbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedTopic("footbal");
            }
        });

        cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedTopic("cplus");
            }
        });

        startQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
                Log.d("SharedPreferences", "Content after clearing: " + sharedPreferences.getAll().toString());

            }
        });



    }

    private void setSelectedTopic(String topic) {
        selectedTopic = topic;
        clearBorderQuizz();
        saveSelectedTopic();
        mediaPlayerOption.start();

        switch (topic) {
            case "kgz":
                kgz.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "globus":
                globus.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "sport":
                sport.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "java":
                java.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "usa":
                usa.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "basket":
                basket.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "footbal":
                footbal.setBackgroundResource(R.drawable.round_back_white_stroke10);
                break;
            case "cplus":
                cplus.setBackgroundResource(R.drawable.round_back_white_stroke10);
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

        kgz.setBackgroundResource(R.drawable.round_back_white10);
        globus.setBackgroundResource(R.drawable.round_back_white10);
        sport.setBackgroundResource(R.drawable.round_back_white10);
        java.setBackgroundResource(R.drawable.round_back_white10);

        usa.setBackgroundResource(R.drawable.round_back_white10);
        basket.setBackgroundResource(R.drawable.round_back_white10);
        footbal.setBackgroundResource(R.drawable.round_back_white10);
        cplus.setBackgroundResource(R.drawable.round_back_white10);
    }
}
