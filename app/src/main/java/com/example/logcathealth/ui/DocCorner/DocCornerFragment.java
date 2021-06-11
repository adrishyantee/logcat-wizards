package com.example.logcathealth.ui.DocCorner;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.logcathealth.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DocCornerFragment extends Fragment {

    RecyclerView recyclerView;
    DocCornerAdapter DocCornerAdapter;
    List<DocCornerItem> items;
    FirebaseFirestore db;
    String TAG = "Doctor Details";

    public DocCornerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_doc_corner, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerview);

        FirebaseFirestore.getInstance()
                .collection("doctors")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            items=new ArrayList<>();
                            for (QueryDocumentSnapshot document : Objects.requireNonNull(task.getResult())) {
                                String doc_name = document.get("name").toString();
                                String email = document.get("email").toString();
                                String phone = document.get("phone").toString();
                                String spec = document.get("spec").toString();
                                String time = document.get("time").toString();
                                Log.wtf("ERROR",email);
                                items.add(new DocCornerItem(doc_name, phone, email, spec, time, R.drawable.doctorcorner));
                                DocCornerAdapter=new DocCornerAdapter(items);
                                recyclerView.setLayoutManager(new LinearLayoutManager((getContext())));
                                recyclerView.setAdapter(DocCornerAdapter);
                            }
                        }
                    }
                });

    }
}
