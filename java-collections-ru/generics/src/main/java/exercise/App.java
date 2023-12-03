package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App{

    public static List<Map<String,String>> findWhere(List<Map<String,String>> books,Map<String,String> where){

        List <Map<String,String>> tmp = new ArrayList<>();

        int count = where.size();
        for(Map<String,String> stringStringMap : books){
            int tmpCount = 0;
            for(Map.Entry<String,String> stringEntry : stringStringMap.entrySet()){
                if(stringEntry.getValue().equals(where.get(stringEntry.getKey()))){
                    tmpCount++;
                }
                if(count == tmpCount){
                    tmp.add(stringStringMap);
                    tmpCount = 0;
                }
            }
        }
        return tmp;

    }

}
//END
