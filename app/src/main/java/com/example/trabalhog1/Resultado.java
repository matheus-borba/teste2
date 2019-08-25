package com.example.trabalhog1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView edResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        edResultado = (TextView)findViewById(R.id.edResultado);

        Intent i = getIntent();
        float media1 = i.getFloatExtra("media1", 0f);
        float media2 = i.getFloatExtra("media2", 0f);


        String msg = null;

        if(media1 > media2)
            msg = "A cerveja 1 é mais barata";
        else
            msg = "A cerveja 2 é mais barata";


        edResultado.setText(msg);
    }
}
