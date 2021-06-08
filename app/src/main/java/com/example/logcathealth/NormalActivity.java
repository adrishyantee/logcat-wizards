package com.example.logcathealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NormalActivity extends AppCompatActivity {

    EditText FullName,Emailadr,PhoneNumber,Pass;
    Button  Submitbtn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);


        //define the text variable and button
        FullName = findViewById(R.id.name);
        Emailadr = findViewById(R.id.email);
        PhoneNumber = findViewById(R.id.phone);
        Pass = findViewById(R.id.password);
        Submitbtn = findViewById(R.id.submit);


        Submitbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            Public void onClick(View v){
                String Email = Emailadr.getText().toString().trim();
                String passwrd = Emailadr.getText().toString().trim();
                String Name = FullName.getText().toString().trim();
                long phnumber = PhoneNumber.toLong();
                
                //checking if user name is  empty
                if(TextUtils.isEmpty(Name)){
                    FullName.setError("Enter name");
                    return;
                }

                //checking  if email name is  empty
                if(TextUtils.isEmpty(Email)){
                    Emailadr.setError("Enter email address");
                    return;
                }

                //checking  if password name is  empty
                if(TextUtils.isEmpty(passwrd)){
                    Emailadr.setError("Enter the password");
                    return;
                }

                //checking  if password length is 8 gigits or longer
                if(password.length() < 8){
                    Pass.setError("password should be 0f 8 characters or greater");
                    return;
                }

                //checking  if pone number is leass than 10 digits
                if(phnumber<=999999999){
                    PhoneNumber.setError("phone number should be of 10 digits");
                    return;
                }
            }
        });
    }
}
