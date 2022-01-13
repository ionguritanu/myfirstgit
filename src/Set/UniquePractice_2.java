package Set;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class UniquePractice_2 {

    public static void main(String[] args) {

        String [] letters = {"a", "b", "c", "d","d"};

       // HashSet<String> hashSet = new HashSet<>();

        //convert


        List listOfLetters = Arrays.asList(letters);
        System.out.println(listOfLetters);
        TreeSet setOfLetters = new TreeSet(listOfLetters);
        setOfLetters.add("x");
        System.out.println(setOfLetters);

        HashSet set = new HashSet(Arrays.asList(letters));


        //task2
        //show/print duplicates elements

        String [] letters1 = {"a","a", "b", "c", "d","d", "t", "t", "a"};

        HashSet <String > hashSet = new HashSet<>();
        ArrayList duplicatesStorage = new ArrayList();
        for(String letter : letters1){
           if( !hashSet.add(letter)){
               System.out.println(letter);
               duplicatesStorage.add(letter);  //to store in different storege

           }
        }
        System.out.println(hashSet);
        System.out.println(duplicatesStorage);

    }
}
