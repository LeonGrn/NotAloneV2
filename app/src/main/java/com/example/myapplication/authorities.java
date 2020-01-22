package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class authorities extends AppCompatActivity {
    private Button checkProfile;
    private Button checkRevue;
    private Button serch;
    private TextView gobackMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorities);
        checkProfile = findViewById(R.id.btn_check_profile);
        checkRevue = findViewById(R.id.btn_check_revie);
        serch = findViewById(R.id.btn_serch);
        gobackMain=findViewById(R.id.gobackMain);

        gobackMain.setOnClickListener(gotomain);
        checkProfile.setOnClickListener(gotoCheckProfile);
        checkRevue.setOnClickListener(gotocheckRevue);
        serch.setOnClickListener(serchIt);
    }

    View.OnClickListener gotomain = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(authorities.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    View.OnClickListener gotoCheckProfile = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoCheckProfile();
        }
    };

    private void gotoCheckProfile() {
        Intent intent = new Intent(authorities.this, CheckProfile.class);
        startActivity(intent);
        finish();
    }

    View.OnClickListener gotocheckRevue = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoCheckReviews();
        }
    };

    private void gotoCheckReviews() {
        Intent intent = new Intent(authorities.this, CheckReviews.class);
        startActivity(intent);
        finish();
    }

    View.OnClickListener serchIt = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoSearch();
        }
    };

    private void gotoSearch() {
        Intent intent = new Intent(authorities.this, SearchActivity.class);
        startActivity(intent);
        finish();
    }
}
