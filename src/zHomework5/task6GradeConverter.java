package zHomework5;

import java.util.Scanner;

public class task6GradeConverter {
    public static void main(String[] args) {

        //Using scanner ask user to enter grade letter and
        // print the number value matcing with this grade.
        // Example: Input : A Output: 4.0 Input: A- Output: 3.7 NOTE:
        // The University uses a 4 point scale for grades; these “quality” grades are as follows
        // 4.0 = A, 3.7 = A-,
        // 3.3 = B+, 3.0 = B, 2.7 = B-,
        // 2.3 = C+, 2.0 = C, 1.7 = C-,
        // 1.3 = D+, 1.0 = D,
        // 0.0 = F

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your grade in letter.");

        String grade = "";
        grade = input.next();
        double value = 0;


        if (grade.equals ("A"))
            System.out.println(value = 4.0);
        else
        if (grade.equals("A-"))
            System.out.println(value = 3.7);
        else
        if (grade.equals("B+"))
            System.out.println(value = 3.3);
        else
        if (grade.equals("B"))
            System.out.println(value = 3.0);
        else
        if (grade.equals("B-"))
            System.out.println(value = 2.7);
        else
        if (grade.equals("C+"))
            System.out.println(value = 2.3);
        else
        if (grade.equals("C"))
            System.out.println(value = 2.0);
        else
        if (grade.equals("C-"))
            System.out.println(value = 1.7);
        else
        if (grade.equals("D+"))
            System.out.println(value = 1.3);
        else
        if (grade.equals("D"))
            System.out.println(value = 1.00);
        else
        if (grade.equals("F"))
            System.out.println(value = 0.0);
    }
}

// if (letter.equals("A")){
// System. out. println("4.0");
// }
// if (letter == ("A-")){
// System. out. println("3.7");
// }
// if (letter == ("B+")){
// System. out. println("3.3");
// }
// if (letter == ("B")){
// System. out. println("3.0");
// }
// if (letter == ("B-")){
// System. out. println("2.7");
// }
// if (letter == ("C+")){
// System. out. println("2.3");
// }
// if (letter == ("C")){
// System. out. println("2.0");
// }
// if (letter == ("C-")){
// System. out. println("1.7");
// }
// if (letter == ("D+")){
// System. out. println("1.3");
// }
// if (letter == ("D")){
// System. out. println("1.0");
// }
// if (letter == ("F")){
// System. out. println("0.0");
// }


// 4.0 = A,
// 3.7 = A-,
// 3.3 = B+,
// 3.0 = B,
// 2.7 = B-,
// 2.3 = C+,
// 2.0 = C,
// 1.7 = C-,
// 1.3 = D+,
//  1.0 = D,
//  0.0 = F,

// double value1 = 4.00;
// double value2 = 3.70;


// if (grade == "A"){
//   System.out.println("4.0");
// } else if (grade == "A-"){
//  System.out.println("3.7");
// }




