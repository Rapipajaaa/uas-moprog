package com.example.a2312500602_rafifuas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultBMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_bmi);

        // Inisialisasi View
        TextView bmiValueText = findViewById(R.id.bmiValueText);
        TextView bmiCategoryText = findViewById(R.id.bmiCategoryText);
        TextView ageText = findViewById(R.id.ageText);
        TextView genderText = findViewById(R.id.genderText);
        Button backButton = findViewById(R.id.backButton);

        // Ambil data dari Intent
        String bmiValue = getIntent().getStringExtra("bmi_value");
        String bmiCategory = getIntent().getStringExtra("bmi_category");
        int age = getIntent().getIntExtra("age", 0);
        String gender = getIntent().getStringExtra("gender");

        // Validasi data agar tidak null
        bmiValueText.setText("BMI Value: " + (bmiValue != null ? bmiValue : "N/A"));
        bmiCategoryText.setText("Category: " + (bmiCategory != null ? bmiCategory : "N/A"));
        ageText.setText("Age: " + (age > 0 ? age : "N/A"));
        genderText.setText("Gender: " + (gender != null ? gender : "N/A"));

        // Tombol Kembali
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kembali ke MainActivity
                Intent intent = new Intent(ResultBMI.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup ResultBMI agar tidak kembali ke sini
            }
        });
    }
}
