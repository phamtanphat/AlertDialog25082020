package com.example.alertdialog25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnOpen;
    int mPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Order order = new Order.Builder()
//                .setBreadType(BreadType.BEEF)
//                .setLocation(Location.TAKE_AWAY)
//                .setVegetableType(VegetableType.TOMATO)
//                .build();
//        Log.d("BBB", order.toString());
        mBtnOpen = findViewById(R.id.buttonOpen);

        mBtnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo");

                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);

                final String[] arrayAnimal = {"Cat", "Dog", "Mouse", "Pig", "Bird"};
                boolean[] arrayChecked = {false , false ,false ,false ,false};
                // single choice
//                builder.setSingleChoiceItems(arrayAnimal, -1, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int position) {
//                        mPosition = position;
//                    }
//                });

                // Multiple choice

                builder.setMultiChoiceItems(arrayAnimal, arrayChecked, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        if (isChecked){
                            Toast.makeText(MainActivity.this,"Bạn đã chọn : "+ arrayAnimal[which], Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this,"Bạn bỏ chọn : "+ arrayAnimal[which], Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                // Nút có
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (mPosition == -1) {
                            Toast.makeText(MainActivity.this, "Bạn chưa chọn con vật", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        Toast.makeText(MainActivity.this, arrayAnimal[mPosition], Toast.LENGTH_SHORT).show();
                    }
                });

                // Nút hủy
                builder.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.show();


            }
        });
    }

}