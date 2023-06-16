package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button Changer;
    private Button MainI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Changer = (Button) findViewById(R.id.Back_button);
        Changer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu_Header = new Intent(getApplicationContext(), Menu.class);
                startActivity(Menu_Header);

            }
        });
       // return null;
    }


}