package gr.aueb.cf.ch3;

/*
Εμφανιζει ενα menu μεχρι ο χρηστης να επιλεξει exit
 */

import java.util.Scanner;

public class DoMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλεξτε ενα απο τα παρακατω");
            System.out.println("1. Εισαγωγη προιοντος");
            System.out.println("2. Διαγραφη προιοντος");
            System.out.println("3. Εξοδος");
            choice = in.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using our app");
    }
}
