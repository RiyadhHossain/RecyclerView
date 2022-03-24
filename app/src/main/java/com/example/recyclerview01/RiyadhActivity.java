package com.example.recyclerview01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RiyadhActivity extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riyadh);

        Intent intent=getIntent();
        String name= intent.getStringExtra("name");

        textView=findViewById(R.id.text);

        textView.setText(name);
    }
}