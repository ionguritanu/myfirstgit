package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_To_Array {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Dima");
        names.add("Ion");
        names.add("Lola");
        names.add("Ivan");
        System.out.println(names);

        //concerst to arrayList to Array

        names.toArray();
        Object[] arrayName = names.toArray();
        System.out.println(Arrays.toString(arrayName));

       // arrayName[arrayName.length] = "Iov";
        //System.out.println(Arrays.toString(arrayName));

    }
}
