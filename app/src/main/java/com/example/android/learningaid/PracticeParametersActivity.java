package com.example.android.learningaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class PracticeParametersActivity extends AppCompatActivity {

    private ArrayList<Integer> practiceSet;
    private static final String TAG = "PracticeParamsActivity";
    public static final String PRACTICE_SET_KEY = "practiceSet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_practice_parameters);

        if (savedInstanceState != null) {
            // restore screen state
        } else {
            practiceSet = new ArrayList<>();
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    public void onKanaSelected(View view) {
        boolean isChecked = ((CheckBox) view).isChecked();
        int id = view.getId();
        if (isChecked) {
            practiceSet.add(id);
            Log.d(TAG, "Added " + getResources().getResourceName(id));
        } else {
            practiceSet.remove((Integer) id);

            Log.d(TAG, "Removed " + getResources().getResourceName(id));
        }
    }

    public void onClickNext(View view) {
        Log.d(TAG, "Beginning quiz with following kana sets: ");
        ArrayList<String> kanalist = new ArrayList<>();
        for(int i: practiceSet) {
            kanalist.add(getResources().getResourceName(i));
        }
        Log.d(TAG, kanalist.toString());
        Intent intent = new Intent(this, PracticeKanaActivity.class);
        intent.putIntegerArrayListExtra(PRACTICE_SET_KEY, practiceSet);
        startActivity(intent);
    }
}
