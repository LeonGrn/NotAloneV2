package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    private Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_activity);

        create = findViewById(R.id.create);

        create.setOnClickListener(createAcc);
    }

    View.OnClickListener createAcc = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            goToSignUpActivity();
        }
    };

    private  void goToSignUpActivity()
    {
        Intent intent = new Intent(CreateAccountActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
