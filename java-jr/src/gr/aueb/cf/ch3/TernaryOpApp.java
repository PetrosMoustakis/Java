package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
Υπολογισμος του μικροτερου μεταξυ δυο ακεραιων,
με την χρηση τριαδικου τελεστη
 */
public class TernaryOpApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        min = (num1 < num2) ? num1 : num2;

        System.out.printf("The min value between %d and %d is %d", num1, num2, min);
    }
}
