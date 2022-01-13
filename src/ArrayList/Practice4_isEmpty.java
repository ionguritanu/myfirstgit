package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice4_isEmpty {
    public static void main(String[] args) {

        List <Integer> ids = new ArrayList<>();

        ids.add(11); //autoboxing and is adding to arraylist
        ids.add(22);
        ids.add(33);
        ids.add(44);

        //is empty
        System.out.println( ids.isEmpty()); //false

        // contains
        System.out.println(ids.contains(22)); //true
        System.out.println(ids.contains(55)); //false

        //clear();
        System.out.println(ids);

        ids.removeAll(ids);
        System.out.println(ids);

        ids.clear();
        System.out.println(ids);
        System.out.println(ids.size());
        System.out.println(ids.isEmpty());


    }
}
