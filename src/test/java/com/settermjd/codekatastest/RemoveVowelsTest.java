package com.settermjd.codekatastest;

import com.settermjd.codekatas.RemoveVowels;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveVowelsTest {
    @Test
    public void testDoesRemoveVowelsCorrectly() {
        String testText = "Lorem ipsum dolor sit amet consectetur adipiscing, elit elementum sapien congue phasellus.";
        String validText = "Lrm psm dlr st mt cnscttr dpscng, lt lmntm spn cng phslls.";
        RemoveVowels vowelRemover = new RemoveVowels(testText);
        assertEquals(validText, vowelRemover.removeVowels());
    }
}
