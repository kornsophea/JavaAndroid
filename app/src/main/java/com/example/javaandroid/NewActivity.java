package com.example.javaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class NewActivity extends AppCompatActivity {
    private EditText name;
    private EditText phone;
    private Button add;
    private  Adapter adapter;
    ListView listview;
    ArrayList listData=new ArrayList<>();
    private Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        PopulateData();
        initView();
    }
    public void initView(){
        listview = (ListView) findViewById(R.id.rec_data);
        adapter= new Adapter(NewActivity.this, listData);
        listview.setAdapter(adapter);
    }
    public void PopulateData(){

        for (int i=0;i<10;i++){

             data = new Data();
            switch (i)
            {
                case 0:
                    data.setName("PHEA");
                    data.setPhone("0111111111111");
                    break;

                case 1:
                    data.setName("PHEAZZ");
                    data.setPhone("0111115541111111");
                    break;

                case 2:
                    data.setName("PHEAXX");
                    data.setPhone("0111111555111111");
                    break;

                case 3:
                    data.setName("PHEAKKK");
                    data.setPhone("0111111155511111");
                    break;

            }
        }
    }
}