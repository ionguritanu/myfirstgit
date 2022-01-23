package OOP.Inheritance;

public class recapAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("Every animal is eating");
    }

    public void jump(){
        System.out.println("Recap animals are jumping");
    }

}
