package MentoringAhmet.RealInterviewQuestions;

import java.util.Arrays;

public class LargestSecondNumber<array> {
    public static void main(String[] args) {


        //find the largest an d second largest with the sorth meyhode

        int[] array = {100, 300, 200, 450, 350};
        int largest = array[0];
        int secondLargest = 0;
        for(int i  = 0; i<array.length; i++){
            if (array[i] > largest){
                secondLargest=largest;
                largest= array[i];

            }else if (array[i]> secondLargest && array[i] != largest){
                secondLargest= array[i];
            }

        }
        System.out.println("The largest num is "+ largest + " and second largest = "+ secondLargest);

//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(array[array.length-1]);
//        System.out.println(array[array.length-2]);
        
    }
}