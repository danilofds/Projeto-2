package com.example.baskete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pontuacaoA = 0;
    private int pontuacaoB = 0;

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

        Button bt3B = (Button) findViewById(R.id.bt3b);
        bt3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tresPontosB();
            }
        });

        Button bt2B = (Button) findViewById(R.id.bt2b);
        bt2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doisPontosB();
            }
        });

        Button btLB = (Button) findViewById(R.id.btLb);
        btLB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiroLivreB();
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

    public void mostarPlacarB(int pontuacaoB) {
        TextView PlacarB = (TextView) findViewById(R.id.PlacarB);
        PlacarB.setText(String.valueOf(pontuacaoB));
    }

    public void tresPontosB() {
        pontuacaoB = pontuacaoB + 3;
        mostarPlacarB(pontuacaoB);
    }

    public void doisPontosB() {
        pontuacaoB = pontuacaoB + 2;
        mostarPlacarB(pontuacaoB);
    }

    public void tiroLivreB() {
        pontuacaoB = pontuacaoB + 1;
        mostarPlacarB(pontuacaoB);
    }
}
