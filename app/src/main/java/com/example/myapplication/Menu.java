package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class Menu extends AppCompatActivity {
    private Button TextBoxes_Button;
    private Button Header_Button;
    private Button Calculator_Button;
    private Button Sensors_Button;
    private Button Login_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Calculator_Button = (Button) findViewById(R.id.Calculator_Button);
        Sensors_Button = (Button) findViewById(R.id.Sensors_Activity_Button);
        Header_Button = (Button) findViewById(R.id.header_Activity_Button);
        Login_Button = (Button) findViewById(R.id.Login_Activity_Button);
        TextBoxes_Button = (Button) findViewById(R.id.Texts_Activity_Button);
        Calculator_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Calc = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Calc);
            }
        });
        Sensors_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Calc = new Intent(getApplicationContext(), Sensors.class);
                startActivity(Calc);
            }
        });
        Header_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Calc = new Intent(getApplicationContext(), intent.class);
                startActivity(Calc);
            }
        });
        Login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Calc = new Intent(getApplicationContext(), Login.class);
                startActivity(Calc);
            }
        });
        TextBoxes_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Noide = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(Noide);
            }
        });

    }
    private void changing_page(String Activity ) {

        //list<Class> = new ArrayList<Class>(5);
    }
}