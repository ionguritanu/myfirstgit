package ArrayList;

import java.util.Arrays;
import java.util.List;

public class Array_to_ArrayList {
    public static void main(String[] args) {

      int [] number = {1,2,3,4,5,};
      List <int[]>listNumbers = Arrays.asList(number);

        Integer [] number1 = {1,2,3,4,5,};
        List<Number> listNUmber1 = Arrays.asList(number1);

        System.out.println(listNUmber1);
       // System.out.println(listNUmber1.add(7));  // UnsupportedOperationException

        System.out.println(listNumbers);
    }
}
