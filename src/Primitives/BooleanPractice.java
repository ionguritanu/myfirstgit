package Primitives;

public class BooleanPractice {

    public static void main(String[] args) {
        int number = 11;
        System.out.println(number);
        System.out.println(11);

        boolean isHungry = true;
        System.out.println(isHungry);

        boolean isLightOn = false;
        System.out.println(isLightOn);

        System.out.println(true);
        System.out.println(isHungry == isLightOn);

        isLightOn = isHungry;
        isLightOn = false;

        System.out.println("Last version for isHungry>> " +isHungry);
        System.out.println("Last for is light.." +isLightOn);


    }
    }


