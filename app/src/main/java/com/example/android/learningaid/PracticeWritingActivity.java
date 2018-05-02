package com.example.android.learningaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.android.learningaid.view.DrawingView;

public class PracticeWritingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_writing);
    }

    @Override
    public boolean onNavigateUp() {
        super.onDestroy();
        return super.onNavigateUp();
    }
    
    public void onClickClear(View view) {
        DrawingView drawingView = findViewById(R.id.drawing_view);
        drawingView.clearCanvas();
    }

    public void onClickNext(View view) {

    }
}
