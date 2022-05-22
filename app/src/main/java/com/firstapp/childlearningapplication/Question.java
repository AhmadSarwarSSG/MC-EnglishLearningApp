package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Question extends AppCompatActivity implements View.OnClickListener{
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    ImageView Qimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);
        Qimage=findViewById(R.id.imageView2);
        Intent intent=getIntent();
        option1.setText(intent.getStringExtra("option1"));
        option2.setText(intent.getStringExtra("option2"));
        option3.setText(intent.getStringExtra("option3"));
        option4.setText(intent.getStringExtra("option4"));
        Qimage.setImageResource(intent.getIntExtra("picture", 99999));
        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b=(Button)view;
        Intent intent=getIntent();
        if(b.getText().toString().equals(intent.getStringExtra("Answer")))
        {
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
//          Intent intent1=new Intent(this, TestModule.class);
//          startActivity(intent1);
            finish();   ////Adding finish to remove this activity while leaving this ativity
        }
        else
        {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }
}