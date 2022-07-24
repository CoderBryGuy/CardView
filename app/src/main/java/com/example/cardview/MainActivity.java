package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<CourseModel> mCourseModelArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        mRecyclerView = findViewById(R.id.recycler_view);

        mCourseModelArrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mCourseModelArrayList.add(new CourseModel("Android Course " + (i+1), R.drawable.android_guy));
        }

        MyAdapter myAdapter = new MyAdapter(this, mCourseModelArrayList);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(myAdapter);

    }
}