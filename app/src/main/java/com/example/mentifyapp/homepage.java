package com.example.mentifyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class homepage extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        button = (Button) findViewById(R.id.todobutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openTodo();
            }
        });
        button = (Button) findViewById(R.id.calendarbutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendar();
            }
        });
        button = (Button) findViewById(R.id.tutbutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo();
            }
        });
        button = (Button) findViewById(R.id.moodbutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openMood();
            }
        });
    }
    public void openTodo(){
        Intent intent=new Intent(this,todo.class);
        startActivity(intent);
    }
    public void openCalendar(){
            Intent intent=new Intent(this,Calendar.class);
            startActivity(intent);
        }
    public void openInfo(){
        Intent intent=new Intent(this,info.class);
        startActivity(intent);
    }
    public void openMood(){
        Intent intent=new Intent(this,mood.class);
        startActivity(intent);
    }
}