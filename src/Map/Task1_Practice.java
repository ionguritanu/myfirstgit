package Map;

import java.util.HashMap;

public class Task1_Practice {
    public static void main(String[] args) {


        // I need to store this drinks into a map with the amount that how many times that you see them in the arraay

        String[] drinks = {"Coke", "Water", "Coke", "coffee", "ayran", "Water"};

        HashMap<String, Integer> drinks1 = new HashMap<String, Integer>();

        for (String drink : drinks) {

            if (!drinks1.containsKey(drink)) {

                drinks1.put(drink, 1);
            } else {
                drinks1.put(drink, drinks1.get(drink) + 1);
            }
        }
        System.out.println(drinks1);
    }
}
