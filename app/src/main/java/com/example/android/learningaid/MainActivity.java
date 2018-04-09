package com.example.android.learningaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int LESSON_NUM = 20;

    private RecyclerView mLessonList;

    private LessonViewAdapter mAdapter;

    private Toast mToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLessonList = (RecyclerView) findViewById(R.id.rv_lessons);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        mLessonList.setLayoutManager(layoutManager);

        mLessonList.setHasFixedSize(true);

        mAdapter = new LessonViewAdapter(LESSON_NUM);
        mLessonList.setAdapter(mAdapter);

    }

    public void onClickPracticeKana(View view) {
        Intent intent = new Intent(this, PracticeKanaActivity.class);
        startActivity(intent);
    }

    public void onClickCourseContent(View view) {
        displayToastWithText("Course Content not implemented yet");
    }

    public void onClickPracticeContent(View view) {
        displayToastWithText("Practice Content not implemented yet");
    }

    public void displayToastWithText(String message) {
        if (mToast != null) {
            mToast.cancel();
        }

        mToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        mToast.show();
    }
}
