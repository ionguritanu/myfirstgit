package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Practice {

    public static void main(String[] args) {

        HashSet ids = new HashSet();

        HashSet <Integer> ids1 = new HashSet();   //declaring class and limited to HAshSet

        Set <Integer> ids2 = new HashSet();       // is getting everything from set interface

      ids1.add(22);
      ids1.add(33);
      ids1.add(44);
      ids1.add(99);

        System.out.println(ids1);
        System.out.println(ids1.hashCode());  //sums the added ids
       ids1.add(null);
        System.out.println(ids1);
        ids1.add(null);
        System.out.println(ids1);
        ids1.add(22);
        System.out.println(ids1);

        for(Integer id : ids1){
        if(id == null){
            continue;
        }
            System.out.println(id*2);
        }

        //Iterator
        Iterator iterator = ids1.iterator();  //used for colection
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
