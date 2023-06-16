package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button boton;
private TextView text;
private EditText Value1;
private EditText Value2;
private Button Changer;
private Button minus;
private Button Division;
private Button Multiplication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         boton = findViewById(R.id.Action_button);
         text = findViewById(R.id.sumValue);
        Value1 = findViewById(R.id.Value1);
        Value2 = findViewById(R.id.Value2);
        Changer = findViewById(R.id.Changer_Button);
        minus = findViewById(R.id.Minus_Button);
        Multiplication = findViewById(R.id.Mutliplied_Button);
        Division = findViewById(R.id.Divided_Button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {

                    String Sval1 = Value1.getText().toString();
                    String Sval2 = Value2.getText().toString();
                    String result_text = liable(Sval1,Sval2,"+");
                    text.setText(result_text);
                }
            });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Sval1 = Value1.getText().toString();
                String Sval2 = Value2.getText().toString();
                String result_text = liable(Sval1,Sval2,"-");
                text.setText(result_text);
            }
        });

        Changer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu_Header = new Intent(getApplicationContext(), Menu.class);
                startActivity(Menu_Header);
            }
        });
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Sval1 = Value1.getText().toString();
                String Sval2 = Value2.getText().toString();
                String result_text = liable(Sval1,Sval2,"/");
                text.setText(result_text);
            }
        });
        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Sval1 = Value1.getText().toString();
                String Sval2 = Value2.getText().toString();
                String result_text = liable(Sval1,Sval2,"*");
                text.setText(result_text);
            }
        });




    }
    public String liable(String Sval1, String Sval2, String method) {
        Integer Var;
        if (!Sval1.matches("") && !Sval2.matches("")){
            Integer Val1 = Integer.parseInt(Sval1);
            Integer Val2 = Integer.parseInt(Sval2);
            switch (method){
                case "+":
                    return String.valueOf(Val1 + Val2);
                case "-":
                    return String.valueOf(Val1-Val2);
                case "/":
                    return String.valueOf(Val1/Val2);
                case "*":
                    return String.valueOf(Val1* Val2);
            }

        }
        else {
            Toast.makeText(this, "Uno de los campos esta Incompleto", Toast.LENGTH_SHORT).show();
            return "Uno de los campos esta Incompleto";

        }
        return "Pato";


    }
}