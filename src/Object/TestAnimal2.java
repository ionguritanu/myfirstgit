package Object;

import Object1.Animal1;

public class TestAnimal2 {
    public static void main(String[] args) {

        Animal duck = new Animal();
        duck.info();

        Animal bird = new Animal();
        bird.name= "Woody";
        bird.age = 30;
        bird.breed= "Husky";
        bird.energy =70;
        bird.run();
        bird.info();

    }
}
