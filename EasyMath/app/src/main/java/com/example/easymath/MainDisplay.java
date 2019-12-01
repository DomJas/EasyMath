package com.example.easymath;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.time.Instant;

public class MainDisplay extends AppCompatActivity {
    private Button buttonmultiplication;
    private Button buttondivision;
    private Button buttonaddition;
    private Button buttonsubtraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maindisplay);

        buttondivision = findViewById(R.id.btn_division);
        buttonmultiplication = findViewById(R.id.btn_multiplication);
        buttonaddition = findViewById(R.id.btn_addition);
        buttonsubtraction = findViewById(R.id.btn_subtraction);

        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToGame(Constants.DIVISON_GAME_TYPE);
            }

        });
        buttonmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToGame(Constants.MULTIPLICATION_GAME_TYPE);
            }
        });
        buttonaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToGame(Constants.ADDITION_GAME_TYPE);
            }
        });
        buttonsubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToGame(Constants.SUBTRACTION_GAME_TYPE);
            }
        });
    }

    private void moveToGame(int gameType) {

        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        intent.putExtra("GameType", gameType);
        startActivity((intent));

    }

}
