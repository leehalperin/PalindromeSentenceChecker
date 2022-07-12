package com.sparta.lh;

import static com.sparta.lh.PalChecker.checkPal;
import static com.sparta.lh.PalChecker.longestPal;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PalCheckerTest {

    @Test
    @DisplayName ("check Racecar is found as a palindrome")
    public void checkRacecarIsFoundAsPalindrome() {assertTrue(checkPal("Racecar"));}

    @Test
    @DisplayName ("check Racecar is found as a palindrome in a sentence")
    public void checkRacecarIsFoundAsPalindromeInSentence() {assertEquals("racecar",longestPal("I'm going to race a racecar"));}

    @Test
    @DisplayName ("check lomgest palindrome is found in a sentence")
    public void checkLongestPalindromeIsFoundInSentence() {assertEquals("noon",longestPal("The meeting was set for noon"));}
}


