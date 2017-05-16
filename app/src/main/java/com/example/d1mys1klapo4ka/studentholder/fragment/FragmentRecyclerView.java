package com.example.d1mys1klapo4ka.studentholder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.TextView;

import com.example.d1mys1klapo4ka.studentholder.R;
//import com.example.d1mys1klapo4ka.studentholder.activity.RecyclerViewActivity;
import com.example.d1mys1klapo4ka.studentholder.adapter.RecyclerViewAdapter;
import com.example.d1mys1klapo4ka.studentholder.model.StudentHolder;

import java.util.ArrayList;


/**
 * Created by d1mys1klapo4ka on 16.05.2017.
 */

public class FragmentRecyclerView extends Fragment {

    public FragmentRecyclerView(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recycler_view_activity, container, false);

        rv(view);
        return view;
    }

    private void rv(View v){
        RecyclerView rvInitStudent = (RecyclerView) v.findViewById(R.id.rv_init_student);

         rvInitStudent.setLayoutManager(new LinearLayoutManager(getActivity()));
               rvInitStudent.setHasFixedSize(true);
        rvInitStudent.setAdapter(new RecyclerViewAdapter(this, studentInInit()));
    }

    private ArrayList<StudentHolder> studentInInit() {

        ArrayList<StudentHolder> students = new ArrayList<>();
        students.add(new StudentHolder("Макс", "20"));
        students.add(new StudentHolder("Дима", "23"));
        students.add(new StudentHolder("Рома", "27"));
        students.add(new StudentHolder("Макс", "20"));
        students.add(new StudentHolder("Дима", "23"));
        students.add(new StudentHolder("Рома", "27"));
        students.add(new StudentHolder("Макс", "20"));
        students.add(new StudentHolder("Дима", "23"));
        students.add(new StudentHolder("Рома", "27"));
        students.add(new StudentHolder("Макс", "20"));
        students.add(new StudentHolder("Дима", "23"));
        students.add(new StudentHolder("Рома", "27"));
        students.add(new StudentHolder("Макс", "20"));
        students.add(new StudentHolder("Дима", "23"));
        students.add(new StudentHolder("Рома", "27"));

        return students;
    }

}
