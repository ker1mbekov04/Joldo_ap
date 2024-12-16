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



    }

    // Метод для передачи данных в VideoDetailActivity
    private void openDetailPage(String title, String description, String videoUrl,int thumbnailResId) {
        Intent intent = new Intent(this, CategoriesDetailActivity.class);
        intent.putExtra("znaktitle", title);
        intent.putExtra("znakdescription", description);
        intent.putExtra("znakthumbnailResId",thumbnailResId);
        startActivity(intent);
    }

}
