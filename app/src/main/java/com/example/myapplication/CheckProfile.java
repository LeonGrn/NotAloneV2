package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckProfile extends AppCompatActivity {

    private TextView exit;
    private ImageView imageView22;
    private String value = "guy";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_profile);
        exit = findViewById(R.id.exit);
        imageView22 = findViewById(R.id.imageView22);


        imageView22.setOnClickListener(goprofile);
        exit.setOnClickListener(back);
    }

    View.OnClickListener goprofile = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(CheckProfile.this, Profile.class);
            intent.putExtra("keyName" , value);
            startActivity(intent);
            finish();
        }
    };



    View.OnClickListener back = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            goToSignUpActivity();
        }
    };

    private  void goToSignUpActivity()
    {
        Intent intent = new Intent(CheckProfile.this, authorities.class);
        startActivity(intent);
        finish();
    }
}
