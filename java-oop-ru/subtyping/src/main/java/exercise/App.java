package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
class App{

    public static void swapKeyValue(KeyValueStorage dictionary){

    Map<String,String> tmp = dictionary.toMap()
            .entrySet()
            .stream()
            .collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));

    for(Map.Entry<String,String> elem : tmp.entrySet()){
        dictionary.unset(elem.getValue());
    }
        for(Map.Entry<String,String> elem : tmp.entrySet()){
            dictionary.set(elem.getKey(),elem.getValue());
        }


    }
}
// END
