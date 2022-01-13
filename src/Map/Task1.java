package Map;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        //create a methode that will take a map<Integer, String>as a parameter and it will
        // print out keys from that map one by one

        HashMap<Integer, String> cookies = new HashMap<>();
        cookies.put(1, "chokolate");
        cookies.put(2, "oreo");
        cookies.put(3, "bounty");
        printKeysOneByOne(cookies);   //printing the key

        printKeysOneByOne1(cookies);  //printing the values
    }


    public static void printKeysOneByOne(Map<Integer, String> map) {
        map.keySet();
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
    }


    //create a methode that will take a map<Integer, String>as a parameter and it will
    // print out keys from that map one by one
    public static void printKeysOneByOne1(Map<Integer, String> map) {
        map.values();
        for (String key1 : map.values()) {
            System.out.println(key1);
        }
    }
}
