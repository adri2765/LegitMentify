package com.example.mentifyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Calendar extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        button=(Button)findViewById(R.id.moodbutton);
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                openMood();
            }
        });
        button = (Button) findViewById(R.id.tutbutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo();
            }
        });
        button = (Button) findViewById(R.id.todobutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openTodo();
            }
        });
        button = (Button) findViewById(R.id.homebutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });
    }
    public void openMood(){
        Intent intent=new Intent(this,mood.class);
        startActivity(intent);
    }
    public void openInfo(){
        Intent intent=new Intent(this,info.class);
        startActivity(intent);
    }
    public void openTodo(){
        Intent intent=new Intent(this,todo.class);
        startActivity(intent);
    }
    public void openHome(){
        Intent intent=new Intent(this,homepage.class);
        startActivity(intent);
    }
}