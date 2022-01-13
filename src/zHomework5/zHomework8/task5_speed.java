package zHomework5.zHomework8;

import java.util.Scanner;

public class task5_speed {
    public static void main(String[] args) {
        //The user using a scanner enters the current speed and target speed .
        // In every 1-sec car's speed will increase 10mil.
        // Please find the total number of sec to reach your target speed using a while loop.
        // Example: CurrentSpeed: 6 Target Speed: 20 Output: 2.
        // -> Because in two seconds user can reach the target speed.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter current speed");
        int current=input.nextInt();
        System.out.println("Enter target speed");
        int target=input.nextInt();
        int second=0;
        while(current<=target){
            current+=10;
            second++;


        } System.out.println(second);
        }
    }

