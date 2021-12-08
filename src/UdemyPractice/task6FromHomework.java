package UdemyPractice;

import java.util.Scanner;

public class task6FromHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String threeWords = scanner.next();

        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int num2 = number +1;
        int num3 = num2 + 1;

        //char c = scanner.next().charAt(0);



        int indexOfSpace = threeWords.indexOf(" ");
        String firstWord = threeWords.substring(0, indexOfSpace);  // removing the first word

        String lastTwoWords = threeWords.substring(indexOfSpace+1);

        int secondIndexOfSpace = lastTwoWords.indexOf(" ");
        String secondWord = lastTwoWords.substring(0, secondIndexOfSpace);

        String thirdWord = lastTwoWords.substring(indexOfSpace +1);

        System.out.println("" + firstWord.charAt(0) + secondWord.charAt(0) + thirdWord.charAt(0));


//        firstWord = firstWord.replace("0", 'number ');
//        System.out.println(firstWord);
        //String  hgh = (firstWord.replace());
        //System.out.println(hgh);

        int replace = scanner.next().charAt(1);
        System.out.println(replace);

//        String str = "CodeSpeedy is a very good website for coding solution";
//                String replacedstring=str.replace('i', 'p');
//                System.out.println(replacedstring);
    }
}
