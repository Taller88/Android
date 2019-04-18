package com.example1.user.boardexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

     Button button_trans;
    RelativeLayout RelativeLayout_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewGroup layout = (ViewGroup) findViewById(R.id.RelativeLayout_info);
        layout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RoomInfoActivity.class);
                startActivity(intent);
            }
        });

        Button button = (Button) findViewById(R.id.boardUp);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RoomInfoActivity.class);
                startActivity(intent);
            }
        });


            }
        }