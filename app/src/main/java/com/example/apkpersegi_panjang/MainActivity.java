package com.example.apkpersegi_panjang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etPanjang, etLebar;
    private Button btnHitung;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang = findViewById(R.id.et_panjang);
        etLebar = findViewById(R.id.et_lebar);
        btnHitung = findViewById(R.id.btn_hitung);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double panjang = Double.parseDouble(etPanjang.getText().toString());
                double lebar = Double.parseDouble(etLebar.getText().toString());
                double luas = panjang * lebar;
                double keliling = 2 * (panjang + lebar);
                tvHasil.setText("Luas: " + luas + "\nKeliling: " + keliling);
            }
        });
    }
}