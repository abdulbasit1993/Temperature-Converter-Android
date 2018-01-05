package com.abdulbasit.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Cel_input;
    EditText Fah_input;
    Button Fah;
    Button Celsius;
    TextView FahRes;
    TextView CelRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cel_input = (EditText) findViewById(R.id.etCel);
        Fah_input = (EditText) findViewById(R.id.etFah);
        Fah = (Button) findViewById(R.id.btFah);
        Celsius = (Button) findViewById(R.id.btCel);
        FahRes = (TextView) findViewById(R.id.tvFah);
        CelRes = (TextView) findViewById(R.id.tvCelsius);

        Fah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double celTemp = Double.parseDouble(Cel_input.getText().toString());
                double FahTemp = celTemp * 9 / 5 + 32;;

                String Fah = Double.toString(FahTemp);
                FahRes.setText(Fah);
            }
        });

        Celsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double fahr = Double.parseDouble(Fah_input.getText().toString());
                double cels = (fahr - 32) * 5 / 9;

                String Cel = Double.toString(cels);
                CelRes.setText(Cel);
            }
        });
    }
}
