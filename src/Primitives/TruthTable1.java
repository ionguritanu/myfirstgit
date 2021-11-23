package Primitives;

public class TruthTable1 {
    public static void main(String[] args) {
        // visa and ticket
        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean canTravel = visa == myVisa && ticket == myTicket;
        System.out.println(canTravel);

        // ask question
        boolean online = true;
        boolean campus = true;
        boolean student = true;
        boolean askQuestion = student == online || student ==  campus;
        System.out.println("Can I ask question? "+ askQuestion);

        // 90% and more attendance and score of 80 or more and more to pass this class
        int reqAttendance = 90;
        int reqScore = 80;
        int yourAttendance = 100;
        int youScore = 89;
        boolean pass = yourAttendance >= reqAttendance && youScore >= reqScore;
        System.out.println("Can I pass the course?>> "+ pass);








    }
}
