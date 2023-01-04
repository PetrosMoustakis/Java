package gr.aueb.cf.ch3;

/*
finds the max between two inputs
 */

import java.util.Scanner;

public class MaxApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int max = 0;

        System.out.println("Insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.printf("Between %d and %d the biggest number is : %d",num1, num2, max);
    }
}
