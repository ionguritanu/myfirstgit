package Set;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniquePractice {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Iov");
        names.add("Iov");
        names.add("Davis");
        names.add("Ele");
        names.add("Maria");
        names.add("Ele");

        HashSet<String> hashSet = new HashSet<>();
        //firs idea
        hashSet.addAll(names);
        System.out.println(hashSet);

        // second idea
        HashSet<String> hashSet1 = new HashSet<>();
        for (String name : names){
            hashSet1.add(name);
        }
        System.out.println(hashSet1);

        //third idea
        HashSet<String> hashSet2 = new HashSet<>(names);
        System.out.println(hashSet2);

        System.out.println(names);

        //how to find unique nums in array
        //how to find duplicate in array

        System.out.println("===============");

        HashSet items = new HashSet();             //converting from Hash to ArrayList
        items.add("Microphone");
        items.add("Cable");
        items.add("Computer");

        List listOfItems = new ArrayList(items);
        System.out.println(listOfItems);


    }
}
