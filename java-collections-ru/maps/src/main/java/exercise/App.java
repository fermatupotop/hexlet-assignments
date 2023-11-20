package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// BEGIN
class App{
    public static Map<String,Integer> getWordCount(String sentence){

        if(sentence.isEmpty()){
            return new HashMap<>();
        }
        String[] words = sentence.split(" ");


        Map<String,Integer> finalMap = new HashMap<>();
        int count = 1;
        for (String word : words){
            if (!finalMap.containsKey(word)){
               finalMap.put(word,count);
            } else {
                int value = finalMap.get(word);
                finalMap.put(word,value + 1);
            }
        }
        return finalMap;
        }


    public static String toString(Map<String,Integer> wordCount1) {
        StringBuilder finalString = new StringBuilder();
        if(wordCount1.isEmpty()){
            return "{}";
        }
        finalString.append("{\n");
        for (Map.Entry<String,Integer> word : wordCount1.entrySet()){
        finalString.append("  ").append(word.getKey()).append(": ");
        finalString.append(word.getValue()).append("\n");
        }
        finalString.append("}");

        return finalString.toString();
    }

}
//END
