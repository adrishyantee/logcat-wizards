package com.example.logcathealth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class LogInActivity extends AppCompatActivity {
    EditText email, loginpass;
    Button loginsub;
    FirebaseFirestore db;
    String TAG = "Login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        email=findViewById(R.id.email);
        loginpass=findViewById(R.id.loginpass);
        loginsub=findViewById(R.id.loginsub);
        db = FirebaseFirestore.getInstance();

        //Button action
        loginsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emaildata=email.getText().toString();
                String pass=loginpass.getText().toString();
                        db.collection("users")
                                .whereEqualTo("email",emaildata)
                                .get()
                                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                    @Override
                                    public void onComplete(@NonNull @NotNull Task<QuerySnapshot> task) {

                                        if (task.isSuccessful()){
                                            for (QueryDocumentSnapshot document : Objects.requireNonNull(task.getResult())) {
                                               String password = document.get("password").toString();
                                               if(password.equals(pass)) {
                                                   Intent intent = new Intent(LogInActivity.this, BottomNavigation.class);
                                                   startActivity(intent);
                                                   break;
                                               }
                                                Toast.makeText(LogInActivity.this,"Retry",Toast.LENGTH_LONG).show();
                                            }
                                        }else {
                                            Toast.makeText(LogInActivity.this,"Retry",Toast.LENGTH_LONG).show();
                                            return;
                                        }

                                    }
                                });
                    }
                });
            }
        }
