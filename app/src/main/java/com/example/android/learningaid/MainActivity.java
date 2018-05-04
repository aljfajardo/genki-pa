package com.example.android.learningaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toast mToast;
    public static final String NEXT_ACTIVITY_KEY = "nextActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPracticeKana(View view) {
        Intent intent = new Intent(this, PracticeParametersActivity.class);
        intent.putExtra(NEXT_ACTIVITY_KEY, "quiz");
        startActivity(intent);
    }

    public void onClickPracticeWriting(View view) {
        Intent intent = new Intent(this, PracticeParametersActivity.class);
        intent.putExtra(NEXT_ACTIVITY_KEY, "writing");
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
