package Array.ForEachPractice;

public class for_each1 {
    public static void main(String[] args) {
        double[] checks = {2540, 10000, 100000, 65.50, 1.99};
        //by using foreach loop printout the total of checks
        double total= 0;
        for (double check : checks){
            total+= check;

        }

        System.out.println(total);
    }
}
