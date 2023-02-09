package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
μετατρέπει μέρες, ωρες, λεπτα, δευτερολεπτα σε δευτερολεπτα
 */
public class DHMToSecondsApp {

    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       final int SEC_PER_DAY = 3600 * 24;
       final int SEC_PER_HOUR = 3600;
       final int SEC_PER_MINUTE = 60;
       long totalSeconds ;
       long inputDays ;
       long inputHours;
       long inputMinutes;
       long inputSecs ;

        System.out.println("Please insert days, hours, minutes, seconds (ints)");
        inputDays = in.nextLong();
        inputHours = in.nextLong();
        inputMinutes = in.nextLong();
        inputSecs = in.nextLong();

        totalSeconds = (inputDays * SEC_PER_DAY) + (inputHours * SEC_PER_HOUR)+ (inputMinutes * SEC_PER_MINUTE) + inputSecs;
        System.out.printf("totalSeconds = %,d", totalSeconds);
    }
}
