package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private DatabaseHelper dbHelper;
    private EditText etUsername, etPassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dbHelper = new DatabaseHelper(this);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Проверяем, чтобы поля не были пустыми
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Пожалуйста, заполните все поля!", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    if (dbHelper.registerUser(username, password)) {
                        Toast.makeText(RegisterActivity.this, "Регистрация прошла успешно", Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        Toast.makeText(RegisterActivity.this, "Пользователь уже существует!", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Log.e("RegisterActivity", "Ошибка регистрации", e);
                    Toast.makeText(RegisterActivity.this, "Произошла ошибка. Попробуйте снова.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
