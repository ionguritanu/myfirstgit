package MentoringAhmet;

public class SumOfAll {
    public static void main(String[] args) {
//       *Write a method that receive an integer array and find the even numbers total and find the
//                * sum of odd numbers and difference between them
//                * 1- create a method
//    * 2-find the sum of even numbers
//                * 3-find the sum of odd numbers
//                * 4-find the difference between them
//     */
        int [] array = {1,2,3,4,5,6,7,8,9,22,65,76};
        //
         int sumOdd = 0;
         int sumEvenNumber = 0;

         for (int i= 0; i < array.length; i++){
             if (i % 2 ==0)
                 sumEvenNumber+= i;

              if ( i % 2 != 0)
                 sumOdd+=i;

         }
        System.out.println(sumEvenNumber);
        System.out.println(sumOdd);
    }
}
