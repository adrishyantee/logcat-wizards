package com.example.logcathealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
Button normal,doc,ven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Intent intent=getIntent();
        String mess=intent.getStringExtra(MainActivity.MSG);
//        Toast.makeText(this, mess, Toast.LENGTH_SHORT).show();
        normal=findViewById(R.id.normal);
        doc=findViewById(R.id.doc);
        ven=findViewById(R.id.ven);

        ven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this, "We will add this feature soon", Toast.LENGTH_SHORT).show();
            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUpActivity.this,NormalActivity.class);
                startActivity(intent);

            }
        });

        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUpActivity.this,DocActivity.class);
                startActivity(intent);
            }
        });

    }
}