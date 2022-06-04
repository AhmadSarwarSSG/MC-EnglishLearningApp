package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class displau extends AppCompatActivity {
    ImageView img;
    TextView txt;
    TextView name;
    Button btn;
    Button speaker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displau);
        img=findViewById(R.id.img);
        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.button27);
        speaker=findViewById(R.id.button30);
        name=findViewById(R.id.Name);
        Intent intent=getIntent();
        txt.setText(""+intent.getStringExtra("text"));
        img.setImageResource(intent.getIntExtra("picture", 1000));
        name.setText(""+intent.getStringExtra("description"));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(displau.this, MainActivity.class);
//                startActivity(intent);
                finish(); //Adding finish to remove this activity while leaving this ativity
            }
        });
        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(displau.this, intent.getIntExtra("audio", 1000));
                ring.start();
            }
        });
    }
}