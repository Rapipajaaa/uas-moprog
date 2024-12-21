package com.example.a2312500602_rafifuas;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PenyakitActivity extends AppCompatActivity {

    private String selectedDescription;
    private String selectedDeskripsi;
    private String selectedGejala;
    private String selectedPenyebab;
    private String selectedObat;

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

        // Deskripsi untuk setiap penyakit
        String[] deskripsi = {
                "Flu atau influenza adalah infeksi virus yang menyerang hidung, tenggorokan, dan paru-paru. Penyakit ini mudah menular melalui droplet dari bersin atau batuk, dengan gejala seperti demam, pilek, sakit tenggorokan, dan batuk.",
                "Demam berdarah adalah infeksi virus yang menular melalui gigitan nyamuk Aedes aegypti. Penyakit ini ditandai dengan demam tinggi, sakit kepala, nyeri otot dan sendi, serta ruam kulit.",
                "Jerawat adalah kondisi kulit kronis yang disebabkan oleh penyumbatan pori-pori oleh minyak, sel kulit mati, dan bakteri. Gejalanya meliputi munculnya komedo, papul, atau pustul yang terkadang menyebabkan peradangan.",
                "Asma adalah penyakit pernapasan kronis yang ditandai dengan peradangan dan penyempitan saluran napas. Gejala utamanya meliputi sesak napas, batuk, dan napas berbunyi (mengi).",
                "Anemia adalah kondisi kekurangan hemoglobin atau sel darah merah dalam tubuh, yang menyebabkan tubuh kekurangan oksigen. Gejala umum meliputi lemas, pucat, dan pusing.",
                "Skoliosis adalah kelainan pada tulang belakang yang melengkung ke samping berbentuk huruf C atau S. Kondisi ini biasanya terdeteksi saat masa pertumbuhan anak-anak atau remaja.",
                "Diabetes tipe 1 adalah penyakit autoimun yang merusak sel penghasil insulin di pankreas, menyebabkan kadar gula darah meningkat. Penyakit ini sering menyerang anak-anak dan remaja.",
                "Obesitas adalah kondisi kelebihan berat badan akibat penumpukan lemak tubuh yang berlebihan. Obesitas dapat meningkatkan risiko berbagai penyakit kronis seperti diabetes dan hipertensi.",
                "Depresi adalah gangguan suasana hati yang ditandai dengan perasaan sedih terus-menerus, kehilangan minat, dan gangguan pada aktivitas sehari-hari. Gejala dapat mencakup kelelahan, gangguan tidur, dan pikiran negatif.",
                "Insomnia adalah gangguan tidur yang menyebabkan seseorang kesulitan untuk tidur, sering terbangun di malam hari, atau bangun terlalu dini. Kondisi ini dapat menyebabkan kelelahan dan gangguan konsentrasi.",
                "Penyakit jantung bawaan adalah kelainan pada struktur dan fungsi jantung yang sudah ada sejak lahir. Kelainan ini dapat memengaruhi aliran darah ke dan dari jantung.",
                "Tifus adalah infeksi bakteri pada saluran pencernaan yang menyebabkan demam tinggi, sakit kepala, dan gangguan pencernaan. Penyakit ini sering menyebar melalui makanan atau minuman yang terkontaminasi.",
                "Pneumonia adalah infeksi saluran pernapasan bawah yang menyebabkan peradangan pada kantong udara di paru-paru. Penyakit ini sering ditandai dengan batuk berdahak, demam, dan sesak napas.",
                "Skabies atau kudis adalah penyakit kulit menular yang disebabkan oleh infestasi tungau Sarcoptes scabiei. Gejalanya meliputi rasa gatal parah, terutama pada malam hari, dan ruam kulit.",
                "Cacar air adalah infeksi virus varicella zoster yang menyebabkan ruam kulit berupa bintik merah yang berubah menjadi lepuhan berisi cairan. Penyakit ini sangat menular dan umum terjadi pada anak-anak.",
                "Kecanduan gawai adalah kondisi di mana seseorang mengalami ketergantungan berlebihan pada perangkat elektronik, sehingga mengganggu aktivitas sehari-hari dan kesehatan mental.",
                "Leukemia adalah jenis kanker darah yang memengaruhi produksi dan fungsi sel darah putih di sumsum tulang. Penyakit ini ditandai dengan kelelahan, infeksi berulang, dan mudah berdarah.",
                "HIV/AIDS adalah infeksi virus HIV yang menyerang sistem kekebalan tubuh, khususnya sel CD4. Jika tidak diobati, HIV dapat berkembang menjadi AIDS, tahap akhir infeksi HIV yang melemahkan tubuh secara parah.",
                "Gagal ginjal akut adalah kondisi di mana ginjal tiba-tiba kehilangan kemampuan untuk menyaring limbah dari darah, menyebabkan penumpukan racun dan gangguan cairan serta elektrolit.",
                "Hepatitis B adalah infeksi virus yang menyerang hati. Penyakit ini dapat menjadi kronis dan menyebabkan komplikasi serius seperti sirosis dan kanker hati."
        };


        // Gejala untuk setiap penyakit
        String[] gejala = {
                "Gejala flu meliputi demam, sakit kepala, pilek, hidung tersumbat, sakit tenggorokan, dan batuk. Gejala ini muncul tiba-tiba dan dapat disertai rasa lemas serta nyeri otot.",
                "Gejala utama demam berdarah adalah demam tinggi mendadak yang sulit turun, sakit kepala, nyeri pada bagian belakang mata, nyeri otot dan sendi, lemas, hilang nafsu makan, mual, muntah, dan munculnya bintik merah pada kulit.",
                "Jerawat ditandai dengan munculnya komedo, papula, pustula, nodul, atau kista pada wajah, leher, punggung, atau dada. Gejala lainnya meliputi kulit berminyak, kemerahan, dan terkadang nyeri akibat peradangan.",
                "Gejala asma meliputi sesak napas, batuk terutama pada malam hari atau setelah olahraga, dan napas berbunyi (mengi). Pada kasus yang parah, gejala dapat mencakup kesulitan bernapas berat.",
                "Gejala anemia mencakup mudah lelah, lemas, kulit pucat, sesak napas, pusing, dan detak jantung tidak teratur. Pada kasus yang berat, dapat terjadi kesulitan berkonsentrasi dan tangan serta kaki terasa dingin.",
                "Gejala skoliosis meliputi bahu atau pinggul yang tampak tidak sejajar, postur tubuh tidak simetris, dan nyeri punggung. Pada kasus yang parah, dapat menyebabkan kesulitan bernapas.",
                "Gejala diabetes tipe 1 meliputi rasa haus yang berlebihan, sering buang air kecil, penurunan berat badan yang tidak dijelaskan, kelelahan, dan pandangan kabur.",
                "Gejala obesitas meliputi peningkatan berat badan yang signifikan, kesulitan bergerak, kelelahan, nyeri sendi, dan sering merasa lapar. Pada kasus yang berat, obesitas dapat menyebabkan gangguan tidur seperti sleep apnea.",
                "Gejala depresi meliputi perasaan sedih atau kosong yang berkepanjangan, kehilangan minat atau kesenangan dalam aktivitas yang biasa dinikmati, perubahan pola tidur dan makan, kelelahan, serta pikiran untuk menyakiti diri sendiri.",
                "Gejala insomnia meliputi kesulitan memulai tidur, sering terbangun di malam hari, bangun terlalu dini, dan merasa lelah atau tidak segar setelah tidur. Kondisi ini juga dapat menyebabkan gangguan konsentrasi.",
                "Gejala penyakit jantung bawaan meliputi sesak napas, mudah lelah saat aktivitas fisik, sianosis (warna kebiruan pada kulit dan bibir), pertumbuhan yang lambat, dan pembengkakan pada tungkai atau perut.",
                "Gejala tifus meliputi demam yang naik turun, nyeri perut, mual, muntah, diare atau konstipasi, sakit kepala, dan tubuh terasa lemas. Pada beberapa kasus, muncul ruam pada kulit.",
                "Gejala pneumonia meliputi batuk berdahak, demam, menggigil, sesak napas, nyeri dada saat bernapas atau batuk, kelelahan, dan kadang-kadang mual, muntah, atau diare.",
                "Gejala skabies meliputi rasa gatal parah terutama di malam hari, munculnya ruam atau bintik-bintik kecil merah pada kulit, dan kulit yang bersisik atau berkerak akibat garukan.",
                "Gejala cacar air meliputi demam, lemas, hilang nafsu makan, dan munculnya ruam kulit berupa bintik merah yang berkembang menjadi lepuhan berisi cairan yang terasa gatal.",
                "Gejala kecanduan gawai meliputi penggunaan gawai yang berlebihan hingga mengabaikan tanggung jawab, merasa gelisah atau marah saat tidak dapat mengakses gawai, gangguan tidur, dan penurunan interaksi sosial.",
                "Gejala leukemia meliputi kelelahan, pucat, mudah memar atau berdarah, infeksi berulang, demam, pembengkakan kelenjar getah bening, dan penurunan berat badan.",
                "Gejala HIV/AIDS meliputi demam, sakit tenggorokan, ruam kulit, kelelahan, penurunan berat badan drastis, diare kronis, dan infeksi oportunistik seperti TBC atau pneumonia.",
                "Gejala gagal ginjal akut meliputi penurunan jumlah urin, pembengkakan pada kaki, pergelangan kaki, atau wajah, kelelahan, sesak napas, kebingungan, dan pada kasus berat, koma.",
                "Gejala hepatitis B meliputi mual, muntah, kelelahan, nyeri perut bagian kanan atas, demam ringan, dan kulit serta mata yang menguning (jaundice)."
        };


        // Penyebab untuk setiap penyakit
        String[] penyebab = {
                "Flu disebabkan oleh virus influenza yang menyebar melalui droplet dari bersin atau batuk penderita. Penularan juga dapat terjadi jika seseorang menyentuh benda yang telah terkontaminasi virus dan kemudian menyentuh hidung atau mulutnya.",
                "Demam berdarah disebabkan oleh virus Dengue yang ditularkan melalui gigitan nyamuk Aedes aegypti atau Aedes albopictus yang telah terinfeksi.",
                "Jerawat disebabkan oleh penyumbatan pori-pori kulit oleh minyak berlebih, sel kulit mati, dan bakteri Propionibacterium acnes.",
                "Asma disebabkan oleh peradangan saluran napas yang dipicu oleh alergen seperti debu, serbuk sari, udara dingin, atau aktivitas berat. Faktor genetik juga berperan.",
                "Anemia disebabkan oleh kekurangan zat besi, vitamin B12, atau asam folat, serta kehilangan darah yang berlebihan akibat menstruasi atau luka.",
                "Skoliosis sering kali tidak diketahui penyebabnya (idiopatik), tetapi dapat juga disebabkan oleh kelainan bawaan, cedera, atau penyakit neuromuskular.",
                "Diabetes tipe 1 disebabkan oleh gangguan autoimun yang menyerang sel-sel penghasil insulin di pankreas, sehingga kadar gula darah tidak terkontrol.",
                "Obesitas disebabkan oleh pola makan tinggi kalori, kurang aktivitas fisik, faktor genetik, atau kondisi medis tertentu.",
                "Depresi disebabkan oleh kombinasi faktor genetik, perubahan biokimia di otak, peristiwa traumatis, dan stres berkepanjangan.",
                "Insomnia disebabkan oleh stres, kebiasaan tidur yang buruk, gangguan mental seperti depresi atau kecemasan, serta kondisi medis tertentu seperti nyeri kronis.",
                "Penyakit jantung bawaan disebabkan oleh gangguan pada proses pembentukan dan perkembangan jantung janin. Faktor risiko meliputi genetik, infeksi selama kehamilan, dan konsumsi obat-obatan tertentu.",
                "Tifus disebabkan oleh infeksi bakteri Salmonella typhi yang masuk ke dalam tubuh melalui makanan atau minuman yang terkontaminasi.",
                "Pneumonia disebabkan oleh infeksi bakteri, virus, atau jamur yang menyebabkan peradangan pada kantong udara di paru-paru.",
                "Skabies disebabkan oleh infestasi tungau Sarcoptes scabiei yang menular melalui kontak langsung dengan kulit penderita atau melalui benda yang terkontaminasi.",
                "Cacar air disebabkan oleh infeksi virus Varicella zoster yang sangat mudah menular melalui droplet dari batuk atau bersin penderita, atau kontak langsung dengan cairan lepuhan.",
                "Kecanduan gawai disebabkan oleh kurangnya pengawasan, aturan yang longgar, dan paparan berlebihan terhadap perangkat elektronik tanpa kontrol waktu.",
                "Leukemia disebabkan oleh mutasi genetik yang menyebabkan produksi sel darah putih abnormal di sumsum tulang.",
                "HIV/AIDS disebabkan oleh infeksi virus HIV yang menyerang sistem kekebalan tubuh, ditularkan melalui kontak dengan cairan tubuh seperti darah, air mani, atau cairan vagina.",
                "Gagal ginjal akut disebabkan oleh dehidrasi, infeksi berat (sepsis), cedera fisik, penggunaan obat tertentu, atau gangguan aliran darah ke ginjal.",
                "Hepatitis B disebabkan oleh infeksi virus hepatitis B yang menyebar melalui kontak dengan darah atau cairan tubuh yang terinfeksi, seperti melalui hubungan seksual atau penggunaan jarum suntik bersama."
        };


        // Obat untuk setiap penyakit
        String[] obat = {
                "Flu ringan bisa diatasi dengan banyak beristirahat, mengonsumsi makanan sehat yang mengandung vitamin C, dan minum cairan hangat. Jika gejala berat, dokter dapat meresepkan obat seperti dekongestan, antipiretik, atau antivirus tertentu.",
                "Tidak ada obat khusus untuk demam berdarah. Penanganan meliputi rehidrasi oral atau intravena, antipiretik seperti paracetamol untuk menurunkan demam, dan pemantauan ketat di rumah sakit pada kasus berat.",
                "Pengobatan jerawat meliputi penggunaan obat topikal seperti retinoid, benzoyl peroxide, atau antibiotik. Pada kasus berat, dokter dapat meresepkan antibiotik oral atau isotretinoin.",
                "Asma diobati dengan inhaler bronkodilator untuk meredakan gejala akut dan kortikosteroid inhalasi untuk pengendalian jangka panjang. Antihistamin dapat diberikan jika ada alergi.",
                "Anemia akibat kekurangan zat besi diobati dengan suplemen zat besi, konsumsi makanan tinggi zat besi seperti daging merah dan sayuran hijau, serta vitamin C untuk membantu penyerapan zat besi.",
                "Pengobatan skoliosis melibatkan penggunaan brace untuk mencegah lengkungan bertambah parah pada anak-anak. Pada kasus berat, pembedahan untuk meluruskan tulang belakang dapat diperlukan.",
                "Pengobatan diabetes tipe 1 melibatkan injeksi insulin harian, pengaturan pola makan sehat, dan pemantauan kadar gula darah secara rutin.",
                "Obesitas ditangani melalui perubahan pola makan rendah kalori, olahraga teratur, terapi perilaku, dan dalam kasus tertentu, penggunaan obat penurun berat badan atau prosedur bedah.",
                "Depresi diobati dengan psikoterapi seperti terapi perilaku kognitif, serta obat antidepresan seperti SSRI (Selective Serotonin Reuptake Inhibitor). Dukungan sosial juga sangat penting.",
                "Insomnia dapat diatasi dengan penerapan sleep hygiene, teknik relaksasi, terapi perilaku kognitif untuk insomnia (CBT-I), dan jika diperlukan, dokter dapat meresepkan obat tidur dalam jangka pendek.",
                "Pengobatan penyakit jantung bawaan tergantung pada jenis dan keparahannya. Penanganan meliputi pengawasan rutin, obat untuk membantu kerja jantung, dan pembedahan untuk memperbaiki kelainan struktural.",
                "Tifus diobati dengan antibiotik seperti ciprofloxacin atau azitromisin, istirahat yang cukup, dan menjaga hidrasi dengan minum cairan elektrolit.",
                "Pneumonia bakteri diobati dengan antibiotik seperti amoxicillin, sedangkan pneumonia virus dapat diatasi dengan perawatan suportif. Terapi oksigen diberikan pada pasien dengan sesak napas berat.",
                "Skabies diobati dengan krim permetrin yang dioleskan pada seluruh tubuh dan dibiarkan selama 8–14 jam. Antihistamin dapat diberikan untuk mengurangi rasa gatal.",
                "Cacar air biasanya sembuh sendiri dalam 1–2 minggu. Pengobatan meliputi antihistamin untuk mengurangi rasa gatal dan antivirus seperti asiklovir pada kasus berat.",
                "Kecanduan gawai diatasi dengan psikoterapi untuk mengelola perilaku, pembatasan waktu penggunaan gawai, dan dukungan dari keluarga untuk mendorong aktivitas sosial lainnya.",
                "Leukemia diobati dengan kemoterapi, terapi target, atau transplantasi sumsum tulang. Pada beberapa jenis leukemia, terapi radiasi juga dapat digunakan.",
                "HIV/AIDS diobati dengan terapi antiretroviral (ARV) yang harus diminum setiap hari untuk mengendalikan virus dan memperkuat sistem kekebalan tubuh.",
                "Gagal ginjal akut memerlukan perawatan intensif seperti pemberian cairan intravena, dialisis untuk membersihkan darah dari racun, dan pengobatan penyakit yang mendasari.",
                "Hepatitis B diobati dengan antivirus seperti tenofovir atau entecavir untuk menghambat perkembangan virus. Vaksinasi hepatitis B sangat efektif untuk pencegahan."
        };


        // Referensi ke View
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        LinearLayout dynamicContentLayout = findViewById(R.id.dynamicContentLayout);
        TextView deskripsiTextView = findViewById(R.id.deskripsiTextView);
        TextView gejalaTextView = findViewById(R.id.gejalaTextView);
        TextView penyebabTextView = findViewById(R.id.penyebabTextView);
        TextView obatTextView = findViewById(R.id.obatTextView);

        // Membuat Adapter untuk AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        autoCompleteTextView.setAdapter(adapter);

        // Menampilkan dropdown saat AutoCompleteTextView diklik
        autoCompleteTextView.setOnClickListener(v -> autoCompleteTextView.showDropDown());

        // Menangani Pilihan pada AutoCompleteTextView
        autoCompleteTextView.setOnItemClickListener((parent, view, position, id) -> {
            // Menampilkan data penyakit yang dipilih
            selectedDescription = items[position];
            selectedDeskripsi = deskripsi[position];
            selectedGejala = gejala[position];
            selectedPenyebab = penyebab[position];
            selectedObat = obat[position];

            descriptionTextView.setText(selectedDescription);
            deskripsiTextView.setText(selectedDeskripsi);
            gejalaTextView.setText(selectedGejala);
            penyebabTextView.setText(selectedPenyebab);
            obatTextView.setText(selectedObat);

            // Menampilkan layout tambahan
            dynamicContentLayout.setVisibility(LinearLayout.VISIBLE);
        });

        // Menambahkan onClick ke TextView untuk menampilkan dialog
        setOnClickAlert(descriptionTextView, "Nama Penyakit");
        setOnClickAlert(deskripsiTextView, "Deskripsi");
        setOnClickAlert(gejalaTextView, "Gejala");
        setOnClickAlert(penyebabTextView, "Penyebab");
        setOnClickAlert(obatTextView, "Obat");
    }

    // Fungsi untuk menambahkan AlertDialog ke TextView
    private void setOnClickAlert(TextView textView, String title) {
        textView.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(PenyakitActivity.this);
            builder.setTitle(title)
                    .setMessage(textView.getText().toString())
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .show();
        });
    }
}
