package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class displau extends AppCompatActivity {
    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displau);
        img=findViewById(R.id.img);
        txt=findViewById(R.id.textView);
        Intent intent=getIntent();
        txt.setText(""+intent.getStringExtra("text"));
        img.setImageResource(intent.getIntExtra("picture", 1000));
    }
}