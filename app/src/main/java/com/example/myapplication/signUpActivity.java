package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class signUpActivity extends AppCompatActivity {

    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        next = findViewById(R.id.next);



        next.setOnClickListener(createProfile);
    }

    View.OnClickListener createProfile = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            goToSignUpActivity();
        }
    };


    private  void goToSignUpActivity()
    {
        Intent intent = new Intent(signUpActivity.this, CreateAccountActivity.class);
        startActivity(intent);
    }
}

