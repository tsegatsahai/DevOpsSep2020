package com.tsega;

import java.util.ArrayList;

public class LastLetterCount {
    String word;
    ArrayList<String> words;
    int sWords;
    int yWords;

    public LastLetterCount(String word) {
        this.word = word;
        this.words = new ArrayList<String>();
        this.sWords = 0;
        this.yWords = 0;
    }

    public int getsWords() {
        return sWords;
    }

    public int getyWords() {
        return yWords;
    }

    public String switchWords(){
        word = word.trim();
        String dummyWord = "";
        for(int i = 0; i < word.length(); i++){
            if(Character.isLetter(word.charAt(i))){
                dummyWord += word.charAt(i);
                if(i == word.length() - 1){
                    words.add(dummyWord);
                }
            }else{
                if((i+1) < word.length()){
                    if(!Character.isLetter(word.charAt(i+1))){
                        continue;
                    }
                }
                words.add(dummyWord);
                dummyWord = "";
            }
        }

        int firstSIndex = -1;
        int firstYIndex = -1;
        boolean foundFirstS = false;
        boolean foundFirstY = false;
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).charAt(words.get(i).length() - 1) == 's'){
                sWords ++;
                if(!foundFirstS){
                    foundFirstS = true;
                    firstSIndex = i;
                }
            }
            if(words.get(i).charAt(words.get(i).length() - 1) == 'y'){
                yWords ++;
                if(!foundFirstY){
                    foundFirstY = true;
                    firstYIndex = i;
                }
            }
        }
        if(firstSIndex != -1 && firstYIndex != -1){
            String temp = words.get(firstSIndex);
            words.set(firstSIndex, words.get(firstYIndex));
            words.set(firstYIndex, temp);

        }
        String newWord = "";
        for(int i = 0; i < words.size(); i++){
            newWord += words.get(i) + " ";
        }
        return newWord;
    }
}
