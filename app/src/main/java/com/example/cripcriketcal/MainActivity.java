package com.example.cripcriketcal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button button5,button6;
    button5=findViewById(R.id.btnc);




    button5.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent =new Intent(this,Main2Activity.class);
            startActivity(intent);
        }
    });
    btnf.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent =new Intent(this,Main3Activity.class);
            startActivity(intent);
        }
    });




    }
