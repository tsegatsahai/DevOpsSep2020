package com.tsega;


import java.util.ArrayList;

public class Word {
    String word;
    ArrayList<String> testWords;

    public Word(String word) {
        this.word = word;
        this.testWords = new ArrayList<String>();
    }

    public int numOfWords(){
        word = word.trim(); //to get rid of trailing spaces
        String dummyWord = "";
        for(int i = 0; i < word.length(); i++){
            if(Character.isLetter(word.charAt(i))){
                dummyWord += word.charAt(i);
                if(i == word.length() - 1){
                    testWords.add(dummyWord);
                    //System.out.println(dummyWord);
                }
            }else{
                if((i+1) < word.length()){
                    if(!Character.isLetter(word.charAt(i+1))){
                        continue;
                    }
                }
                testWords.add(dummyWord);
                dummyWord = "";
            }
        }
        return testWords.size();
    }
}
