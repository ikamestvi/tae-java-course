package homework9;

import java.util.HashMap;
import java.util.Map;


public class WordCounter {
    public void countWords(String sentence){
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordMap = new HashMap<>();

        for(String word : words){
            if(wordMap.containsKey(word)){
                wordMap.put(word, wordMap.get(word)+1);
            }else{
                wordMap.put(word, 1);
            }
        }

        System.out.println(wordMap);
    }
}
