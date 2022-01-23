package OOP.FinalPractice;

 final public class TShirt extends Shirt{

//    public void wash(){   - yuo  can't override the final methode
//        System.out.println("You can wash this Tshirt");
//    }


    @Override
    public boolean fit(char size) {
        return true;
    }
}
