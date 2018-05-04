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

    private static final List<Kana> HIRA_GA = new ArrayList<Kana>() {
        {
            add(new Kana("ga", "が", Kana.HIRAGANA));
            add(new Kana("gi", "ぎ", Kana.HIRAGANA));
            add(new Kana("ge", "げ", Kana.HIRAGANA));
            add(new Kana("go", "ご", Kana.HIRAGANA));
            add(new Kana("gu", "ぐ", Kana.HIRAGANA));
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

    private static final List<Kana> HIRA_ZA = new ArrayList<Kana>() {
        {
            add(new Kana("za", "ざ", Kana.HIRAGANA));
            add(new Kana("ji", "じ", Kana.HIRAGANA));
            add(new Kana("ze", "ぜ", Kana.HIRAGANA));
            add(new Kana("zo", "ぞ", Kana.HIRAGANA));
            add(new Kana("zu", "ず", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_TA = new ArrayList<Kana>() {
        {
            add(new Kana("ta", "た", Kana.HIRAGANA));
            add(new Kana("chi", "ち", Kana.HIRAGANA));
            add(new Kana("te", "て", Kana.HIRAGANA));
            add(new Kana("to", "と", Kana.HIRAGANA));
            add(new Kana("tsu", "つ", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_DA = new ArrayList<Kana>() {
        {
            add(new Kana("da", "だ", Kana.HIRAGANA));
            add(new Kana("di", "ぢ", Kana.HIRAGANA));
            add(new Kana("de", "で", Kana.HIRAGANA));
            add(new Kana("do", "ど", Kana.HIRAGANA));
            add(new Kana("du", "づ", Kana.HIRAGANA));
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

    private static final List<Kana> HIRA_BA = new ArrayList<Kana>() {
        {
            add(new Kana("ba", "ば", Kana.HIRAGANA));
            add(new Kana("bi", "び", Kana.HIRAGANA));
            add(new Kana("be", "べ", Kana.HIRAGANA));
            add(new Kana("bo", "ぼ", Kana.HIRAGANA));
            add(new Kana("bu", "ぶ", Kana.HIRAGANA));
        }
    };

    private static final List<Kana> HIRA_PA = new ArrayList<Kana>() {
        {
            add(new Kana("pa", "ぱ", Kana.HIRAGANA));
            add(new Kana("pi", "ぴ", Kana.HIRAGANA));
            add(new Kana("pe", "ぺ", Kana.HIRAGANA));
            add(new Kana("po", "ぽ", Kana.HIRAGANA));
            add(new Kana("pu", "ぷ", Kana.HIRAGANA));
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

    private static final List<Kana> KATA_A = new ArrayList<Kana>() {
        {
            add(new Kana("a", "ア", Kana.KATAKANA));
            add(new Kana("i", "イ", Kana.KATAKANA));
            add(new Kana("u", "ウ", Kana.KATAKANA));
            add(new Kana("e", "エ", Kana.KATAKANA));
            add(new Kana("o", "オ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_KA = new ArrayList<Kana>() {
        {
            add(new Kana("ka", "カ", Kana.KATAKANA));
            add(new Kana("ki", "キ", Kana.KATAKANA));
            add(new Kana("ke", "ケ", Kana.KATAKANA));
            add(new Kana("ko", "コ", Kana.KATAKANA));
            add(new Kana("ku", "ク", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_GA = new ArrayList<Kana>() {
        {
            add(new Kana("ga", "ガ", Kana.KATAKANA));
            add(new Kana("gi", "ゲ", Kana.KATAKANA));
            add(new Kana("ge", "ゲ", Kana.KATAKANA));
            add(new Kana("go", "ゴ", Kana.KATAKANA));
            add(new Kana("gu", "グ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_SA = new ArrayList<Kana>() {
        {
            add(new Kana("sa", "サ", Kana.KATAKANA));
            add(new Kana("shi", "シ", Kana.KATAKANA));
            add(new Kana("se", "セ", Kana.KATAKANA));
            add(new Kana("so", "ソ", Kana.KATAKANA));
            add(new Kana("su", "ス", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_ZA = new ArrayList<Kana>() {
        {
            add(new Kana("za", "ザ", Kana.KATAKANA));
            add(new Kana("ji", "ジ", Kana.KATAKANA));
            add(new Kana("ze", "ゼ", Kana.KATAKANA));
            add(new Kana("zo", "ゾ", Kana.KATAKANA));
            add(new Kana("zu", "ズ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_TA = new ArrayList<Kana>() {
        {
            add(new Kana("ta", "タ", Kana.KATAKANA));
            add(new Kana("chi", "チ", Kana.KATAKANA));
            add(new Kana("te", "テ", Kana.KATAKANA));
            add(new Kana("to", "ト", Kana.KATAKANA));
            add(new Kana("tsu", "ツ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_DA = new ArrayList<Kana>() {
        {
            add(new Kana("da", "ダ", Kana.KATAKANA));
            add(new Kana("di", "ヂ", Kana.KATAKANA));
            add(new Kana("de", "デ", Kana.KATAKANA));
            add(new Kana("do", "ド", Kana.KATAKANA));
            add(new Kana("du", "ヅ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_NA = new ArrayList<Kana>() {
        {
            add(new Kana("na", "ナ", Kana.KATAKANA));
            add(new Kana("ni", "ニ", Kana.KATAKANA));
            add(new Kana("ne", "ネ", Kana.KATAKANA));
            add(new Kana("no", "ノ", Kana.KATAKANA));
            add(new Kana("nu", "ヌ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_HA = new ArrayList<Kana>() {
        {
            add(new Kana("ha", "ハ", Kana.KATAKANA));
            add(new Kana("hi", "ヒ", Kana.KATAKANA));
            add(new Kana("he", "ヘ", Kana.KATAKANA));
            add(new Kana("ho", "ホ", Kana.KATAKANA));
            add(new Kana("hu", "フ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_BA = new ArrayList<Kana>() {
        {
            add(new Kana("ba", "バ", Kana.KATAKANA));
            add(new Kana("bi", "ビ", Kana.KATAKANA));
            add(new Kana("be", "ベ", Kana.KATAKANA));
            add(new Kana("bo", "ボ", Kana.KATAKANA));
            add(new Kana("bu", "ブ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_PA = new ArrayList<Kana>() {
        {
            add(new Kana("pa", "パ", Kana.KATAKANA));
            add(new Kana("pi", "ピ", Kana.KATAKANA));
            add(new Kana("pe", "ペ", Kana.KATAKANA));
            add(new Kana("po", "ポ", Kana.KATAKANA));
            add(new Kana("pu", "プ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_MA = new ArrayList<Kana>() {
        {
            add(new Kana("ma", "マ", Kana.KATAKANA));
            add(new Kana("mi", "ミ", Kana.KATAKANA));
            add(new Kana("me", "メ", Kana.KATAKANA));
            add(new Kana("mo", "モ", Kana.KATAKANA));
            add(new Kana("mu", "ム", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_YA = new ArrayList<Kana>() {
        {
            add(new Kana("ya", "ヤ", Kana.KATAKANA));
            add(new Kana("yo", "ヨ", Kana.KATAKANA));
            add(new Kana("yu", "ユ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_RA = new ArrayList<Kana>() {
        {
            add(new Kana("ra", "ラ", Kana.KATAKANA));
            add(new Kana("ri", "リ", Kana.KATAKANA));
            add(new Kana("ru", "ル", Kana.KATAKANA));
            add(new Kana("re", "レ", Kana.KATAKANA));
            add(new Kana("ro", "ロ", Kana.KATAKANA));
        }
    };

    private static final List<Kana> KATA_WA_N = new ArrayList<Kana>() {
        {
            add(new Kana("wa", "ワ", Kana.KATAKANA));
            add(new Kana("wo", "ヲ", Kana.KATAKANA));
            add(new Kana("n", "ン", Kana.KATAKANA));
        }
    };

    // Dakuten: HIRA_GA, HIRA_ZA, HIRA_DA, HIRA_BA, KATA_GA, KATA_ZA, KATA_DA, KATA_BA
    // Handakuten: HIRA_PA, KATA_PA

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

            put(R.id.cb_a_kata, KATA_A);
            put(R.id.cb_ka_kata, KATA_KA);
            put(R.id.cb_sa_kata, KATA_SA);
            put(R.id.cb_ta_kata, KATA_TA);
            put(R.id.cb_na_kata, KATA_NA);
            put(R.id.cb_ha_kata, KATA_HA);
            put(R.id.cb_ma_kata, KATA_MA);
            put(R.id.cb_ya_kata, KATA_YA);
            put(R.id.cb_ra_kata, KATA_RA);
            put(R.id.cb_wa_n_kata, KATA_WA_N);
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
