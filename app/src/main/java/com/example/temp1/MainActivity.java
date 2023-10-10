package com.example.temp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output1 = (TextView) findViewById(R.id.content);
        output1.setText("HEY");
        input();
    }
    private void input(){
        EditText simpleEditText = findViewById(R.id.input);
        String strValue = simpleEditText.getText().toString();
        int temp = Integer.parseInt(strValue);
        System.out.println("THIS WORKS");
//        output1 = (TextView) findViewById(R.id.content);
//        output1.setText("HEY");

        Button button1 = (Button) findViewById(R.id.celcius);
        Button button2 = (Button) findViewById(R.id.farenheit);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                farenheitToCelcius(temp);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                celciusToFarenheit(temp);
            }
        });
    }

    private void celciusToFarenheit(int celciusTemp){
        int temp0 = celciusTemp * (9/5);
        int finalTemp = temp0 + 32;
        output1.setText("this is your temp " + finalTemp);
    }

    private void farenheitToCelcius(int farenheitTemp){
        int temp0 = farenheitTemp - 32;
        int finalTemp = temp0 * (5/9);
        output1.setText("this is your temp: " + finalTemp);
    }

}