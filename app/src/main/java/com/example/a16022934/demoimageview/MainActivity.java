package com.example.a16022934.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv2 = findViewById(R.id.imageView2);
        iv3 = findViewById(R.id.imageView3);
        iv4 = findViewById(R.id.imageView4);
        iv5 = findViewById(R.id.imageView5);

        iv2.setImageResource(R.drawable.day2);
        iv3.setImageResource(R.drawable.day3);
        iv4.setImageResource(R.drawable.day4);
        iv5.setImageResource(R.drawable.day5);
    }
}
