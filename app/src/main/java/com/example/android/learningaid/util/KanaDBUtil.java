package com.example.android.learningaid.util;

import com.example.android.learningaid.Kana;

import com.example.android.learningaid.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 4/25/18.
 */

public class KanaDBUtil {
    private static final List<Kana> HIRA_A = new ArrayList<Kana>() {
        {
            add(new Kana("a", "あ", Kana.HIRAGANA));
            add(new Kana("i", "い", Kana.HIRAGANA));
            add(new Kana("u", "う", Kana.HIRAGANA));
            add(new Kana("e", "え", Kana.HIRAGANA));
            add(new Kana("o", "お", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_KA = new ArrayList<Kana>() {
        {
            add(new Kana("ka", "か", Kana.HIRAGANA));
            add(new Kana("ki", "き", Kana.HIRAGANA));
            add(new Kana("ke", "け", Kana.HIRAGANA));
            add(new Kana("ko", "こ", Kana.HIRAGANA));
            add(new Kana("ku", "く", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_SA = new ArrayList<Kana>() {
        {
            add(new Kana("sa", "さ", Kana.HIRAGANA));
            add(new Kana("shi", "し", Kana.HIRAGANA));
            add(new Kana("se", "せ", Kana.HIRAGANA));
            add(new Kana("so", "そ", Kana.HIRAGANA));
            add(new Kana("su", "す", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_TA = new ArrayList<Kana>() {
        {
            add(new Kana("ta", "た", Kana.HIRAGANA));
            add(new Kana("ti", "ち", Kana.HIRAGANA));
            add(new Kana("te", "て", Kana.HIRAGANA));
            add(new Kana("to", "と", Kana.HIRAGANA));
            add(new Kana("tsu", "つ", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_NA = new ArrayList<Kana>() {
        {
            add(new Kana("na", "な", Kana.HIRAGANA));
            add(new Kana("ni", "に", Kana.HIRAGANA));
            add(new Kana("ne", "ね", Kana.HIRAGANA));
            add(new Kana("no", "の", Kana.HIRAGANA));
            add(new Kana("nu", "ぬ", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_HA = new ArrayList<Kana>() {
        {
            add(new Kana("ha", "は", Kana.HIRAGANA));
            add(new Kana("hi", "ひ", Kana.HIRAGANA));
            add(new Kana("he", "へ", Kana.HIRAGANA));
            add(new Kana("ho", "ほ", Kana.HIRAGANA));
            add(new Kana("hu", "ふ", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_MA = new ArrayList<Kana>() {
        {
            add(new Kana("ma", "ま", Kana.HIRAGANA));
            add(new Kana("mi", "み", Kana.HIRAGANA));
            add(new Kana("me", "め", Kana.HIRAGANA));
            add(new Kana("mo", "も", Kana.HIRAGANA));
            add(new Kana("mu", "む", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_YA = new ArrayList<Kana>() {
        {
            add(new Kana("ya", "や", Kana.HIRAGANA));
            add(new Kana("yo", "よ", Kana.HIRAGANA));
            add(new Kana("yu", "ゆ", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_RA = new ArrayList<Kana>() {
        {
            add(new Kana("ra", "ら", Kana.HIRAGANA));
            add(new Kana("ri", "り", Kana.HIRAGANA));
            add(new Kana("ru", "る", Kana.HIRAGANA));
            add(new Kana("re", "れ", Kana.HIRAGANA));
            add(new Kana("ro", "ろ", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_WA_N = new ArrayList<Kana>() {
        {
            add(new Kana("wa", "わ", Kana.HIRAGANA));
            add(new Kana("wo", "を", Kana.HIRAGANA));
            add(new Kana("n", "ん", Kana.HIRAGANA));
        }
    };

    private static final Map<Integer, List> KANA_MAP = new HashMap<Integer,List>() {
        {
            put(R.id.cb_a_hira, HIRA_A);
            put(R.id.cb_ka_hira, HIRA_KA);
            put(R.id.cb_sa_hira, HIRA_SA);
            put(R.id.cb_ta_hira, HIRA_TA);
            put(R.id.cb_na_hira, HIRA_NA);
            put(R.id.cb_ha_hira, HIRA_HA);
            put(R.id.cb_ma_hira, HIRA_MA);
            put(R.id.cb_ya_hira, HIRA_YA);
            put(R.id.cb_ra_hira, HIRA_RA);
            put(R.id.cb_wa_n_hira, HIRA_WA_N);
        }
    };


    private KanaDBUtil() {}

    /*public static List<Kana> getKanaList() {
        return kanaList;
    }*/

    public static List<Kana> getKanaList(ArrayList<Integer> params) {
        List<Kana> practiceSet = new ArrayList();
        for(int i : params) {
            if(KANA_MAP.containsKey(i)) {
                practiceSet.addAll(KANA_MAP.get(i));
            }
        }
        return practiceSet;
    }
}
