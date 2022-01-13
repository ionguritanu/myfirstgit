package MentoringAhmet;

import java.util.Arrays;

public class RemoveDublicatesFromArray {

    public static void main(String[] args) {
        // int array [] = {3,6,8,3,2,7,9,9};
        // remove duplicates from array

        int array[] = {3, 6, 8, 3, 2, 7, 9, 9};
        String unique = "";
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            {
                for (int k = 0; k < i; k++) {
                    if (array[i] == array[k]) {
                        isUnique = false;

                    }
                }
                if (isUnique) {
                    unique += array[i] + " ";
                }
            }
            String[] uniqueNumbers = unique.split(" ");
            System.out.println(Arrays.toString(uniqueNumbers));

        }
    }
}

