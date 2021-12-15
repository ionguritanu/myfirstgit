package Array;

import java.util.Arrays;

public class stringPrctice {
    public static void main(String[] args) {

        String [] names = new String [6];

        System.out.println(Arrays.toString(names));

        names[5] = "Alex";
        names[4] = " Dinara";
        names[2] = " Anna";
        names[0] = " Mary";
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);

        //shall all values from the names array

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        //System.out.println(Arrays.toString(names));

    }
}
