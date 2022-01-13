package Set;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSet_Practice {
    public static void main(String[] args) {
        TreeSet <Integer> zipCodes = new TreeSet<>();
        zipCodes.add(44);
        zipCodes.add(11);
        zipCodes.add(22);
        zipCodes.add(55);
        //first
        System.out.println(zipCodes.first()); //11 ascending order
        System.out.println(zipCodes.last());  //55

        zipCodes.pollFirst();                 //pollFirst
        System.out.println(zipCodes);
        zipCodes.add(77);
        Integer i = zipCodes.pollLast();


        zipCodes.pollLast();                  //descending
        System.out.println(zipCodes);

        //descendingSet
        System.out.println(zipCodes.descendingSet());

    }
}
