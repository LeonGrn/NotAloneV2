package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckReviews extends AppCompatActivity {

    private TextView backtoAuthorie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_reviews);

        backtoAuthorie = findViewById(R.id.backtoAuthorie);
        backtoAuthorie.setOnClickListener(gobacktooptions);
    }

    View.OnClickListener gobacktooptions = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoSearch();
        }
    };

    private void gotoSearch() {
        Intent intent = new Intent(CheckReviews.this, authorities.class);
        startActivity(intent);
        finish();
    }
}
