package OOP.Inheritance;

public class WildAnimal extends Animal {

    String name;

    public void hunting(){
        System.out.println("Wild animal is hunting");
    }

    @Override
    public void run() {
        System.out.println(name+ " is running");
    }
}
