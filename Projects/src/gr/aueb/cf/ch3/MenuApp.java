package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuApp {

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
                System.out.println("Επιλέξατε Εισαγωγη");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Αναζητηση");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Διαγραφη");
            }else if (choice == 4) {
                System.out.println("Επιλέξατε Ενημερωση");
            } else if (choice == 5) {
                System.out.println("Επιλεξατε εξοδο");
            } else if (choice < 0) {
                System.out.println("Λάθος επιλογή, δεν επιτρέπονται αρνητικά νούμερα");
            } else {
                System.out.println("Λαθος επιλογη, εκτός του εύρους τιμών");
            }
        } while (choice != 5);

        System.out.println("Thank you for using our app");
    }
}
