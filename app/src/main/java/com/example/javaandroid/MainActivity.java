package com.example.javaandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private EditText name;
    private EditText phone;
    private Button add;
    private  Adapter adapter;
    ListView listview;
    ArrayList listData=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.edt_name);
        phone=findViewById(R.id.edt_phone);
        add=findViewById(R.id.btn_add);

        add.setOnClickListener(view ->{
            if (name.getText().toString().equals("PHEA")){
                Toast.makeText(this,"Successfully",Toast.LENGTH_LONG).show();
            }
            startActivity(new Intent(MainActivity.this,NewActivity.class));

        } );

    }



}