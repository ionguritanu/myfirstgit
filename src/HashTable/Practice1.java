package HashTable;

import java.util.Hashtable;

public class Practice1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashTable = new Hashtable<>();
        hashTable.put(4,"cherry");
        hashTable.put(5,"kiwi");
        hashTable.put(1,"apple");

        System.out.println(hashTable);
        System.out.println(hashTable.get(2));
        System.out.println(hashTable.get(1));

        System.out.println(hashTable.keySet());
        System.out.println(hashTable.values());
        System.out.println(hashTable.entrySet());

        // adding null key or null value
        System.out.println(hashTable);

        Hashtable<String, String> hashtable1 = new Hashtable<>();
        hashtable1.put("a", "b");
        hashtable1.put("c", "f");
        hashtable1.put("v", "q");
        System.out.println(hashtable1);

    }
}
