package com.example.d1mys1klapo4ka.studentholder.adapter;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.d1mys1klapo4ka.studentholder.R;

import com.example.d1mys1klapo4ka.studentholder.fragment.FragmentRecyclerView;
import com.example.d1mys1klapo4ka.studentholder.model.StudentHolder;
import com.example.d1mys1klapo4ka.studentholder.activity.MainActivity;

import java.util.ArrayList;

/**
 * Created by d1mys1klapo4ka on 16.05.2017.
 */

public class RecyclerViewAdapter  extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolderForStudent>{
    private CardView cardView;
    private FragmentRecyclerView context;
    private ArrayList<StudentHolder> studentsInit;

    public RecyclerViewAdapter(FragmentRecyclerView context, ArrayList<StudentHolder> studentsInit ){

        this.context = context;
        this.studentsInit = studentsInit;
    }


    @Override
    public ViewHolderForStudent onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_holder_activity, parent , false);
        return new ViewHolderForStudent(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderForStudent holder, int position) {

        StudentHolder studentHolder = studentsInit.get(position);

        holder.tvName.setText(studentHolder.getName());
        holder.tvAge.setText(studentHolder.getAge());
    }

    @Override
    public int getItemCount() {
        return studentsInit.size();
    }

    public class ViewHolderForStudent extends RecyclerView.ViewHolder{

        TextView tvName, tvAge;

        public ViewHolderForStudent(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_name);
            tvAge = (TextView)itemView.findViewById(R.id.tv_age);
            cardView = (CardView)itemView.findViewById(R.id.cv_item);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        switch (v.getId()) {
                            case R.id.cv_item:

                                break;
                        }
                    }
                }
            });
        }

    }
}
