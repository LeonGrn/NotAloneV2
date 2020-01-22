package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ElderActivity extends AppCompatActivity {

    private TextView backtomainagain;
    private TextView settings_older;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elder);

        backtomainagain = findViewById(R.id.backtomainagain);
        settings_older=findViewById(R.id.setting);
        backtomainagain.setOnClickListener(goback);
        settings_older.setOnClickListener(goToProfile);
    }

    View.OnClickListener goback = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goback();
        }
    };

    private void goback() {
        Intent intent = new Intent(ElderActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    View.OnClickListener goToProfile = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToProfile();
        }
    };

    private void goToProfile() {
        Intent intent = new Intent(ElderActivity.this, ZoyaProfile.class);
        startActivity(intent);
        finish();
    }


}
