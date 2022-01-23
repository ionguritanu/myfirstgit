package OOP.Abstraction.Interfaces;

public interface CanFly {

    //all variables in interface are public and final
    int NUMOFWINGS = 2;
    int numTail= 1;

    //all methodes in interface are public and abstract
     void fly();

     default void info(){
         System.out.println("Info of CanFly " + numTail+ "-" + NUMOFWINGS);
     }




}
