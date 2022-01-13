package ArrayList;

import java.util.ArrayList;

public class Practice3 {

    public static void main(String[] args) {

        //task
        //-create an ArrayList what will store 5 fruites
        //print out using for loop

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Cherry");
        fruits.add("Grape");
        fruits.add("Kiwi");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        //or
        for (String fr : fruits) {
            System.out.println(fr);
        }

        // create a methode that will take arraylist as a paramiter of fruites
        // and this methode will print out fruit if it has 5 or more letter

    }

//    public void sum(int i1, int i2) {
//        System.out.println(i1 + i2);


    public  void printFruit(ArrayList<String> fruits) {
        for (String fruit : fruits) {
            if (fruit.length() >= 5) {
                System.out.println(fruit);
            }
        }

    }
// create a methode to that will take arraylist as a parameter of fruits
// and will remove all that has 4 or less letter

        public void deleteFruit (ArrayList <String> fruits) {
            for (int i = 0; i< fruits.size();i++) {
                if (fruits.get(i).length()<=4) {
                    fruits.remove(i);

                }

        }                    System.out.println(fruits);


        }
}
