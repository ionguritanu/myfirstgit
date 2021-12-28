package Object;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MethodePractice1 {

//     `create a method that will calculate age of a person,
//    `does not return age,
//            `will take birth year as parameter,
//    `user provides the birth year
//    `will print age of person
//

    public void ageCalculator(int birthYear) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your B-day year");
        birthYear = input.nextInt();
        int age = LocalDateTime.now().getYear() - birthYear;
        System.out.println("The age is " + age);

    }

    // overload age claculator nethod by passing name of th epersone as parameter

    public int ageCalculator(int birthYear, String name) {

        int age = LocalDateTime.now().getYear() - birthYear;
        System.out.println("The age is " + age);
        System.out.println("Overload age calculator method ");
         return age;

    }



    public static void main(String[] args) {
        MethodePractice1 object2 = new MethodePractice1();
        object2.ageCalculator(2013);

        int []  nums = {1,2,3,4,5,6,7,};
        double v = object2.sumOfArrayElements(nums);
        System.out.println(v);
        System.out.println(object2.sumOfArrayElements(nums));


       double w =  object2.sumOfArrayElements(new int[] {1,2,3,4});
        System.out.println(w);

        }



    // create a methode that will int array as a parameter and will calculate sum of the nums in this array
    // and it will retun the sum as double

    //{1,2,3,4,5,6,7,}
    public double sumOfArrayElements(int [] ids){

        double sum = 0;
             for (double id : ids){
                 sum+= id;
             }
        return sum;
    }

    }














