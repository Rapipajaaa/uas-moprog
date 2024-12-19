package com.example.a2312500602_rafifuas;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PenyakitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);

        // Inisialisasi Button dan set OnClickListener untuk menampilkan AlertDialog
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> showAlert("oleh Stuart Russell dan Peter Norvig - Buku ini membahas konsep dasar kecerdasan buatan dan penerapannya."));

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> showAlert(" oleh Jiawei Han, Micheline Kamber, dan Jian Pei - Buku ini mengulas teknik dan konsep dalam data mining."));

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> showAlert(" oleh Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, dan Clifford Stein - Buku yang menjadi referensi dalam mempelajari algoritma secara mendalam."));

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> showAlert("oleh Abraham Silberschatz, Henry Korth, dan S. Sudarshan - Buku ini mencakup konsep-konsep sistem basis data."));

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(v -> showAlert(" oleh James F. Kurose dan Keith W. Ross - Buku yang digunakan sebagai referensi dalam studi jaringan komputer."));

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(v -> showAlert("oleh Erich Gamma, Richard Helm, Ralph Johnson, dan John Vlissides - Buku tentang pola desain dalam pengembangan perangkat lunak."));

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(v -> showAlert(" oleh Andrew Hunt dan David Thomas - Buku ini mengulas berbagai praktik dalam pengembangan perangkat lunak."));

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(v -> showAlert(" oleh Tom M. Mitchell - Buku ini adalah pengantar dasar tentang pembelajaran mesin."));

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(v -> showAlert("oleh Ian Sommerville - Buku referensi utama dalam studi rekayasa perangkat lunak."));

        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(v -> showAlert(" oleh Alan Dix, Janet E. Finlay, Gregory D. Abowd, dan Russell Beale - Buku tentang antarmuka pengguna dan interaksi manusia-komputer."));

        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(v -> showAlert("Jurnal terkemuka dalam bidang pengenalan pola dan kecerdasan mesin."));

        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(v -> showAlert("Jurnal yang mengulas berbagai topik terkait ilmu komputer dan teknologi."));

        Button button13 = findViewById(R.id.button13);
        button13.setOnClickListener(v -> showAlert(" Jurnal yang mempublikasikan penelitian di bidang kecerdasan buatan."));

        Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(v -> showAlert(" Jurnal yang membahas penelitian terbaru di bidang computer vision."));

        Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(v -> showAlert(" Jurnal yang membahas penelitian terbaru di bidang computer vision."));
    }

    // Metode untuk menampilkan AlertDialog
    private void showAlert(String message) {
        new AlertDialog.Builder(this)
                .setTitle("Perpustakaan Khusus Dosen")
                .setMessage(message)
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .show();
    }
}