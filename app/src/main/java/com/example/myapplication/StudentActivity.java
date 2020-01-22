package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentActivity extends AppCompatActivity {

    private TextView exit;
    private TextView setting;
    private String value = "ofer";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        exit = findViewById(R.id.exsit);
        setting = findViewById(R.id.setting);

        setting.setOnClickListener(editsettings);
        exit.setOnClickListener(goprofile);
    }

    View.OnClickListener goprofile = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(StudentActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    View.OnClickListener editsettings = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(StudentActivity.this, Profile.class);
            intent.putExtra("keyName" , value);
            startActivity(intent);
            finish();
        }
    };
}
