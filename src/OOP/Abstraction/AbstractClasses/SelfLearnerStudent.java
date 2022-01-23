package OOP.Abstraction.AbstractClasses;

public class SelfLearnerStudent extends Student{


    //methods
    public void attend(){
        System.out.println("Self learner is attending");
    }
    public void watch (){
        System.out.println("Se;f ;earner is watching");
    }
    public void sleep(int hour){
        System.out.println("Self learner is sleeping");
    }


    //constructor
    public SelfLearnerStudent(){
        super("Halich", 22);
    }
}
