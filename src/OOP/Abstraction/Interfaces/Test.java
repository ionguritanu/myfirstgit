package OOP.Abstraction.Interfaces;
public class Test {

public static void main(String[] args) {
        //   CanFly canFly=new CanFly()  you can not create a instance object
        Shark shark = new Shark();
        shark.swim(4);


        Eagle eagle= new Eagle();
        eagle.color=" Black";
        eagle.fly();

        Duck duck= new Duck();
        duck.fly();
        duck.swim(2);

        System.out.println(shark);
        System.out.println(eagle);
        System.out.println(duck.NUMOFWINGS);
        System.out.println(duck.FIN);
        // Duck.FIN=0; YOU CAN NOT RE-INITIALIZE VARIABLES WHICH ARE COMING FROM INTERFACE
        //INTERFACE VARIABLES ARE PUBLIC AND FINAL BY DEFAULT

        duck.info();
        //duck.name=
        //System.out.println(duck.);

        System.out.println(duck);



        Puffin puffin = new Puffin();
        puffin.run();


    }
 }




