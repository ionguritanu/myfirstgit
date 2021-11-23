package Primitives;

public class TruthTable2 {
    public static void main(String[] args) {
        // there is an event for kids
        // if the age of child is 6 or less OR if the height of child is 48 inches or less
        // the event is free for that child

        int reqAge = 6;
        double  reqHeight = 48;
        int kidAge = 7;
        double kidHeight = 47;
        boolean isFree = reqAge >= kidAge || reqHeight >= kidHeight;
        System.out.println("Is the event free? "+ isFree);

        // find out if student can pass class
        // there are 3 tests taken --> 60,100,85
        // average of those tests has to be more than 70 or more
        // attendance rate of the student has to be 80% or more
        int test1 = 90;
        int test2 = 60;
        int test3 = 100;
        int average = (test1 + test2 + test3) / 3;
        System.out.println(average);
        int reqAverage = 70;
        int reqAttendance = 80;
        int studentAttendance = 85;

        boolean canPass =  average >= reqAverage && studentAttendance >= reqAttendance;
        System.out.println(average);
        System.out.println("Can student pass? "+ canPass);



    }
}
