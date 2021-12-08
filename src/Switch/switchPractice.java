package Switch;

public class switchPractice {
    public static void main(String[] args) {

        int number = 500;
        System.out.println("Before switch");
        switch (number){



            case 110:
                System.out.println("This is second case");
            break;

            case 115:
                System.out.println("This is third case");
                break;

            case 123:
                System.out.println("This is fourth case");
                break;

            case 130:
                System.out.println("This si fifth case");
                break;

            case 100:
                System.out.println("This is first case");
                break;

            default:
                System.out.println("This is default case");
                break;

        }
        System.out.println("After switch ");

    }
}
