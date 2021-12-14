package Loops.for_loop;

public class nested_MothsOfYears {
    public static void main(String[] args) {

        // print out months of the year between 2020 -2023
        //2020  ---- 1, 2 3


        for (int year =2020; year <= 2023; year++ ){

            System.out.print(year +" -- ");


            for (int months = 1; months<= 12; months++){

                System.out.print(months+ " ");

             }
            System.out.println();
        }


        //////////////

        for (int year =2020; year <= 2023; year++ ){

            System.out.print(year +" --> ");
            System.out.println(" ");

            for (int months = 1; months<= 12; months++){

                System.out.print(months+ " ");
             switch (months){
                 case 1:
                     System.out.println("Jan");
                     for (int m =1; m <30; m++){
                         System.out.print(m +" ");
                     }
                     System.out.println(); ////space
                     break;
                 case 2:
                     System.out.println("Feb");
                     break;
                 case 3:
                     System.out.println("March");
                     break;
                 case 4:
                     System.out.println("April");
                     break;
                 case 5:
                     System.out.println("May");
                     break;
                 case 6:
                     System.out.println("June");
                     break;
                 case 7:
                     System.out.println("July");
                     break;
                 case 8:
                     System.out.println("August");
                     break;
                 case 9:
                     System.out.println("Sep");
                     break;
                 case 10:
                     System.out.println("Oct");
                     break;
                 case 11:
                     System.out.println("Nov");
                     break;
                 case 12:
                     System.out.println("Dec");
                     break;

             }
            }
            }
            System.out.println();


    }

}
