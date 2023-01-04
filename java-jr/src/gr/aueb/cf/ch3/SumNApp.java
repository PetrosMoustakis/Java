package gr.aueb.cf.ch3;

/*
Υπολογιζει το αθροισμα απο 1-n αριθμων, οπου n αριθμος εισαγομενος απο τον χρηστη
 */

import java.util.Scanner;

public class SumNApp {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int i = 1;
        int n = 0;
        int sum = 0;
        System.out.println("Please insert a number");
        n = in.nextInt();

        while (i<=n) {
            sum += i;
            i++;
        }
        System.out.println("Sum =" + sum);
    }
}
