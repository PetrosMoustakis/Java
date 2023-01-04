package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FibonacciApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int result = 0;

        System.out.println("Insert n");
        n = in.nextInt();
        result = fibo(n);

        System.out.printf("The fibonacci of %d is: %d ", n, result);


    }

    public static int fibo(int n) {
        if (n < 0) {
            System.out.println("Invalid n");
            return -1;
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibo(n-1) + fibo(n-2);
    }
}
