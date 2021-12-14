package Loops.forLoop;

public class nested_digital_clock {
    public static void main(String[] args) {

        //print hours and minutes for 12h
        // ex

        label:                                       //word to label the loop
        for(int hour =0; hour<12; hour++){

            inner:
            for (int min = 0 ; min <= 59 ; min++){

                if(min>=10 && min<=12){              // this is to skip the number 10-12 in minutes
                    continue;
                }

                if (min>=30){

                    break label;                     // brakes the label
                }

                for (int sec = 0 ; sec <= 59 ; sec++){

                System.out.println(hour + " : "+  min  + " : "+ sec);
                if (sec==10)
                break ;
            }

         }
      }
   }
}
