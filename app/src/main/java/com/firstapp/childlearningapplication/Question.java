package com.firstapp.childlearningapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Question extends AppCompatActivity{
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    ImageView Qimage;
    ListView options;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<String> alphabets=new ArrayList<String>();
        AlertDialog.Builder builder=new AlertDialog.Builder(Question.this);
        builder.setMessage("You Answer is Correct");
        builder.setTitle("Congratulations!");
        ArrayList<String> optionList=new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);
        Qimage=findViewById(R.id.imageView2);
        options=findViewById(R.id.options);
        Intent intent=getIntent();
        optionList.add(intent.getStringExtra("option1"));
        optionList.add(intent.getStringExtra("option2"));
        optionList.add(intent.getStringExtra("option3"));
        optionList.add(intent.getStringExtra("option4"));
        Qimage.setImageResource(intent.getIntExtra("picture", 99999));
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, optionList);
        options.setAdapter(arrayAdapter);
        builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        options.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(optionList.get(i).equals(intent.getStringExtra("Answer")))
                {
                    builder.show();
                }
                else {
                    Toast.makeText(Question.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}