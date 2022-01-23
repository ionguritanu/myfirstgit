package OOP.Abstraction.Interfaces;

import org.w3c.dom.ls.LSOutput;

public class Duck  extends CanRun implements CanSwim, CanFly{

    public void run(){
    }


    public void fly(){
        System.out.println("Duck is flying");
    }

    public  int swim(int km){
        System.out.println("Duck is swiming");
        return  km;
    }

}
