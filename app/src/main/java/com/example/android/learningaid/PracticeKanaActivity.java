package com.example.android.learningaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PracticeKanaActivity extends AppCompatActivity {

    private TextView mTextView1;
    private TextView mTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_kana);

        mTextView1 = (TextView) findViewById(R.id.tv_aeiou_kana);
        mTextView2 = (TextView) findViewById(R.id.tv_aeiou_romaji);

        mTextView1.setText("あえいお\tう");
        mTextView2.setText("aeiou");
    }
}
