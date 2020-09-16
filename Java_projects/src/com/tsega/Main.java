package com.tsega;

import java.util.Scanner;
/*
* @author = tsegatsahai
* */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a phrase/word: ");
        String word = scanner.nextLine();

        Vowels vowels = new Vowels(word);
        Palindrome palindrome = new Palindrome(word);

        System.out.println("The number of vowels in '" + word + "' is " + vowels.findVowels());


        if(palindrome.isPalindrome()){
            System.out.println("'" + word + "' is a palindrome");
        }else {
            System.out.println("'" + word + "' is not a palindrome");
        }

    }
}
