package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView joinActivity;
    private Button login;
    private EditText name;

    private final String john = "a";
    private final String ofer = "b";
    private final String familyMember = "c";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinActivity = findViewById(R.id.joinActivity);
        login = findViewById(R.id.login);
        name = findViewById(R.id.name);

        joinActivity.setOnClickListener(signUp);

        login.setOnClickListener(chooseOption);

    }

    View.OnClickListener chooseOption = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            if(name.getText().toString().equals("a"))
            {
                Log.i("21312312312" ,name.getText().toString() );
                Intent intent = new Intent(MainActivity.this, authorities.class);
                startActivity(intent);
            }
            else if(name.getText().toString().equals("b"))
            {
                Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                startActivity(intent);
            }
            else if(name.getText().toString().equals("c"))
            {
                Intent intent = new Intent(MainActivity.this, FamilyMember.class);
                startActivity(intent);
            }
        }
    };

    View.OnClickListener signUp = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            goToSignUpActivity();
        }
    };


    private  void goToSignUpActivity()
    {
        Intent intent = new Intent(MainActivity.this, signUpActivity.class);
        startActivity(intent);
    }
}
