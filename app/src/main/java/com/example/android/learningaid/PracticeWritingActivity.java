package com.example.android.learningaid;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.learningaid.util.KanaDBUtil;
import com.example.android.learningaid.view.DrawingView;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class PracticeWritingActivity extends AppCompatActivity {
    private TextView drawingSuggestion;
    private DrawingView drawingView;

    private Kana currentKana;
    private List<Kana> kanaList;
    private ListIterator<Kana> iterator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_writing);

        drawingSuggestion = findViewById(R.id.drawing_suggestion);
        drawingView = findViewById(R.id.drawing_view);

        kanaList = KanaDBUtil.getKanaList(getIntent().getExtras().getIntegerArrayList(PracticeParametersActivity.PRACTICE_SET_KEY));
        Collections.shuffle(kanaList);
        iterator = kanaList.listIterator();
        currentKana = iterator.next();
        drawingSuggestion.setText(currentKana.getCharacter());
    }

    @Override
    public void onBackPressed() {
        NavUtils.navigateUpFromSameTask(this);
    }

    public void onClickClear(View view) {
        drawingView.clearCanvas();
    }

    public void onClickNext(View view) {
        try {
            drawingView.clearCanvas();
            currentKana = iterator.next();
            drawingSuggestion.setText(currentKana.getCharacter());
        } catch (NoSuchElementException e) {
            NavUtils.navigateUpFromSameTask(this);
        }
    }
}
