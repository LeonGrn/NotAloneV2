package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    private TextView backtoAuthorie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        backtoAuthorie = findViewById(R.id.exittoauthorise);
        backtoAuthorie.setOnClickListener(gobacktooptions);
    }

    View.OnClickListener gobacktooptions = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoSearch();
        }
    };

    private void gotoSearch() {
        Intent intent = new Intent(SearchActivity.this, authorities.class);
        startActivity(intent);
        finish();
    }
}
