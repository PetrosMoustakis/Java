package gr.aueb.cf.Projects;

import java.util.Scanner;

public class ProjectCh3App {
    final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String response;

        do {
            printMenu();
            response = getChoice();
            try {
                if (response.matches("[qQ]")) {
                    quit = true;
                } else {
                    printOnChoice(response);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice");
            }
        }   while (!quit);
    }

    public static void printMenu() {
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. Εισαγωγη");
        System.out.println("2. Αναζητηση");
        System.out.println("3. Διαγραφη");
        System.out.println("4. Ενημερωση");
        System.out.println("Q ή q για έξοδο");
    }

    public static String getChoice() {
        return in.nextLine().trim();
    }

    public static void printOnChoice(String s) throws IllegalArgumentException {
        int choice;

        try {
            choice=Integer.parseInt(s);

            switch (choice) {
                case 1:
                    System.out.println("Εισαγωγή");
                case 2:
                    System.out.println("Αναζήτηση");
                case 3:
                    System.out.println("Διαγραφή");
                case 4:
                    System.out.println("Ενημέρωση");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
