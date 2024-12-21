package com.example.a2312500602_rafifuas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Menunda selama 3 detik sebelum pindah ke MainActivity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(splash.this, MainActivity.class);
            startActivity(intent);
            finish(); // Menutup SplashActivity agar tidak kembali
        }, 3000); // 3000 ms = 3 detik
    }
}
