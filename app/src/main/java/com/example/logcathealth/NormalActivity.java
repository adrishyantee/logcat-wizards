package com.example.logcathealth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class NormalActivity extends AppCompatActivity {


    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }
}
//    // Create a new user with a first and last name
//    Map<String, Object> user = new HashMap<>();
//user.put("first", "Ada");
//user.put("last", "Lovelace");
//user.put("born", 1815);
//
//// Add a new document with a generated ID
//db.collection("users")
//        .add(user)
//        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//        @Override
//        public void onSuccess(DocumentReference documentReference) {
//            Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
//        }
//    })
//            .addOnFailureListener(new OnFailureListener() {
//        @Override
//        public void onFailure(@NonNull Exception e) {
//            Log.w(TAG, "Error adding document", e);
//        }
//    });

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