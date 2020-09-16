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

        System.out.println("The number of vowels in '" + word + "' is: ");
        System.out.println(vowels.findVowels());
    }
}
