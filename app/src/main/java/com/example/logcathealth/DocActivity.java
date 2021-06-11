package com.example.logcathealth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class DocActivity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String TAG = "Doctor Sign Up";
    EditText FullName,Emailadr,PhoneNumber,Pass, RegNum, Spec, Time;
    Button Submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_acivity);
        //define the text variable and button

        FullName = findViewById(R.id.docname);
        Emailadr = findViewById(R.id.docemail);
        PhoneNumber = findViewById(R.id.docphone);
        Pass = findViewById(R.id.docpass);
        RegNum = findViewById(R.id.regnum);
        Submitbtn = findViewById(R.id.docsubmit);
        Time = findViewById(R.id.availabletime);
        Spec = findViewById(R.id.speci);

        Submitbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String email = Emailadr.getText().toString();
                String passwrd = Pass.getText().toString();
                String name = FullName.getText().toString();
                String phnumber=PhoneNumber.getText().toString();
                String regNum=RegNum.getText().toString();
                String spec = Spec.getText().toString();
                String time = Time.getText().toString();


                //checking  if email name is  empty
                if(name.equals("")){
                    FullName.setError("Enter Name");
                    return;
                }

                //checking  if email name is  empty
                if(email.equals("")){
                    Emailadr.setError("Enter email address");
                    return;
                }

                //checking  if password name is  empty
                if(passwrd.equals("")){
                    Pass.setError("Enter the password");
                    return;
                }

                //checking if the registration no is empty
                if(regNum.equals("")){
                    Pass.setError("Enter the password");
                    return;
                }

                //checking  if password length is 8 gigits or longer
                if(passwrd.length() < 8){
                    Pass.setError("Password should be Minimum 8 Characters");
                    return;
                }

                if(phnumber.equals("")){
                    Emailadr.setError("Enter Phone Number");
                    return;
                }
                //checking  if pone number is leass than 10 digits
                int phnlen=phnumber.length();
                if(phnlen!=10){
                    PhoneNumber.setError("Enter 10 digits");
                    return;
                }

                Map<String, Object> doctor = new HashMap<>();
                doctor.put("name",name);
                doctor.put("email",email);
                doctor.put("phone",phnumber);
                doctor.put("password",passwrd);
                doctor.put("regno",regNum);
                doctor.put("spec",spec);
                doctor.put("time",time);

                db.collection("doctors")
                        .add(doctor)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error adding document", e);
                            }
                        });
                Intent intent=new Intent(DocActivity.this, BottomNavigation.class);
                startActivity(intent);
            }
        });
    }
}
