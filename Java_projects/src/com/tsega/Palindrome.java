package com.tsega;

public class Palindrome {
    String word;

    public Palindrome(String word) {
        this.word = word;
    }
    public boolean isPalindrome(){
        String wordReversed = "";
        for(int i = word.length() - 1 ; i >= 0; i--){
            wordReversed += word.charAt(i);
        }
        return this.word.equalsIgnoreCase(wordReversed);
    }
}
