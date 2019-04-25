package com.example.android.hadiahmobiledevelopment6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        TextView mTextHasil = findViewById(R.id.text_hasil);

        if (getIntent().hasExtra("Hasil")) {
            mTextHasil.setText(String.valueOf(getIntent().getDoubleExtra("Hasil", 0)));
        } else
            Toast.makeText(HasilActivity.this, "Data tidak terkirim", Toast.LENGTH_SHORT).show();
    }
}
