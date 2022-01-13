package Map;

import java.util.*;

public class Practice_KeySet {
    public static void main(String[] args) {
        HashMap <String, String> cityZips = new HashMap<>();

        //key set()
        //It return all the keys in a set
        cityZips.put("Chicago","12345");
        cityZips.put("Des Plaines","23654");
        cityZips.put("Arlington Hts","87238");
        cityZips.put("Palatine","43541");

        System.out.println(cityZips);
        System.out.println(cityZips.keySet());
        Set <String> cityNames = cityZips.keySet();
        System.out.println(cityNames);

        //get("Palatine") --43541
        // print out all the values from the map by using keySet that we stored in the set

        for (String city : cityNames){
            System.out.println(cityZips.get(city));
        }

        //values ()                  // values return as a list
        cityZips.values();
        System.out.println(cityZips.values());

       Collection values = cityZips.values();
        System.out.println(values);

        //entrySet
        //return keys, values together

        //System.out.println(cityZips);
        System.out.println(cityZips.entrySet());
        Set enties = cityZips.entrySet();
        System.out.println(enties);

        Set <Map.Entry<String, String >> enties1 = cityZips.entrySet();
        System.out.println(enties1);


    }
}
