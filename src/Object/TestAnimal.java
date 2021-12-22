package Object;

import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {

        String str = new String("test");
        Scanner scanner = new Scanner(System.in);

        Animal cat = new Animal();

        System.out.println(cat.name);
        cat.name = "Leo";
        System.out.println(cat.name);
        cat.age = 9;
        cat.color= "orange";
        System.out.println(cat.age);
        System.out.println(cat.color);

        //crate a dog animal, try to use instance variable with your nuew object

        Animal dog = new Animal();

        dog.name = "Barsik";
        System.out.println(dog.name);

        dog.age = 5;
        System.out.println(dog.age);

        dog.color = "black";
        System.out.println(dog.color.concat(cat.color));

        dog.gender ='M';
        System.out.println(dog.gender);

        System.out.println(dog.breed);
        System.out.println(cat.breed);
        cat.breed= "Scottish";
        System.out.println(cat.breed);

        cat.sleep();
        dog.sleep();

        cat.eat();
        dog.eat();

        cat.run();
        System.out.println(cat.energy);
        dog.run();
        cat.run();
        cat.run();// 70
        cat.sleep();
        System.out.println(cat.energy);
        // charge up the animal when they sleep




    }
}
