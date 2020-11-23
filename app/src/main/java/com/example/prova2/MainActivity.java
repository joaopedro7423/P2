package com.example.prova2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText editName, editTextNumber;
    private Button btCadastro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editTextNumber = findViewById(R.id.editTextNumber);

        btCadastro = findViewById(R.id.btCadastro);


    }
}