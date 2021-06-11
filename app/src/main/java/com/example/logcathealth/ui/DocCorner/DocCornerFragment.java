package com.example.logcathealth.ui.DocCorner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.logcathealth.R;

import java.util.ArrayList;
import java.util.List;

public class DocCornerFragment extends Fragment {

    RecyclerView recyclerView;
    DocCornerAdapter DocCornerAdapter;
    List<DocCornerItem> items;

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
        items=new ArrayList<>();












        items.add(new DocCornerItem("Hello","Hello","Hello","Hello","Hello",R.drawable.doctorcorner));
        DocCornerAdapter=new DocCornerAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager((getContext())));
        recyclerView.setAdapter(DocCornerAdapter);
    }
}
