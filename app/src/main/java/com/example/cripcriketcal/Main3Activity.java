package com.example.cripcriketcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Main3Activity extends AppCompatActivity {

    EditText editText;
    TextView textView2;
    ImageView imageView;
    Button button;
    DecimalFormat  formate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText=findViewById(R.id.editText);
        textView2=findViewById(R.id.textView2);
        imageView=findViewById(R.id.imageView);
        button=findViewById(R.id.button);

        textView2.setVisibility(View.GONE);
        formate=new DecimalFormat("#0.0");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty())
                    Toast.makeText(Main3Activity.this, "Please enter in sec only", Toast.LENGTH_SHORT).show();

                else

                {
                    int num = Integer.parseInt(editText.getText().toString().trim());
                    double temp = (num) + 40;
                    String ap = "The Approx temperature equals is " + formate.format(temp) + " in Fahrenheit";
                    textView2.setText(ap);
                    textView2.setVisibility(View.VISIBLE);
                }
            }

        });

    }
}