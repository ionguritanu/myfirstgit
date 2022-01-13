package Java_Coding_Interview_questions;

import java.util.Arrays;

public class No1__swap_2_numbers {
    public static void main(String[] args) {

                                       //task 1.a  swap numbers
//        Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a
//        temporary variable?

        int a = 5;
        int b = 10;

        a= a+b;   // 5 + 10 = 15
        b = a-b;  // 15 - 10 = 5
        a = a-b;  // 15 - 5 = 10
        System.out.println(a);
        System.out.println(b);


        System.out.println("============");

                                         //task 1.b swap words


        String x = "Hello";
        String y = "Techtorial";
        x = x + y; // HelloTechtorial

        y = x.substring(0,x.length()-y.length());
        x = x.substring(y.length());
        System.out.println(x);
        System.out.println(y);

        System.out.println("=============");
                                          // task 2

    //2. Write a java program to find the second largest number in the array? Maximum and
    //minimum number in the array?

        int [] numArray = {3, 78, 56, 100, 5, 2};
        Arrays.sort(numArray);
        System.out.println(numArray[numArray.length-2]);

       //task 5
        //revers string word by word  using charAt()
        String toRevers = "Hello World";
        String reversed = "";
        for(int i = toRevers.length()-1; i>=0; i--){
            reversed = reversed+toRevers.charAt(i);

        }
        System.out.println(reversed);

        // using charArray()

        String reversed1 = "";
        char[] array = toRevers.toCharArray();
        for (int i= array.length-1; i>=0; i--){
            reversed1+= array[i];
        }
        System.out.println(reversed1);


        //using substring
        String reversed2 = "";
        for (int i = toRevers.length();i>=1;i--){
            reversed2+= toRevers.substring(i-1,i);
        }
        System.out.println(reversed2);


        //reverse a strinword by word


        int [] array11 = {1,2,3,4,5,6};
        int [] reverse11=new int[array11.length];
        // quastion reverse the array please
        int ac =0;
        for(int i = array11.length-1; i>=0; i--){
            reverse11[ac]=array11[i];
            ac++;

        }
        System.out.println(Arrays.toString(reverse11));


        //revesing an array[]
         int [] numbers = {1,2,3,4,5,6};
         int [] numbers12 =  new int [numbers.length];
         int f = 0;
         for (int r = numbers.length-1; r>=0; r--){
             numbers12[f]= numbers[r];
             r++;

         }

        System.out.println(numbers12);






    }

}
