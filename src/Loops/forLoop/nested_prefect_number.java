package Loops.forLoop;

public class nested_prefect_number {
    public static void main(String[] args) {
        // perfect number
        // if sum of the division(except number itself)equals to number, it is called perfect num - ex 28
        //1,2,4,7,14,
        int number = 28;
        int sum = 0;

        for ( int divisor = 1 ; divisor <= number/2;  divisor++ ){

            if (number % divisor == 0){
                sum += divisor;
            }
            if(number == sum){
            System.out.println(number + " is a perfect number");
            }else {
                System.out.println(number + " is NOT a perfect number");


            }
         }

    }
}

//if (inputNumber % divisor == 0) {
//                System.out.println(divisor + " is divisor of " + inputNumber);