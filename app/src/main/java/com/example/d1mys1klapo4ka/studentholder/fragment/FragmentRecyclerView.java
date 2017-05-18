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
import com.example.d1mys1klapo4ka.studentholder.activity.SecondActivity;
import com.example.d1mys1klapo4ka.studentholder.adapter.RecyclerViewAdapter;
import com.example.d1mys1klapo4ka.studentholder.model.StudentHolder;

import java.util.ArrayList;


/**
 * Created by d1mys1klapo4ka on 16.05.2017.
 */

public class FragmentRecyclerView extends Fragment {
    private RecyclerView rvInitStudent;
    public FragmentRecyclerView(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recycler_view_activity, container, false);

        rv(view);
        return view;
    }

    private void rv(View v){
        rvInitStudent = (RecyclerView) v.findViewById(R.id.rv_init_student);
        //rvInitStudent.getChildItemId(v);
        rvInitStudent.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvInitStudent.setHasFixedSize(true);
        rvInitStudent.setAdapter(new RecyclerViewAdapter(getActivity(), studentInInit(),onClickListener));
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
         int position = rvInitStudent.getChildAdapterPosition(v);
            Intent intent = new Intent(getActivity(), SecondActivity.class);
            intent.putExtra("student", studentInInit().get(position));
            startActivity(intent);
        }
    };

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
