package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FamilyMember extends AppCompatActivity {

    private ImageView guyImage;
    private String value = "familyMember";
    private TextView backtoLogin;
    private Button openChat;
    private Button decline;
    private FrameLayout FrameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_member);

        backtoLogin = findViewById(R.id.backtoLogin);
        guyImage = findViewById(R.id.guyImage);
        openChat = findViewById(R.id.openChat);
        decline = findViewById(R.id.declineButton);
        FrameLayout = findViewById(R.id.frameid);

        openChat.setOnClickListener(openchatnow);
        guyImage.setOnClickListener(goprofile);
        backtoLogin.setOnClickListener(gobackto);
    }

    View.OnClickListener openchatnow = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            FrameLayout.setVisibility(View.VISIBLE);
            openChat.setVisibility(View.GONE);
            decline.setVisibility(View.GONE);

        }
    };

    View.OnClickListener gobackto = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(FamilyMember.this, MainActivity.class);
            startActivity(intent);
        }
    };


    View.OnClickListener goprofile = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {

            Intent intent = new Intent(FamilyMember.this, Profile.class);
            intent.putExtra("keyName" , value);
            startActivity(intent);

        }
    };
}
