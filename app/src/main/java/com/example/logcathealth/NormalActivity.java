package com.example.logcathealth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

public class NormalActivity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String TAG = "User Sign Up";
    EditText FullName,Emailadr,PhoneNumber,Pass;
    Button Submitbtn;

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
                String email = Emailadr.getText().toString().trim();
                String passwrd = Emailadr.getText().toString().trim();
                String name = FullName.getText().toString().trim();

        Submitbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

//
//                //checking if user name is  empty
//                if(TextUtils.isEmpty(Name)){
//                    FullName.setError("Enter name");
//                    return;
//                }
//
//                //checking  if email name is  empty
//                if(TextUtils.isEmpty(Email)){
//                    Emailadr.setError("Enter email address");
//                    return;
//                }
//
//                //checking  if password name is  empty
//                if(TextUtils.isEmpty(passwrd)){
//                    Emailadr.setError("Enter the password");
//                    return;
//                }
//
//                //checking  if password length is 8 gigits or longer
//                if(password.length() < 8){
//                    Pass.setError("password should be 0f 8 characters or greater");
//                    return;
//                }
//
//                //checking  if pone number is leass than 10 digits
//                if(phnumber<=999999999){
//                    PhoneNumber.setError("phone number should be of 10 digits");
//                    return;
//                }


    Map<String, Object> user = new HashMap<>();
user.put("name", name);
user.put("email", email);
user.put("phone", 000);
user.put("password", passwrd );

db.collection("users")
        .add(user)
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

//    // Create a new user with a first, middle, and last name
//    Map<String, Object> user = new HashMap<>();
//user.put("first", "Alan");
//        user.put("middle", "Mathison");
//        user.put("last", "Turing");
//        user.put("born", 1912);
//
//// Add a new document with a generated ID
//        db.collection("users")
//        .add(user)
//        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//@Override
//public void onSuccess(DocumentReference documentReference) {
//        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
//        }
//        })
//        .addOnFailureListener(new OnFailureListener() {
//@Override
//public void onFailure(@NonNull Exception e) {
//        Log.w(TAG, "Error adding document", e);
//        }
//        });
            }
        });
    }
}
