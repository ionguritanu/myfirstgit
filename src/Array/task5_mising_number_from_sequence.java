package Array;

public class task5_mising_number_from_sequence {
    public static void main(String[] args) {
        //finding the missing number from sequence
        int[] numbers = {4,5,7,8,9};
        int sum1=0;
        int sum2=0;

            for(int a : numbers){
                sum1+=a;

        }
            for(int i=4; i<=9; i++){
                sum2+=i;
            }
        System.out.println("Missing number is " + (sum2-sum1));
    }
}
