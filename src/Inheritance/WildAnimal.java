package Inheritance;

import javax.sound.midi.Soundbank;

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
