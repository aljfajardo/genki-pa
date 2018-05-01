package com.example.android.learningaid.util;

import com.example.android.learningaid.Kana;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by admin on 4/25/18.
 */

public class KanaDBUtil {

    private static final List<Kana> kanaList = new ArrayList<Kana>() {
        {
            add(new Kana("a", "あ", Kana.HIRAGANA));
            add(new Kana("i", "い", Kana.HIRAGANA));
            add(new Kana("u", "う", Kana.HIRAGANA));
            add(new Kana("e", "え", Kana.HIRAGANA));
            add(new Kana("o", "お", Kana.HIRAGANA));
            add(new Kana("ka", "か", Kana.HIRAGANA));
            add(new Kana("ki", "き", Kana.HIRAGANA));
            add(new Kana("ke", "け", Kana.HIRAGANA));
            add(new Kana("ko", "こ", Kana.HIRAGANA));
            add(new Kana("ku", "く", Kana.HIRAGANA));
            add(new Kana("sa", "さ", Kana.HIRAGANA));
            add(new Kana("shi", "し", Kana.HIRAGANA));
            add(new Kana("se", "せ", Kana.HIRAGANA));
            add(new Kana("so", "そ", Kana.HIRAGANA));
            add(new Kana("su", "す", Kana.HIRAGANA));
            add(new Kana("ta", "た", Kana.HIRAGANA));
            add(new Kana("ti", "ち", Kana.HIRAGANA));
            add(new Kana("te", "て", Kana.HIRAGANA));
            add(new Kana("to", "と", Kana.HIRAGANA));
            add(new Kana("tsu", "つ", Kana.HIRAGANA));
            add(new Kana("na", "な", Kana.HIRAGANA));
            add(new Kana("ni", "に", Kana.HIRAGANA));
            add(new Kana("ne", "ね", Kana.HIRAGANA));
            add(new Kana("no", "の", Kana.HIRAGANA));
            add(new Kana("nu", "ぬ", Kana.HIRAGANA));
            add(new Kana("ha", "は", Kana.HIRAGANA));
            add(new Kana("hi", "ひ", Kana.HIRAGANA));
            add(new Kana("he", "へ", Kana.HIRAGANA));
            add(new Kana("ho", "ほ", Kana.HIRAGANA));
            add(new Kana("hu", "ふ", Kana.HIRAGANA));
            add(new Kana("ma", "ま", Kana.HIRAGANA));
            add(new Kana("mi", "み", Kana.HIRAGANA));
            add(new Kana("me", "め", Kana.HIRAGANA));
            add(new Kana("mo", "も", Kana.HIRAGANA));
            add(new Kana("mu", "む", Kana.HIRAGANA));
            add(new Kana("ya", "や", Kana.HIRAGANA));
            add(new Kana("yo", "よ", Kana.HIRAGANA));
            add(new Kana("yu", "ゆ", Kana.HIRAGANA));
            add(new Kana("ra", "ら", Kana.HIRAGANA));
            add(new Kana("ri", "り", Kana.HIRAGANA));
            add(new Kana("ru", "る", Kana.HIRAGANA));
            add(new Kana("re", "れ", Kana.HIRAGANA));
            add(new Kana("ro", "ろ", Kana.HIRAGANA));
            add(new Kana("wa", "わ", Kana.HIRAGANA));
            add(new Kana("wo", "を", Kana.HIRAGANA));
            add(new Kana("n", "ん", Kana.HIRAGANA));
        }
    };

    private KanaDBUtil() {}

    public static List<Kana> getKanaList() {
        return kanaList;
    }

    public static List<Kana> getKanaList(String... params) {
        Set<Kana> kanaSet = new HashSet<>();
        for (String s: params) {
            for (Kana k : kanaList) {
                if (k.getRomaji().contains(s)) {
                    kanaSet.add(k);
                }
            }
        }
        return new ArrayList<>(kanaSet);
    }
}
