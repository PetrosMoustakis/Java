package gr.aueb.cf.ch2;

/*
Διαβαζει απο τον χρηστη εναν ακεραιο που αντιστοιχει στο πληθος
των δευτερολεπτων και μετατρεπει σε ημερες, ωρες, λεπτα και
εναπομειναντα δευτερολεπτα και εκτυπωνει το αποτελεσμα στην οθονη.
*/

import java.util.Scanner;

public class SecondsApp {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int inputSeconds = 0;
        int remainingSeconds = 0;
        int days = 0;
        final int Day = 24*3600;
        int hours = 0;
        int minutes = 0;
        final int Hour = 3600;
        final int Minute = 60;

        System.out.println("Please insert number of seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;
        days = remainingSeconds / Day;
        remainingSeconds = remainingSeconds % Day;
        hours = remainingSeconds / Hour;
        remainingSeconds = remainingSeconds % Hour;
        minutes = remainingSeconds / Minute;
        remainingSeconds = remainingSeconds % Minute;


        System.out.printf("Input seconds: %d = %d days, %d hours, %d minutes, %d seconds", inputSeconds, days, hours, minutes, remainingSeconds);

    }
}
