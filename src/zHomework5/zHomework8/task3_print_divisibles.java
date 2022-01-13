package zHomework5.zHomework8;

import java.util.Scanner;

public class task3_print_divisibles {
    public static void main(String[] args) {
        //Using a scanner ask the user to provide starting and ending numbers.
        // Print the numbers divisible by 3 and 5 between given number
        // AND ONLY print count of those numbers which is divisible by 3 and 5.
        // EXAMPLE: First number: 5 Second number: 65 Output: 4
        // -> Because between 65 and 5 there is only 4 number divisible by 3 and 5 which
        // -> are 15 30 45 and 60 but in this task please do not print anything else just the
        // count of number which are divisible by 3 and 5.

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a starting number");
        int num1 = input.nextInt();                               //first input
        System.out.println("Pleas enter a ending number");
        int num2 = input.nextInt();                                //second input

        int count = 0;

        do {
            if (  num1 % 3 == 0 && num1 % 5 == 0) {
                count++;

            }num1++;
        }while (num1 < num2);
        System.out.println(count++);
    }
}

//        do {
//            if (num1 % 3 == 0 && num1 % 5 == 0) {
//                num1++;
//                System.out.println(num1);
//
//            //System.out.println(count);
//
//        }while (num1 < num2) ;
//        count++;


//         if (num1 % 3 == 0 && num1 % 5 == 0){
//             num1++;{
//
//             }
//             System.out.println(num1);
//         }while (num1<num2);




//        while (num1<num2){
//            if (num1 % 3 == 0 && num1 % 5 == 0);
//               num1++;
//
//        }
//        count++;
//        System.out.println(count);






//int divisibleXY(int x, int y, int n){
//       int count = 0;
//   for (int i = 1; i <= n; i++) {
//      if(i%x==0 && i%y!=0 )
//         { count++; }
//   }
//   return count;
//}