package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int n = 0;

        do {
            printMenu();
            choice = in.nextInt();
            if (choice >= 1 && choice <= 5) {
                System.out.println("Δώστε αριθμό αστεριών: ");
                n = in.nextInt();
            }
            switch (choice) {
                case 1:
                    printStarsH(n);
                    break;
                case 2:
                    printStarsV(n);
                    break;
                case 3:
                    printStarsHV(n);
                    break;
                case 4:
                    printStarsAsc(n);
                    break;
                case 5:
                    printStarsDesc(n);
                    break;
                case 6:
                    System.out.println("Επιλέξατε έξοδο");
                    break;
                default:
                    System.out.println("Δώσατε λάθος επιλογή");
                    break;
            }
        } while (choice != 6);

    }


    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");

        }
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);

        }
    }

    public static void printStarsAsc(int n) {
        for (int i = 1; i <= n; i++) {
                printStarsH(i);
                System.out.println();
        }
    }

    public static void printStarsDesc(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                printStarsH(j);
            } break;
        }
    }

    public static void printMenu () {
        System.out.println("Επιλεξτε ενα απο τα παρακατω:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος");
        System.out.println("Δώσε επιλογή:");
    }

}