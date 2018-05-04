package com.example.android.learningaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PracticeParametersActivity extends AppCompatActivity {
    private Toast toast;
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
        if (practiceSet.size() > 0) {
            for(int i: practiceSet) {
                kanalist.add(getResources().getResourceName(i));
            }
            Log.d(TAG, kanalist.toString());
            Intent intent;
            if (getIntent().getExtras().getString(MainActivity.NEXT_ACTIVITY_KEY).equals("quiz")) {
                intent = new Intent(this, PracticeKanaActivity.class);
            } else {
                intent = new Intent(this, PracticeWritingActivity.class);
            }
            intent.putIntegerArrayListExtra(PRACTICE_SET_KEY, practiceSet);
            startActivity(intent);
        } else {
            if (toast != null) {
                toast.cancel();
            }
            toast = Toast.makeText(this, R.string.parameters_make_selection_toast, Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
