package zProject1;

public class Task5MinutesToYears {
    public static void main(String[] args) {


        int minutes = 3456789;
        int days = minutes / 60 / 24;
        int years = days/365;
        int resultDays = days%365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + resultDays + " days");
    }
}