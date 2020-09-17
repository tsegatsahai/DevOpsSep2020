package com.tsega;


public class Word {
    String word;

    public Word(String word) {
        this.word = word;
    }

    public int numOfWords(){
        int counter = 1;
        word = word.trim(); //to get rid of trailing spaces
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ' '){
                if((i+1) < word.length()){
                    if(word.charAt(i+1) == ' '){
                        continue;
                    }
                }
                counter++;
            }
        }
        return counter;
    }
}
