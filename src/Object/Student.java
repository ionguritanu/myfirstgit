package Object;

import java.util.Random;

public class Student {

    String name ;
    int age = 23;
    static int id;

    public void setId(int number){
        id = number;

    }
    public void study(){


        System.out.println(name + " is studing " + createHour() + " hours");
    }

    public void sleep(){
        System.out.println(name + " is sleeping "+ createHour() +" hours");

    }

    public void reading() {
        System.out.println(name + " is reading " + createHour() + " hours");
    }
        public static int createHour(){
            Random random = new Random();
            return random.nextInt(12);


    }

    public static void main(String[] args) {
        Student student1= new Student();
        student1.name = "Jon";

        student1.study();
        student1.reading();

        System.out.println(createHour());
    }

}
