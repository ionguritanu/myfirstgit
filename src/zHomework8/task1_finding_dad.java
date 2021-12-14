package zHomework8;

import java.util.Scanner;

public class task1_finding_dad {
    //Using scanner ask user to provide the string value.
    // Print "dad" if the given string contains the "dad",
    // but where the middle 'a' char can be any char otherwise please do not print anything.
    // Please look carefully examples below.
    // Example: Input the year: testdadtest Output :dad
    // Input the year: testd7dtest Output :dad
    // Input the year: testdodtest Output :dad
    // Input the year: testDudtest Output :dad

    public static void main(String[] args) {
        System.out.println("Enter a string value");

        Scanner input = new Scanner(System.in);
        String value = input.nextLine();


        int a=1;
        int b=3;
        if(value.substring(b).contains("d") && value.substring(a+2).contains("d"))
        {
            System.out.println("dad");
        }

      }
    }


