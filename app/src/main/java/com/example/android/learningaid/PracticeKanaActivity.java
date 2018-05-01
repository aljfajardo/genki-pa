package com.example.android.learningaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static android.graphics.Color.GRAY;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.LTGRAY;
import static android.graphics.Color.RED;

/**
 *  The activity where one can practice kana.
 *  Eventually be able to select kana to practice from and see progress.
 *  For now, just be able to practice from "a e i o u"
 */
public class PracticeKanaActivity extends AppCompatActivity {

    private TextView mQuestionTextView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private Button buttonNext;

    private List<Button> buttonList;

    private Kana currentKana;
    private static final List<Kana> kanaList = new ArrayList<Kana>() {
        {
            add(new Kana("a", "あ", Kana.HIRAGANA));
            add(new Kana("i", "い", Kana.HIRAGANA));
            add(new Kana("u", "う", Kana.HIRAGANA));
            add(new Kana("e", "え", Kana.HIRAGANA));
            add(new Kana("o", "お", Kana.HIRAGANA));
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_kana);

        mQuestionTextView = (TextView) findViewById(R.id.tv_question);
        currentKana = kanaList.get((int) Math.round(Math.random() * (kanaList.size() - 1)));

        mQuestionTextView.setText(currentKana.getCharacter());

        button1 = (Button) findViewById(R.id.button_choice1);
        button2 = (Button) findViewById(R.id.button_choice2);
        button3 = (Button) findViewById(R.id.button_choice3);
        button4 = (Button) findViewById(R.id.button_choice4);
        button5 = (Button) findViewById(R.id.button_choice5);
        buttonList = new ArrayList<>();
        buttonList.add(button1);
        buttonList.add(button2);
        buttonList.add(button3);
        buttonList.add(button4);
        buttonList.add(button5);

        for(int i = 0; i < buttonList.size(); i++) {
            buttonList.get(i).setText(kanaList.get(i).getRomaji());
            buttonList.get(i).setTag(kanaList.get(i));
        }

        buttonNext = (Button) findViewById(R.id.button_next);
        buttonNext.setVisibility(View.INVISIBLE);

    }

    public void onButtonChoiceClick(View view) {
        Kana kana = (Kana) view.getTag();
        Log.d("DEBUG", kana.getCharacter());
        if (currentKana.equals(kana)) {
            view.setBackgroundColor(GREEN);
            buttonNext.setVisibility(View.VISIBLE);
        } else {
            view.setBackgroundColor(RED);
        }
    }

    public void onButtonNextClick(View view) {
        buttonNext.setVisibility(View.INVISIBLE);
        nextQuestion();
    }

    private void nextQuestion() {
        currentKana = kanaList.get((int) Math.round(Math.random() * (kanaList.size() - 1)));
        mQuestionTextView.setText(currentKana.getCharacter());
        for (Button button : buttonList) {
            button.setBackgroundColor(LTGRAY);
        }
    }

    @Override
    public boolean onNavigateUp() {
        super.onDestroy();
        return super.onNavigateUp();
    }
}
