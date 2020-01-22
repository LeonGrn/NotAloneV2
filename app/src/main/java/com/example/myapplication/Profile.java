package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    private TextView  gobackto;
    private ImageView imageViewofer;
    private TextView textView12312;
    private String data = null;
    private Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageViewofer = findViewById(R.id.imageViewofer);
        textView12312 = findViewById(R.id.textView12312);
        gobackto = findViewById(R.id.gobackto);
        create = findViewById(R.id.create);
        data = getIntent().getExtras().getString("keyName","defaultKey");

        if (data.equals("ofer"))
        {
            imageViewofer.setImageResource(R.drawable.ofer);
            textView12312.setText("Ofer Drori - Student");
            create.setVisibility(View.VISIBLE);
        }
        else if(data.equals("guy"))
        {
            imageViewofer.setImageResource(R.drawable.guy);
            textView12312.setText("Guy Afik - Student");
            create.setVisibility(View.INVISIBLE);

        }
        gobackto.setOnClickListener(goprofile);
    }

    View.OnClickListener goprofile = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            if(data.equals("ofer"))
            {
                Intent intent = new Intent(Profile.this, StudentActivity.class);
                startActivity(intent);
                finish();
            }
            else
            {
                Intent intent = new Intent(Profile.this, CheckProfile.class);
                startActivity(intent);
                finish();
            }

        }
    };
}
