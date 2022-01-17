package AccesModifiers;

import java.security.spec.RSAOtherPrimeInfo;

public class Animal {

    public String namePublic;
    private String colorPrivate;
    protected int ageProtected;
    String breedDefault;

    public void speakPublic(){
        System.out.println("Speaking");
    }
    private void eatPrivate(){
        System.out.println("eating");
    }
    protected void runProtected(){
        System.out.println("Running");
    }
    void sleepDefault(){
        System.out.println("Sleeping");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eatPrivate();
        animal.colorPrivate= "White";
        System.out.println(animal.colorPrivate);


    }
}
