package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App{

    public static List<String> buildApartmentsList(List<Home> apartments, int n){
        Collections.sort(apartments,
                Home::compateTo);

        List<String> ApartmentsList = new ArrayList<>();
        if(n > apartments.size()){
            return ApartmentsList;
        }
        for(int i =0; i < n;i++){
            Home tmp = apartments.get(i);
            ApartmentsList.add(tmp.toString());
        }
        return ApartmentsList;
    }

}
// END
