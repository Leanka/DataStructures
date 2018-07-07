package algo;

import algo.helper.Tuple;

public class LongestWordFinder {

    public Tuple findLongestWord(String text){
        if(text.length() == 0){
            throw new IllegalArgumentException("Text cannot be empty");
        }

        String [] words = text.split("[\\s]+");
        String longestWord = "";
        for(String word:words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }

        return new Tuple(longestWord);
    }
}
