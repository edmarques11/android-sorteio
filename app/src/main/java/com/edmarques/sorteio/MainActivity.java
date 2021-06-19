package com.edmarques.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {
        TextView text = findViewById(R.id.textResult);

        Random generateNumber = new Random();
        String numberString = "O número gerado é: " + generateNumber.nextInt(11);

        text.setText(numberString);
    }
}