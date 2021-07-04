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
        setContentView(R.layout.activity_todo);
        Toolbar toolbar=(Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);

        moodim=new Integer[]{R.drawable.happy,R.drawable.meh,R.drawable.sad};

        spinner=(Spinner)findViewById(R.id.moodspin);

        MyAdapterSpinner adapter=new MyAdapterSpinner(getApplicationContext(),R.layout.item_custom,moodim);
        spinner.setAdapter(adapter);

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
    protected class MyAdapterSpinner extends ArrayAdapter {
        Integer[] Image;

        public MyAdapterSpinner(Context context, int resource, Integer[]image){
            super(context,resource);
            Image=image;
        }
        public View GetCustomView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater=getLayoutInflater();
            View view=inflater.inflate(R.layout.item_custom,parent,false);

            ImageView img=(ImageView)view.findViewById(R.id.imageView);
            img.setImageResource(Image[position]);

            return view;
        }
        @Override
        public View getDropDownView(int position, View convertView,ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }
        @Override
        public View getView(int position, View convertViewGroup parent){
            return getCustomView(position,convertView,parent);
        }
    }

}
