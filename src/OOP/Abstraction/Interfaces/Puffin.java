package OOP.Abstraction.Interfaces;

public class Puffin extends CanRun implements CanFly, CanSwim{

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void info() {
        CanFly.super.info();
    }

    @Override
    public int swim(int mile) {
        return 0;
    }


}
