package com.example.mentifyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class mood extends AppCompatActivity {
    private Button button;
    Integer[] moodim;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);

        button=(Button)findViewById(R.id.calendarbutton);
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
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
