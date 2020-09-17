package com.tsega;

import java.util.Scanner;
/*
* @author = tsegatsahai
* */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word/phrase: ");
        String phrase = scanner.nextLine();

        Vowels vowels = new Vowels(phrase);
        Palindrome palindrome = new Palindrome(phrase);
        Word word = new Word(phrase);

        System.out.println("The number of vowels in '" + phrase + "' is " + vowels.findVowels());

        if(palindrome.isPalindrome()){
            System.out.println("'" + phrase + "' is a palindrome");
        }else {
            System.out.println("'" + phrase + "' is not a palindrome");
        }

        System.out.println("The number of words in '" + phrase + "' is: " + word.numOfWords());


    }
}
