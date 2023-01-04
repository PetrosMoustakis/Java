package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MulGeneric {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        int n = 0;
        int result = 1;

        System.out.println("Please insert a number");
        n = in.nextInt();

        while (i<=n) {
            result *= i;
            i++;
        }
        System.out.println("Result =" + result);
    }
}
