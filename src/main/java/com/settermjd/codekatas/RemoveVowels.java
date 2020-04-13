package com.settermjd.codekatas;

public class RemoveVowels {
    private final String PATTERN_VOWELS = "[aeiou]";

    private String text;

    public RemoveVowels(String prose) {
        this.text = prose;
    }

    public String removeVowels() {
        return this.text.replaceAll(this.PATTERN_VOWELS, "");
    }
}
