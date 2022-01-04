package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextInputEditText temp_celsius;
    private TextView resultado;
    private Button btn_calcular;
    private Button btn_limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp_celsius = findViewById(R.id.temp_celsius);
        resultado = findViewById(R.id.resultado);
        btn_calcular = findViewById(R.id.btn_calcular);
        btn_limpar = findViewById(R.id.btn_limpar);

        btn_calcular.setOnClickListener(this);
        btn_limpar.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        if (view == btn_calcular) {
            calcular();
        } else if (view == btn_limpar) {
            limpar();
        }
    }

    private void calcular() {
        int celsius = Integer.valueOf(temp_celsius.getText().toString());
        float resul = (9 * celsius + 160) / 5;
        String aux = Float.toString(resul);
        resultado.setText(aux);
    }


    private void limpar() {
        temp_celsius.setText("");
        resultado.setText("");
    }



}

