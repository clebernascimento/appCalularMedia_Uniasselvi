package com.example.appmediauniasselvi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText avaliacao1;
    private EditText avaliacao2;
    private EditText discussiva;
    private EditText avaliacaoFinal;

    private TextView textMedia;
    private TextView textmediaFinal;
    private TextView textresulatado;

    private Button limpar;
    private Button calcular;

    private double media, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avaliacao1 = findViewById(R.id.avaliacao1);
        avaliacao2 = findViewById(R.id.avaliacao2);
        discussiva = findViewById(R.id.discussiva);
        avaliacaoFinal = findViewById(R.id.avaliacaoFinal);

        textMedia = findViewById(R.id.textMedia);
        textmediaFinal = findViewById(R.id.textMedia_Final);
        textresulatado = findViewById(R.id.textResultado);

        limpar = findViewById(R.id.buttonLimpar);
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                avaliacao1.setText("");
                avaliacao2.setText("");
                discussiva.setText("");
                avaliacaoFinal.setText("");

                textMedia.setText("");
                textmediaFinal.setText("");
                textresulatado.setText("");
            }
        });

        calcular = findViewById(R.id.buttonCalcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nota1 = Double.parseDouble(avaliacao1.getText().toString());
                double nota2 = Double.parseDouble(avaliacao2.getText().toString());
                double nota3 = Double.parseDouble(discussiva.getText().toString());
                double nota4 = Double.parseDouble(avaliacaoFinal.getText().toString());

                media = ((nota1 * 1.5) + (nota2 * 1.5) + (nota3 * 4) + (nota4 * 3)) / 10;
                DecimalFormat formatar = new DecimalFormat("0.00");
                if (media <= 6.50) {
                    textMedia.setText("Média: " + formatar.format(media));
                    textmediaFinal.setText("Média: " + formatar.format(media));
                    textresulatado.setText("Reprovado !");
                    textresulatado.setTextColor(Color.RED);
                }
                if ((media >= 6.51) && (media <= 7.50)) {
                    textMedia.setText("Média: " + formatar.format(media));
                    textmediaFinal.setText("Média Final: 7.00");
                    textresulatado.setText("Aprovado !");
                    textresulatado.setTextColor(Color.BLUE);
                }
                if ((media >= 7.51) && (media < 8.00)) {
                    textMedia.setText("Média: " + formatar.format(media));
                    textmediaFinal.setText("Média Final: 7.50");
                    textresulatado.setText("Aprovado !");
                    textresulatado.setTextColor(Color.BLUE);
                }
                if ((media >= 8.00) && (media <= 8.50)) {
                    textMedia.setText("Média: " + formatar.format(media));
                    textmediaFinal.setText("Média Final: 8.00");
                    textresulatado.setText("Aprovado !");
                    textresulatado.setTextColor(Color.BLUE);
                }
                if ((media >= 8.51) && (media < 9.00)) {
                    textMedia.setText("Média: " + formatar.format(media));
                    textmediaFinal.setText("Média Final: 8.50");
                    textresulatado.setText("Aprovado !");
                    textresulatado.setTextColor(Color.BLUE);
                }
                if ((media >= 9.00) && (media <= 9.50)) {
                    textMedia.setText("Média: " + formatar.format(media));
                    textmediaFinal.setText("Média Final: 9.00");
                    textresulatado.setText("Aprovado !");
                    textresulatado.setTextColor(Color.BLUE);
                }
                if ((media >= 9.51) && (media < 10.00)) {
                    textMedia.setText("Média: " + formatar.format(media));
                    textmediaFinal.setText("Média Final: 9.50");
                    textresulatado.setText("Aprovado !");
                    textresulatado.setTextColor(Color.BLUE);
                }
                if (media == 10.00) {
                    textMedia.setText("Média: " + formatar.format(media));
                    textmediaFinal.setText("Média Final: 10.00");
                    textresulatado.setText("Aprovado !");
                    textresulatado.setTextColor(Color.BLUE);
                }
            }
        });
    }
}
