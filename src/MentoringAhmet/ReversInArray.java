package MentoringAhmet;

public class ReversInArray {
    // print out each of the word and reverse them from array
    //String example= "Hi guys how are you"
    // output = ih
    //          syug

    public static void main(String[] args) {
        String example= "Hi guys how are you";

       String array[] =  example.split(" "); //to store it in array
        for(int i =0; i< array.length;  i++){
            String reverse = "";
            for (int k =array[i].length()-1;  k >= 0; k--){
                 reverse += array[i].charAt(k);
             }
            System.out.println(reverse);
        }




    }
}
