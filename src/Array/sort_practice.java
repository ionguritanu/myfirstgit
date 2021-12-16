package Array;

import java.util.Arrays;

public class sort_practice {
    public static void main(String[] args) {

        int [] zipCodes = {61212,91213,11214,71215};

        System.out.println(Arrays.toString(zipCodes)); //[61212, 91213, 11214, 71215]

        Arrays.sort(zipCodes);                         //it will arrange data in ascending order
        System.out.println(Arrays.toString(zipCodes)); //[11214, 61212, 71215, 91213]

        String[] colors = {"violet", "pink", "RED", "white", "black", "red", "brown"};
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

    }
}
