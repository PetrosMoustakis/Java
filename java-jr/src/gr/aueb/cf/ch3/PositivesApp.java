package gr.aueb.cf.ch3;

import java.util.Scanner;

/* Διαβαζει ακεραιους μεχρι να βρει αρνητικο,
οποτε σταματαει.Μετραει το πληθος τον θετικων.
 */
public class PositivesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        System.out.println("Please insert a positive number (or negative for exit)");
        num = in.nextInt();

        while (num >= 0) {
            System.out.println("Positive inserted . . . ");
            positiveCount++;
            System.out.println("Please insert a new positive number");
            num = in.nextInt();
        }

        System.out.println("You inserted a negative");
        System.out.println("The total count of positive numbers was: " + positiveCount);
    }
}
