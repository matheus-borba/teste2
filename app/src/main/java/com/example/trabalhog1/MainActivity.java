package com.example.trabalhog1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edNota1;
    EditText edNota2;
    EditText edNota3;
    EditText edNota4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNota1 = (EditText)findViewById(R.id.edNota1);
        edNota2 = (EditText)findViewById(R.id.edNota2);
        edNota3 = (EditText)findViewById(R.id.edNota3);
        edNota4 = (EditText)findViewById(R.id.edNota4);

    }

    public void calculaMedia(View v){
        float nt_1 = Float.parseFloat(edNota1.getText().toString());
        float nt_2 = Float.parseFloat(edNota2.getText().toString());
        float nt_3 = Float.parseFloat(edNota3.getText().toString());
        float nt_4 = Float.parseFloat(edNota4.getText().toString());


        float media1 = nt_2 / nt_1;
        float media2 = nt_4 / nt_3;

        Intent i = new Intent(this, Resultado.class);
        i.putExtra("media1", media1);
        i.putExtra("media2", media2);
        startActivity(i);
    }

}
