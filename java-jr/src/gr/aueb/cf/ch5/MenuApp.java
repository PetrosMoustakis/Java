package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        do {
            printMenu();
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Επιτυχης εισαγωγη");
                    break;
                case 2:
                    System.out.println("Επιτυχης διαγραφη");
                    break;
                case 3:
                    System.out.println("Επιτυχης αναζήτηση");
                    break;
                case 4:
                    System.out.println("Επιτυχης ενημέρωση");
                    break;
                case 5:
                    System.out.println("Επιλέξατε έξοδο");
                    break;
                default:
                    System.out.println("Λαθος επιλογη");
                    break;
            }
        }while (choice != 5);

    }

    /**
     * prints a CRUD (CREATE READ UPDATE DELETE) menu
     */
    public static void printMenu () {
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. Εισαγωγη ");
        System.out.println("2. Διαγραφη ");
        System.out.println("3. Αναζητηση");
        System.out.println("4. Ενημερωση ");
        System.out.println("5. Εξοδος ");
    }
}
