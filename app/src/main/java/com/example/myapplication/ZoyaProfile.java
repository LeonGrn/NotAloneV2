package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ZoyaProfile extends AppCompatActivity {
    private TextView backtomainagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoya_profile);

        backtomainagain = findViewById(R.id.gobacktozoya);

        backtomainagain.setOnClickListener(goback);
    }

    View.OnClickListener goback = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goback();
        }
    };

    private void goback() {
        Intent intent = new Intent(ZoyaProfile.this, ElderActivity.class);
        startActivity(intent);
        finish();
    }

}

