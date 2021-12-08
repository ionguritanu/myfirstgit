package UdemyPractice;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your grade in letter.");


        String grade = "";
        double gradeValue = 0;

        if (grade.equals ("A"))
            gradeValue= 4.00;
        else if (grade.equals("A-"))
            gradeValue= 3.67;
        else if (grade.equals("B+"))
            gradeValue = 3.33;
        else if (grade.equals("B"))
            gradeValue = 3.00;
        else if (grade.equals ("B-"))
            gradeValue = 2.67;
        else if (grade.equals("C+"))
            gradeValue = 2.33;
        else if (grade.equals("C"))
            gradeValue = 2.00;
        else if (grade.equals ("D+"))
            gradeValue = 1.33;
        else if (grade.equals ("D"))
            gradeValue = 1.00;
        else if (grade.equals ("F"))
            gradeValue = 0;
        else if (grade.equals ("FX"))
            gradeValue = 0;
    }
}
