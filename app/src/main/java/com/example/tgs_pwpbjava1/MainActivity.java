package com.example.tgs_pwpbjava1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText celcius, fahrenheit, kelvin, reamur;
    Button konversi;

    protected float mCelcius;
    protected double mkelvin, mfahrenheit, mreamur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celcius = (EditText) findViewById(R.id.isi_celcius);
        fahrenheit = (EditText) findViewById(R.id.isi_fahrenheit);
        kelvin = (EditText) findViewById(R.id.isi_kelvin);
        reamur = (EditText) findViewById(R.id.isi_reamur);

        konversi = (Button) findViewById(R.id.konversi);

        konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCelcius = Float.parseFloat(celcius.getText().toString());

                mkelvin = mCelcius + 273.15;

                mfahrenheit = (mCelcius * 9/5) + 32;

                mreamur = mCelcius * 0.8;

                kelvin.setText(String.valueOf(mkelvin));
                fahrenheit.setText(String.valueOf(mfahrenheit));
                reamur.setText(String.valueOf(mreamur));


            }
        });
    }
}
