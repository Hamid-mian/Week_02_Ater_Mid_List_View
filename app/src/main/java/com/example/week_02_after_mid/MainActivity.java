package com.example.week_02_after_mid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> friendList = new ArrayList<String>();
    ListView listView;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list_view);
        textView=findViewById(R.id.textview);
        button=findViewById(R.id.Add);
//        ArrayList<String> friendList = new ArrayList<String>();
//        friendList.add("Hamid");
//        friendList.add("Qasim");
//        friendList.add("Shahzaib");
//        friendList.add("Faizan");
//        friendList.add("Zubair");
//        friendList.add("Hassan");
//        friendList.add("Arslan");

        ArrayList<String>  studentList = new ArrayList<String>();
        studentList.add("Ali");
        studentList.add("Ahmed");
        studentList.add("Saad");
        studentList.add("Khawar");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,studentList);
        listView.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!studentList.contains(textView.getText().toString()))
                {
                    studentList.add(textView.getText().toString());
                    arrayAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}