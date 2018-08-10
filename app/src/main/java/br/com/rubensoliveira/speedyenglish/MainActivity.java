package br.com.rubensoliveira.speedyenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSpeedyEnglish = (Button) findViewById(R.id.btnSpeedyEnglish);
        Button btnSpeedyEnglish200 = (Button) findViewById(R.id.btnSpeedyEnglish200);
        Button btnSpeedyEnglish300 = (Button) findViewById(R.id.btnSpeedyEnglish300);
        Button btnSobre = (Button) findViewById(R.id.btnSobre);


        btnSpeedyEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TelaSpeedyEnglish.class);
                startActivity(intent);
            }
        });

        btnSpeedyEnglish200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SegundoGrupo.class);
                startActivity(intent);
            }
        });

        btnSpeedyEnglish300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TerceiroGrupo.class);
                startActivity(intent);
            }
        });


        btnSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TelaSobre.class);
                startActivity(intent);
            }
        });



    }




}
