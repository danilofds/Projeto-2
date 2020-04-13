package com.example.baskete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pontuacaoA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt3A = (Button) findViewById(R.id.bt3);
        bt3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tresPontosA();
            }
        });

        Button bt2A = (Button) findViewById(R.id.bt2);
        bt2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doisPontosA();
            }
        });

        Button btLA = (Button) findViewById(R.id.btL);
        btLA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiroLivreA();
            }
        });


    }

    public void mostarPlacar(int pontuacaoA) {
        TextView PlacarA = (TextView) findViewById(R.id.PlacarA);
        PlacarA.setText(String.valueOf(pontuacaoA));
    }

    public void tresPontosA() {
        pontuacaoA = pontuacaoA + 3;
        mostarPlacar(pontuacaoA);
    }

    public void doisPontosA() {
        pontuacaoA = pontuacaoA + 2;
        mostarPlacar(pontuacaoA);
    }

    public void tiroLivreA() {
        pontuacaoA = pontuacaoA + 1;
        mostarPlacar(pontuacaoA);
    }
}
