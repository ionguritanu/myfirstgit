package Object;

public class Test_Static {
    public static void main(String[] args) {
        // you can call static method from another class by using name of th class
        // no need to create object

        Pet_Static_Practice.eat();
        Pet_Static_Practice pet  = new Pet_Static_Practice();
        pet.eat();

        //pet.play();
        //System.out.println(pet.food);

    }
}
