package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Repository extends AppCompatActivity {

    Button repo;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository);
        repo=findViewById(R.id.button28);
        back=findViewById(R.id.button29);
        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage=Uri.parse("https://github.com/AhmadSarwarSSG/MC-EnglishLearningApp");
                Intent intent3=new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent3);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent4=new Intent(Repository.this, Enterance.class);
//                startActivity(intent4);
                finish();
            }
        });
    }
}