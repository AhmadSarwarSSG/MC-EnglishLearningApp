package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class displau extends AppCompatActivity {
    ImageView img;
    TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displau);
        img=findViewById(R.id.img);
        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.button27);
        Intent intent=getIntent();
        txt.setText(""+intent.getStringExtra("text"));
        img.setImageResource(intent.getIntExtra("picture", 1000));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(displau.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}