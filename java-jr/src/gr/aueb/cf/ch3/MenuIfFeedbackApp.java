package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuIfFeedbackApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλεξτε ενα απο τα παρακατω");
            System.out.println("1. Εισαγωγη");
            System.out.println("2. Αναζητηση");
            System.out.println("3. Διαγραφη");
            System.out.println("4. Ενημερωση");
            System.out.println("5. Εξοδος");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Επιτυχης Εισαγωγη");
            } else if (choice == 2) {
                System.out.println("Επιτυχης Αναζητηση");
            } else if (choice == 3) {
                System.out.println("Επιτυχης Διαγραφη");
            }else if (choice == 4) {
                    System.out.println("Επιτυχης Ενημερωση");
                } else if (choice == 5) {
                    System.out.println("Επιλεξατε εξοδο");
                } else {
                    System.out.printf("Λαθος επιλογη");
                }
            } while (choice != 5);

            System.out.println("Thank you for using our app");

        }
}

