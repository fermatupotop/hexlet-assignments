package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN

class App{

    public static boolean scrabble(String symbols, String word){

        int wordLength = word.length();
        int symbolsLength = symbols.length();
        List<Character> newList = new ArrayList<>();
        int count = 0;

        if(symbolsLength < wordLength){
            return false;
        }

        for(int i = 0; i < symbols.length(); i++){
            newList.add(symbols.toLowerCase().charAt(i));
        }


        for(int i = 0; i < wordLength; i++){
            if(newList.contains(word.toLowerCase().charAt(i))){
                newList.set(newList.indexOf(word.toLowerCase().charAt(i)),'-');
                count++;
            }
        }
        return count == wordLength;
    }


}
//END
