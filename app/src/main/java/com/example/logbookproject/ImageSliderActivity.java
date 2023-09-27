package com.example.logbookproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageSliderActivity extends AppCompatActivity {

    ImageView imgView;
    Button btnForward, btnBackward;
    int[] images = {R.drawable.ic_launcher_background, android.R.drawable.arrow_down_float,
            android.R.drawable.alert_light_frame, android.R.drawable.btn_star_big_off,
    android.R.drawable.btn_radio};
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);
        imgView.setImageResource(images[index]);
        btnForward = findViewById(R.id.btnForward);
        btnBackward = findViewById(R.id.btnBackward);
        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index++;
                if(index== images.length) index=0;
                imgView.setImageResource(images[index]);
            }
        });
        btnBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index --;
                if(index==-1) index= images.length-1;
                imgView.setImageResource(images[index]);
            }
        });
    }
}