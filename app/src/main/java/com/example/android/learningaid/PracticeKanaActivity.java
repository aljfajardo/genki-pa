package com.example.android.learningaid;

import android.annotation.TargetApi;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.learningaid.util.KanaDBUtil;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
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
    private List<Kana> kanaList;
    private ListIterator<Kana> iterator;

    private static boolean isFinished = false;

    /**
     * Does initial set up of the quiz.
     * Takes the passed practice set parameters, generates the practice set using the util.
     * Randomizes the order of the list to ensure each kana gets at least one pass
     */
    private void setUpQuiz(ArrayList<Integer> practiceSet) {
        kanaList = KanaDBUtil.getKanaList(practiceSet);
        Collections.shuffle(kanaList);
        iterator = kanaList.listIterator();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_kana);

        setUpQuiz(getIntent().getExtras().getIntegerArrayList(PracticeParametersActivity.PRACTICE_SET_KEY));

        // generate question
        mQuestionTextView = (TextView) findViewById(R.id.tv_question);

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

        buttonNext = (Button) findViewById(R.id.button_next);
        buttonNext.setVisibility(View.INVISIBLE);
        generateQuestion();
    }

    @Override
    public void onBackPressed() {
        NavUtils.navigateUpFromSameTask(this);
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
    @TargetApi(16)
    public void onButtonNextClick(View view) {
        buttonNext.setVisibility(View.INVISIBLE);
        for(Button button : buttonList) {
            button.setBackground(buttonNext.getBackground());
        }
        generateQuestion();
    }

    private void nextQuestion() {
        currentKana = kanaList.get((int) Math.round(Math.random() * 4));
        mQuestionTextView.setText(currentKana.getCharacter());
        for (Button button : buttonList) {
            button.setBackgroundColor(LTGRAY);
        }
    }

    private void generateQuestion() {
        // check to see if the quiz is finished
        // get the set the current kana we are reviewing
        // create a temporary list without the current kana to generate wrong choices
        // shuffle the buttonlist, set the first one to the current kana
        // for each remaining button, randomly pick one from the temporary list
        // display the current kana in the text view
        if(!isFinished) {
            currentKana = iterator.next();
            mQuestionTextView.setText(currentKana.getCharacter());
            ArrayList<Kana> tempList = new ArrayList<Kana>(kanaList);
            tempList.remove(currentKana);
            Collections.shuffle(buttonList);
            for(Button b : buttonList) {
                if( buttonList.indexOf(b) == 0 ) {
                    b.setTag(currentKana);
                    b.setText(currentKana.getRomaji());
                } else {
                    Kana randomKana = tempList.get( (int) Math.round(Math.random() * (tempList.size() - 1)) );
                    tempList.remove(randomKana);
                    b.setTag(randomKana);
                    b.setText(randomKana.getRomaji());
                }
            }

        }
    }
}
