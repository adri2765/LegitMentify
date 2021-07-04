package com.example.mentifyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class info extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        button=(Button)findViewById(R.id.calendarbutton);
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                openCalendar();
            }
        });
        button = (Button) findViewById(R.id.moodbutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openMood();
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
    public void openCalendar(){
        Intent intent=new Intent(this,Calendar.class);
        startActivity(intent);
    }
    public void openMood(){
        Intent intent=new Intent(this,mood.class);
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