package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ReadsScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert a number (int) ");
        num1 = in.nextInt();

        System.out.println("Please insert a second number (int) ");
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.printf("The sum of %d and %d = %d", num1 ,num2 ,sum);
    }
}
