package gr.aueb.cf.ch3;

/*
Υπολογιζει το πληθος των ψηφιων ενος ακεραιου,
διαιρωντας επαναληπτικα με 10 μεχρι το αποτελεσμα
της διαιρεσης να ειναι 0.
 */

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNumb = 0;
        int num = 0;
        int count = 0;

        System.out.println("Insert a number (int)");
        inputNumb = in.nextInt();

        num = inputNumb;

        do {
            count++;
            num = num /10;
        } while (num !=0);

        System.out.printf("Num: %d consists of %d digits", inputNumb, count);
    }
}
