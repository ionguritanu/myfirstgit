package Object;

public class Pet_Static_Practice {

    String name;
    int age;
    String color;
    static double food = 20;

     public static  void eat(){

        food-=1;
        System.out.println("Food amount is now "+ food);
        // to call non- static methode into static
         // method we need t create tne object
         Pet_Static_Practice pet3 = new Pet_Static_Practice();
         //pet3.play();

    }

    public void play (){   // non static methode
        System.out.println("Pet is playing ");
        eat();
        Pet_Static_Practice.eat();
        food = 100;
        color = "blue";
    }

    public static void main(String[] args) {

        Pet_Static_Practice pet1 = new Pet_Static_Practice();

        pet1.eat();
        pet1.eat();
        Pet_Static_Practice pet2 = new Pet_Static_Practice();

        pet2.eat();
        pet1.eat();
        pet2.eat();

        // ==
        eat();
        Pet_Static_Practice.eat();  // calling the object using class name

        // Non-static method can not be called  without object from a static method
//        play();
//        Pet_Static_Practice.play():


    }
}
