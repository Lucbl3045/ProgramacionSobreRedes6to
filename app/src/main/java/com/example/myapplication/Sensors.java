package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
//implements SensorEventListener
public class Sensors extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private Button Changer;
    private RecyclerView list;
    private Sensor mSensor;
    private TextView Sensorval;
    private TextView Sensorval2;
    private TextView Sensorval3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors);
        Changer = (Button) findViewById(R.id.button);
        list = (RecyclerView) findViewById(R.id.Listadodesen);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Sensorval = (TextView) findViewById(R.id.Sensorval);
        Sensorval2= (TextView) findViewById(R.id.sensroval2);
        Sensorval3 = (TextView) findViewById(R.id.Sensorval3);
        List<Sensor> deviceSensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        //float sensorVal = sensorManager.getDefaultSensor()
        if (sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null){
            mSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            sensorManager.registerListener(this, mSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
        for (Integer i= 0;i<deviceSensors.size();i++){


        }

        //boolean accelerometer;

        //accelerometer = sensorMgr.registerListener(this,sensorMgr.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //if(accelerometer)
        //{
   // };
        Changer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu_Header = new Intent(getApplicationContext(), Menu.class);
                startActivity(Menu_Header);
            }
        });
}
    @Override
    public final void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
    @Override
    public final void onSensorChanged(SensorEvent event) {
        float lux = event.values[0];
        float val2 = event.values[1];

        float val3 = event.values[2];
        Sensorval.setText("X:"+String.valueOf(Math.ceil(lux)));
        Sensorval2.setText("z:"+String.valueOf(Math.ceil(val2)));
        Sensorval3.setText("Y:"+String.valueOf(Math.ceil(val3)));

    }
}