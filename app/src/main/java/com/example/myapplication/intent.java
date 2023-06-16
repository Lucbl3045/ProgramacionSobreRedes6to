package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class intent extends AppCompatActivity {
    private Button boton;
    private TextView Text;

    private Button bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        boton = (Button) findViewById(R.id.Intent_Button);
        Text = (TextView) findViewById(R.id.Info_Text);
        bottom = (Button) findViewById(R.id.Intent_Button2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu_Header = new Intent(getApplicationContext(), Menu.class);
                startActivity(Menu_Header);

            }
        });
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent con = new Intent(Intent.ACTION_VIEW);
                con.setData(Uri.parse("http://www.google.com.ar"));
                startActivity(con);
            }
        });


       // return null;
    }
}