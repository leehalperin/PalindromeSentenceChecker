package com.sparta.lh;

import static com.sparta.lh.PalChecker.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PalCheckerTest {


    //checkPal method tests
    @Test
    @DisplayName ("check Racecar is found as a palindrome")
    public void checkRacecarIsFoundAsPalindrome() {assertTrue(checkPal("Racecar"));}

    @Test
    @DisplayName ("check a non-palindrome returns false")
    public void checkNoPalindromeReturnsFalse() {assertFalse(checkPal("donkey"));}

    @Test
    @DisplayName ("check uppercase is ignored")
    public void checkUpperCaseIsIgnored() {assertTrue(checkPal("rEPapEr"));}


    //longestPal method tests
    @Test
    @DisplayName ("check Racecar is found as a palindrome in a sentence")
    public void checkRacecarIsFoundAsPalindromeInSentence() {assertEquals("racecar",longestPal("I'm going to race a racecar"));}

    @Test
    @DisplayName ("check noon is found as a palindrome in a sentence")
    public void checkLongestPalindromeIsFoundInSentence() {assertEquals("noon",longestPal("The meeting was set for noon"));}

    @Test
    @DisplayName ("check longest palindrome is found from multiple palindromes")
    public void checkLongestPalindromeIsFoundFromMultiplePalindromes() {assertEquals("repaper",longestPal("radar repaper solos stats wow civic madam"));}

    @Test
    @DisplayName ("check longest palindrome is found in 30 word sentence")
    public void checkLongestPalindromeIsFoundIn30WordSentence() {assertEquals("repaper",longestPal("The old red house was getting very " +
            "old and now required refurbishment so the decorators decided that they would repaper all the walls in the house that were looking outdated"));}

    @Test
    @DisplayName ("check longest palindrome is found in 60 word sentence with duplicate words")
    public void checkLongestPalindromeIsFoundIn60WordSentenceWithDuplicates() {assertEquals("repaper",longestPal("The old red house was getting very " +
            "old and now required refurbishment so the decorators decided that they would repaper all the walls in the house that were looking outdated The old red house was getting very \" +\n" +
            "            \"old and now required refurbishment so the decorators decided that they would repaper all the walls in the house that were looking outdated"));}

}


