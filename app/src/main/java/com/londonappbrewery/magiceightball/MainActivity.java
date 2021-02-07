package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
final int[] imageArr={R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};
      final   Button askBtn= findViewById(R.id.askBtn);
      final   ImageView MagicBallImg=findViewById(R.id.imageView);
       askBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Random randomNumberGen= new Random();
               int number= randomNumberGen.nextInt(5);
               MagicBallImg.setImageResource(imageArr[number]);
           }
       });

    }
}
