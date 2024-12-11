package com.example.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class VideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        // Обработчики для 8 пунктов
        findViewById(R.id.video1).setOnClickListener(v -> openDetailPage(
                "Основы ПДД",
                "Это видео поможет вам изучить основы правил дорожного движения, включая основные дорожные знаки, сигналы светофоров и правила перехода улиц. Отлично подходит для начинающих водителей.",
                "https://www.youtube.com/watch?v=ydYdA0gpFoE",
                R.drawable.back
        ));

        findViewById(R.id.video2).setOnClickListener(v -> openDetailPage(
                "Правила проезда перекрестков",
                "В этом видео подробно объясняется, как правильно проезжать различные типы перекрестков, включая регулированные и нерегулируемые. Узнайте, кто имеет преимущество на дороге, и как избежать аварийных ситуаций.",
                "https://www.youtube.com/watch?v=Z7_18yAgc88",
                R.drawable.back
        ));

        findViewById(R.id.video3).setOnClickListener(v -> openDetailPage(
                "Как правильно обгонять",
                "Этот видеурок посвящен безопасному обгону на дорогах, включая правила, которые нужно соблюдать для того, чтобы маневр прошел без происшествий. Особое внимание уделено обгону на поворотах и на трассах.",
                "https://www.youtube.com/watch?v=KuVKXH0Uv-w",
                R.drawable.back
        ));

        findViewById(R.id.video4).setOnClickListener(v -> openDetailPage(
                "Дорожные знаки",
                "В данном видео представлена информация о самых важных дорожных знаках, которые нужно знать каждому водителю. Изучите знаки, связанные с предупреждением, приоритетами и ограничениями.",
                "https://www.youtube.com/watch?v=9iEA8M5z3T8&t=572",
                R.drawable.back
        ));

        findViewById(R.id.video5).setOnClickListener(v -> openDetailPage(
                "Правила остановки и стоянки",
                "Данное видео расскажет вам о правильных правилах остановки и стоянки транспортных средств. Вы узнаете, как избежать штрафов и опасных ситуаций на дороге.",
                "https://www.youtube.com/watch?v=X0J8hfOP2NI",
                R.drawable.back
        ));

        findViewById(R.id.video6).setOnClickListener(v -> openDetailPage(
                "Скоростные ограничения",
                "В этом видео вы узнаете, как правильно соблюдать скоростные ограничения на различных дорогах, а также о штрафах и последствиях за их нарушение.",
                "https://www.youtube.com/watch?v=y5Hyrx5u83E",
                R.drawable.back
        ));

        findViewById(R.id.video7).setOnClickListener(v -> openDetailPage(
                "Пешеходы и их права",
                "В этом видео рассказывается о правах и обязанностях пешеходов на дорогах, включая переходы через дороги, а также особенности поведения вблизи пешеходных переходов.",
                "https://www.youtube.com/watch?v=83q2hnIbDtc",
                R.drawable.back
        ));

        findViewById(R.id.video8).setOnClickListener(v -> openDetailPage(
                "Первая помощь при ДТП",
                "Это видео обучит вас основам оказания первой помощи пострадавшим в ДТП. Научитесь правильно действовать в экстренных ситуациях, а также как помочь людям до приезда скорой помощи.",
                "https://www.youtube.com/watch?v=hOQHVi074I0",
                R.drawable.back
        ));

    }

    // Метод для передачи данных в VideoDetailActivity
    private void openDetailPage(String title, String description, String videoUrl,int thumbnailResId) {
        Intent intent = new Intent(this, VideoDetailActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("videoUrl", videoUrl);
        intent.putExtra("thumbnailResId",thumbnailResId);
        startActivity(intent);
    }
}
