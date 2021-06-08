package com.example.logcathealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.logcathealth.R;

public class LogInActivity extends AppCompatActivity {
    EditText username, loginpass;
    Button loginsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        username=findViewById(R.id.username);
        loginpass=findViewById(R.id.loginpass);
        loginsub=findViewById(R.id.loginsub);

        //Button action
        loginsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Condition check
                //next activity
            }
        });
    }
}
