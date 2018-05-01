package com.example.android.learningaid;

import java.util.Map;

/**
 * Created by admin on 4/24/18.
 */

public class Kana {

    public static final int HIRAGANA = 0;
    public static final int KATAKANA = 1;

    private String romaji;
    private String character;

    private int type;

    public Kana(String romaji, String character, int type) {
        this.romaji = romaji;
        this.character = character;
        this.type = type;
    }

    public String getRomaji() {
        return romaji;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kana kana = (Kana) o;

        if (!romaji.equals(kana.romaji)) return false;
        return character.equals(kana.character);
    }

    @Override
    public int hashCode() {
        int result = romaji.hashCode();
        result = 31 * result + character.hashCode();
        return result;
    }
}
