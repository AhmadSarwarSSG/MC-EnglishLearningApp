package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Enterance extends AppCompatActivity implements View.OnClickListener {
    Button Learn;
    Button Test;
    Button repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterance);
        Learn=findViewById(R.id.learn);
        Test=findViewById(R.id.test);
        repo=findViewById(R.id.repo);
        Learn.setOnClickListener(this);
        Test.setOnClickListener(this);
        repo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.learn:
                Intent intent1=new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.test:
                Intent intent2=new Intent(this, TestModule.class);
                startActivity(intent2);
                break;
            case R.id.repo:
                Uri webpage=Uri.parse("https://github.com/AhmadSarwarSSG/MC-EnglishLearningApp");
                Intent intent3=new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent3);
                break;
        }
    }
}