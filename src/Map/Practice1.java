package Map;

import java.util.HashMap;

public class Practice1 {
    public static void main(String[] args) {

        HashMap <Integer, String> map = new HashMap();
        //put()
        map.put(1, "Enes");
        map.put(2, "Alex");
        map.put(3, "Enes");
        map.put(4, "David");
        map.put(4, "Alex"); // if you try to store same key multiple times it will update the value
        System.out.println(map);


        map.put(null, "Enes");
        System.out.println(map);

        map.put(null, "David");
        System.out.println(map);

        // get()method
        System.out.println(map.get(2)); //get value for key
        System.out.println(map.get(3));
        System.out.println(map.get(null));

        //remove methode\
        map.remove(null);
        System.out.println(map);
        System.out.println(map.remove(1,"Enes"));
        System.out.println(map);

        // replace()
        map.replace(2,  "Jennifer");
        System.out.println(map);

        map.replace(2, "Jennifer", "Zack");
        System.out.println(map);

        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(19));
        System.out.println(map.containsValue("Enes"));

        //size()
        System.out.println(  map.size());

        System.out.println(map.isEmpty());

        //putAll()

        HashMap <Integer, String> map1 = new HashMap();
        map1.put(1, "White");
        System.out.println(map1);
        map1.putAll(map);

        System.out.println(map1);
        map1.put(9, "Brian");
        System.out.println(map1);



    }
}
