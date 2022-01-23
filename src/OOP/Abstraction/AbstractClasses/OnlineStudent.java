package OOP.Abstraction.AbstractClasses;

public class OnlineStudent extends Student {

    public void attend(){
        System.out.println("Online students are attending via zoom");
    }
    public void watch(){
        System.out.println("Online student is watching now");
    }
    public OnlineStudent(){
        super("Mry", 22);
    }

    public void sleep(int b){
        System.out.println("Online student is sleeping");
    }
}
