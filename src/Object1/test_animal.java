package Object1;

import java.util.Scanner;

public class test_animal {
    public static void main(String[] args) {

        String str = new String("test");
        Scanner input = new Scanner(System.in);

        Animal1 cat = new Animal1();
        System.out.println(cat.name);
        cat.name = "hex";
        System.out.println(cat.name);

        cat.color = "grey";
        System.out.println(cat.color);

        cat.color = " ";
        System.out.println(cat.color);

        cat.run();
        cat.run();

    }
}