package com.example.d1mys1klapo4ka.studentholder.activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.d1mys1klapo4ka.studentholder.R;
import com.example.d1mys1klapo4ka.studentholder.fragment.FragmentRecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Fragment fragment = new FragmentRecyclerView();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_activity, fragment)
                .commit();

        //CardView cardView = (CardView)findViewById(R.id.cv_item);
}


}
