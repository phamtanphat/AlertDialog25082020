package com.example.alertdialog25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Order order = new Order.Builder()
                .setBreadType(BreadType.BEEF)
                .setLocation(Location.TAKE_AWAY)
                .setVegetableType(VegetableType.TOMATO)
                .build();
        Log.d("BBB", order.toString());
    }

}