package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestModule extends AppCompatActivity implements View.OnClickListener {
    Button q1;
    Button q2;
    Button q3;
    Button q4;
    Button q5;
    Button q6;
    Button q7;
    Button q8;
    Button q9;
    Button q10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_module);
        q1=findViewById(R.id.one);
        q2=findViewById(R.id.two);
        q3=findViewById(R.id.three);
        q4=findViewById(R.id.four);
        q5=findViewById(R.id.five);
        q6=findViewById(R.id.six);
        q7=findViewById(R.id.seven);
        q8=findViewById(R.id.eight);
        q9=findViewById(R.id.nine);
        q10=findViewById(R.id.ten);
        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
        q6.setOnClickListener(this);
        q7.setOnClickListener(this);
        q8.setOnClickListener(this);
        q9.setOnClickListener(this);
        q10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.one:
                Intent intent1=new Intent(this, Question.class);
                intent1.putExtra("picture", R.drawable.k);
                intent1.putExtra("option1", "C");
                intent1.putExtra("option2", "K");
                intent1.putExtra("option3", "A");
                intent1.putExtra("option4", "G");
                intent1.putExtra("Answer", "K");
                startActivity(intent1);
                break;
            case R.id.two:
                Intent intent2=new Intent(this, Question.class);
                intent2.putExtra("picture", R.drawable.e);
                intent2.putExtra("option1", "E");
                intent2.putExtra("option2", "W");
                intent2.putExtra("option3", "F");
                intent2.putExtra("option4", "A");
                intent2.putExtra("Answer", "E");
                startActivity(intent2);
                break;
            case R.id.three:
                Intent intent3=new Intent(this, Question.class);
                intent3.putExtra("picture", R.drawable.r);
                intent3.putExtra("option1", "B");
                intent3.putExtra("option2", "G");
                intent3.putExtra("option3", "F");
                intent3.putExtra("option4", "R");
                intent3.putExtra("Answer", "R");
                startActivity(intent3);
                break;
            case R.id.four:
                Intent intent4=new Intent(this, Question.class);
                intent4.putExtra("picture", R.drawable.a);
                intent4.putExtra("option1", "C");
                intent4.putExtra("option2", "G");
                intent4.putExtra("option3", "A");
                intent4.putExtra("option4", "V");
                intent4.putExtra("Answer", "A");
                startActivity(intent4);
                break;
            case R.id.five:
                Intent intent5=new Intent(this, Question.class);
                intent5.putExtra("picture", R.drawable.o);
                intent5.putExtra("option1", "G");
                intent5.putExtra("option2", "O");
                intent5.putExtra("option3", "A");
                intent5.putExtra("option4", "Q");
                intent5.putExtra("Answer", "O");
                startActivity(intent5);
                break;
            case R.id.six:
                Intent intent6=new Intent(this, Question.class);
                intent6.putExtra("picture", R.drawable.i);
                intent6.putExtra("option1", "P");
                intent6.putExtra("option2", "C");
                intent6.putExtra("option3", "A");
                intent6.putExtra("option4", "I");
                intent6.putExtra("Answer", "I");
                startActivity(intent6);
                break;
            case R.id.seven:
                Intent intent7=new Intent(this, Question.class);
                intent7.putExtra("picture", R.drawable.q);
                intent7.putExtra("option1", "Q");
                intent7.putExtra("option2", "G");
                intent7.putExtra("option3", "A");
                intent7.putExtra("option4", "R");
                intent7.putExtra("Answer", "Q");
                startActivity(intent7);
                break;
            case R.id.eight:
                Intent intent8=new Intent(this, Question.class);
                intent8.putExtra("picture", R.drawable.d);
                intent8.putExtra("option1", "D");
                intent8.putExtra("option2", "K");
                intent8.putExtra("option3", "A");
                intent8.putExtra("option4", "P");
                intent8.putExtra("Answer", "D");
                startActivity(intent8);
                break;
            case R.id.nine:
                Intent intent9=new Intent(this, Question.class);
                intent9.putExtra("picture", R.drawable.h);
                intent9.putExtra("option1", "E");
                intent9.putExtra("option2", "I");
                intent9.putExtra("option3", "P");
                intent9.putExtra("option4", "H");
                intent9.putExtra("Answer", "H");
                startActivity(intent9);
                break;
            case R.id.ten:
                Intent intent10=new Intent(this, Question.class);
                intent10.putExtra("picture", R.drawable.m);
                intent10.putExtra("option1", "Q");
                intent10.putExtra("option2", "M");
                intent10.putExtra("option3", "N");
                intent10.putExtra("option4", "R");
                intent10.putExtra("Answer", "M");
                startActivity(intent10);
                break;
        }
    }
}