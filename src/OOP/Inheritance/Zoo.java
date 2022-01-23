package OOP.Inheritance;

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

        //recape
        Animal recapAnimal = new recapAnimal();
        recapAnimal.name = "Hex";
        System.out.println(recapAnimal.name);

    }
}
