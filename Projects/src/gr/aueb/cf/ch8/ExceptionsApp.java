package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ExceptionsApp {

    public static void main(String[] args) {
        int choice = 0;

        do {
            printMenu();
            try {
                choice = getChoice(choice);
                    if (choice>=1 && choice <=5)
                        printChoice(choice);
                } catch (IllegalArgumentException e) {
//                System.out.println("Insert a number between 1-5");
                e.printStackTrace();
                    }


        }
        while (choice != 5);
    }


    public static void printMenu() {
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. Εισαγωγη");
        System.out.println("2. Αναζητηση");
        System.out.println("3. Διαγραφη");
        System.out.println("4. Ενημερωση");
        System.out.println("5. Εξοδος");
    }

    public static int getChoice (int n) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert your choice");
        if (in.hasNextInt()) {
            n = in.nextInt();
        } else {
            System.out.println("Please insert a valid number");
            System.out.println();
            in.nextLine();
        }
        return n;
    }

    public static void printChoice(int choice) throws IllegalArgumentException {

        if (choice == 1) {
            System.out.println("Επιλέξατε Εισαγωγη");
        } else if (choice == 2) {
            System.out.println("Επιλέξατε Αναζητηση");
        } else if (choice == 3) {
            System.out.println("Επιλέξατε Διαγραφη");
        } else if (choice == 4) {
            System.out.println("Επιλέξατε Ενημερωση");
        } else if (choice == 5) {
            System.out.println("Επιλεξατε εξοδο");
        } else
            throw new IllegalArgumentException("Insert a number between 1-5");
    }

}


