package gr.aueb.cf.ch8;

import java.util.Scanner;

/*
arithmetic exception (divide by zero exception)
unchecked exception/ RunTimeException
*/

public class ArithmeticException {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert a numerator and a denominator");

                numerator = in.nextInt();
                denominator = in.nextInt();

                result = numerator / denominator;

                if (result == 1) break;
                System.out.printf("%d / %d = %d\n", numerator, denominator, result);
            } catch (java.lang.ArithmeticException e) {
    //                e.printStackTrace();
                System.out.println("Please insert a non zero denominator");
            }
        }
    }
}
