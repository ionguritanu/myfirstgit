package Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name="Leo";
        animal.eat();
        DomesticAnimal domesticAnimal= new DomesticAnimal();
        domesticAnimal.eat();
        Cat cat = new Cat();
        cat.eat();

        WildAnimal wildAnimal = new WildAnimal();
        System.out.println(wildAnimal.name);
        wildAnimal.hunting();
        wildAnimal.run();
        wildAnimal.name= "Maugli";
        wildAnimal.run();
        Lion lion = new Lion();
        lion.run();
    }
}
