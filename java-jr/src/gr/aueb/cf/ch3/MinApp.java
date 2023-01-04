package gr.aueb.cf.ch3;

/* Υπολογιζει τον μικροτερο
δυο ακεραιων
 */

import java.util.Scanner;

public class MinApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }
        System.out.printf("The min value between %d and %d is %d", num1, num2, min);
    }
}
