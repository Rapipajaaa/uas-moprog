package com.example.a2312500602_rafifuas;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PenyakitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);

        // Data untuk AutoCompleteTextView
        String[] items = {
                "Flu (Influenza)", "Demam Berdarah", "Jerawat (Acne Vulgaris)", "Asma", "Anemia",
                "Skoliosis", "Diabetes Tipe 1", "Obesitas", "Depresi", "Insomnia",
                "Penyakit Jantung Bawaan", "Tifus (Demam Tifoid)", "Pneumonia", "Skabies", "Cacar Air",
                "Kecanduan Gawai", "Kanker Darah (Leukemia)", "HIV/AIDS", "Gagal Ginjal Akut", "Hepatitis B"
        };

        // Gejala awal untuk setiap penyakit
        String[] gejalaAwal = {
                "Demam ringan, pilek, sakit tenggorokan.", "Demam tinggi tiba-tiba, sakit kepala, nyeri otot.",
                "Komedo hitam/putih, kulit berminyak.", "Sesak napas ringan, batuk saat olahraga.",
                "Mudah lelah, pucat.", "Postur tubuh tidak simetris, nyeri punggung ringan.",
                "Haus berlebihan, sering buang air kecil.", "Berat badan mulai naik, nafsu makan berlebihan.",
                "Sedih terus-menerus, kehilangan minat.", "Sulit tidur, lelah saat pagi.",
                "Mudah lelah, sesak napas ringan.", "Demam ringan, sakit kepala.",
                "Demam ringan, batuk kering.", "Gatal di malam hari, bintik kecil merah.",
                "Demam, ruam kecil.", "Waktu penggunaan meningkat, sulit lepas.",
                "Mudah lelah, kulit pucat.", "Demam, pembengkakan kelenjar.",
                "Bengkak, penurunan jumlah urin.", "Mual, kelelahan."
        };

        // Gejala akhir untuk setiap penyakit
        String[] gejalaAkhir = {
                "Batuk berat, demam tinggi, lemas.", "Muncul bintik merah, pendarahan ringan, syok.",
                "Jerawat bernanah, kemerahan, bekas luka.", "Sesak berat, napas berbunyi, sulit bicara.",
                "Pusing berat, sesak napas, detak jantung cepat.", "Nyeri kronis, gangguan pernapasan.",
                "Penurunan berat badan drastis, kelelahan ekstrem.", "Sulit bergerak, nyeri sendi, hipertensi.",
                "Keinginan bunuh diri, isolasi sosial.", "Konsentrasi menurun, gangguan kesehatan umum.",
                "Pembengkakan kaki, sianosis.", "Demam tinggi, diare/konstipasi.",
                "Batuk berdahak, sesak napas berat.", "Luka akibat garukan, infeksi sekunder.",
                "Lepuhan berisi cairan, gatal parah.", "Gangguan tidur, kesehatan mental terganggu.",
                "Pendarahan, infeksi berat.", "Penurunan berat badan, infeksi oportunistik.",
                "Lelah berat, nyeri pinggang.", "Kulit kuning, urin gelap."
        };

        // Penyebab untuk setiap penyakit
        String[] penyebab = {
                "Infeksi virus influenza.", "Gigitan nyamuk Aedes aegypti yang terinfeksi virus dengue.",
                "Penyumbatan pori oleh minyak, bakteri, hormon.", "Alergi, udara dingin, aktivitas berat.",
                "Kekurangan zat besi, gangguan gizi.", "Faktor genetik, kebiasaan postur buruk.",
                "Kerusakan autoimun pada pankreas.", "Pola makan tidak sehat, kurang olahraga.",
                "Faktor genetik, tekanan hidup.", "Stres, kebiasaan buruk sebelum tidur.",
                "Faktor genetik.", "Infeksi bakteri Salmonella typhi.",
                "Infeksi bakteri, virus, jamur.", "Tungau Sarcoptes scabiei.",
                "Infeksi virus varicella-zoster.", "Kurangnya pengawasan.",
                "Mutasi genetik.", "Infeksi virus HIV.", "Dehidrasi, infeksi.",
                "Virus hepatitis B."
        };

        // Obat untuk setiap penyakit
        String[] obat = {
                "Antipiretik (paracetamol), dekongestan, istirahat, dan konsumsi cairan.",
                "Rehidrasi oral, penanganan di rumah sakit, transfusi darah jika perlu.",
                "Salep retinoid, antibiotik, pembersih wajah khusus.",
                "Inhaler bronkodilator, obat antiinflamasi.",
                "Suplemen zat besi, makanan tinggi zat besi.",
                "Fisioterapi, penggunaan brace, operasi (kasus berat).",
                "Insulin, pola makan teratur.", "Diet, olahraga rutin, konseling gizi.",
                "Psikoterapi, antidepresan (dengan resep dokter).",
                "Perbaikan kebiasaan tidur, obat tidur (jika perlu).",
                "Operasi koreksi, pengawasan dokter.", "Antibiotik, istirahat, konsumsi cairan.",
                "Antibiotik, terapi oksigen (kasus berat).", "Krim permethrin, antihistamin.",
                "Antihistamin, antivirus, lotion calamine.", "Bimbingan psikologis, pembatasan waktu layar.",
                "Kemoterapi, transplantasi sumsum tulang.", "Terapi antiretroviral (ARV).",
                "Dialisis, terapi cairan.", "Antivirus, vaksinasi untuk pencegahan."
        };

        // Referensi ke View
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        LinearLayout dynamicContentLayout = findViewById(R.id.dynamicContentLayout);
        TextView gejalaAwalTextView = findViewById(R.id.gejalaAwalTextView);
        TextView gejalaAkhirTextView = findViewById(R.id.gejalaAkhirTextView);
        TextView penyebabTextView = findViewById(R.id.penyebabTextView);
        TextView obatTextView = findViewById(R.id.obatTextView);

        // Membuat Adapter untuk AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        autoCompleteTextView.setAdapter(adapter);

        // Menampilkan dropdown saat AutoCompleteTextView diklik
        autoCompleteTextView.setOnClickListener(v -> autoCompleteTextView.showDropDown());

        // Menangani Pilihan pada AutoCompleteTextView
        autoCompleteTextView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = autoCompleteTextView.getText().toString();
            int index = java.util.Arrays.asList(items).indexOf(selectedItem);

            if (index != -1) {
                // Menampilkan data penyakit
                descriptionTextView.setText("Deskripsi: " + items[index]);
                gejalaAwalTextView.setText("Gejala Awal: " + gejalaAwal[index]);
                gejalaAkhirTextView.setText("Gejala Akhir: " + gejalaAkhir[index]);
                penyebabTextView.setText("Penyebab: " + penyebab[index]);
                obatTextView.setText("Obat: " + obat[index]);

                // Menampilkan layout tambahan
                dynamicContentLayout.setVisibility(LinearLayout.VISIBLE);
            }
        });
    }
}
