package com.example.quizz;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class LoginActivity extends AppCompatActivity {

    private DatabaseHelper dbHelper;
    private EditText etUsername, etPassword;
    private Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        dbHelper = new DatabaseHelper(this);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        SharedPreferences preferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        String savedUsername = preferences.getString("username", null);
        String savedPassword = preferences.getString("password", null);

        if (savedUsername != null && savedPassword != null) {
            if (dbHelper.checkUser(savedUsername, savedPassword)) {
                navigateToHome();
            }
        }

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (dbHelper.checkUser(username, password)) {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("username", username);
                    editor.putString("password", password);
                    editor.apply();

                    Toast.makeText(LoginActivity.this, "Вход успешно выполнен", Toast.LENGTH_SHORT).show();
                    Log.d("SharedPref", "Content: " + preferences.getAll().toString());

                    navigateToHome();
                } else {
                    Toast.makeText(LoginActivity.this, "Вход не выполнен", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    private void navigateToHome() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}