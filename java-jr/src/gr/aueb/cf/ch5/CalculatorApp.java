package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υλοποιει ενα απλο υπολογιστη με μεθοδους
 */

public class CalculatorApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int num1;
        int num2;
        int result;

        do {
            printMenu();
            choice = getUserChoice();

                System.out.println("Please insert two ints");
                num1 = getOneNumber();
                num2 = getOneNumber();

            if ((choice >= 1) && (choice <= 5)) {
                result = getResult(choice, num1, num2);
                System.out.println("Result : " + result);
            } else {
                System.out.println("Επιλεξατε εξοδο");
            }
        } while (choice  != 6);

        System.out.println("Thank you for using our calculator app");
    }

    public static void printMenu() {
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. Προσθεση ");
        System.out.println("2. Αφαιρεση ");
        System.out.println("3. Πολλαπλασιασμος");
        System.out.println("4. Διαιρεση ");
        System.out.println("5. Υπολοιπο διαιρεσης ");
        System.out.println("6. Εξοδος ");
    }

    public static int getUserChoice() {
        return in.nextInt();
    }

    public static int getOneNumber() {
        return in.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b != 0) {
            return a / b;
        }

        System.out.println("Error divide by zero");
        return 0;
    }

    public static int mod(int a, int b) {
        if (b != 0) {
            return a % b;
        }

        System.out.println("Error mod by zero");
        return 0;
    }

    public  static int getResult (int choice, int num1, int num2) {
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Λαθος επιλογη");
                break;
        }
        return result;
    }
}


