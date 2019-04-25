package com.example.android.hadiahmobiledevelopment6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEditAngka1, mEditAngka2;
    private Button mButtonJumlah, mButtonKurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditAngka1 = findViewById(R.id.edit_angka1);
        mEditAngka2 = findViewById(R.id.edit_angka2);

        mButtonJumlah = findViewById(R.id.button_jumlah);
        mButtonKurang = findViewById(R.id.button_kurang);

        mButtonJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1, angka2;
                angka1 = mEditAngka1.getText().toString();
                angka2 = mEditAngka2.getText().toString();

                Double hasil = Double.parseDouble(angka1) + Double.parseDouble(angka2);
                sendToHasil(hasil);
            }
        });

        mButtonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1, angka2;
                angka1 = mEditAngka1.getText().toString();
                angka2 = mEditAngka2.getText().toString();

                Double hasil = Double.parseDouble(angka1) - Double.parseDouble(angka2);
                sendToHasil(hasil);
            }
        });
    }

    private void sendToHasil(double hasil) {
        Intent intent = new Intent(MainActivity.this, HasilActivity.class);
        intent.putExtra("Hasil", hasil);

        startActivity(intent);
    }
}
