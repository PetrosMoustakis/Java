package gr.aueb.cf.ch2;

/*
Μετατρεπει ενα ποσο Euros σε euro500, euro100, euro50, euro20, euro10,euro 5 remaining euros
 */

import java.util.Scanner;

public class EurosApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEuros = 0;
        int euros500 = 0;
        int euros100 = 0;
        int euros50 = 0;
        int euros20 = 0;
        int euros10 = 0;
        int euros5 = 0;
        int remainingEuros = 0;

        System.out.println("Please insert an amount");
        inputEuros = in.nextInt();
        remainingEuros  =  inputEuros;

        euros500 = remainingEuros / 500;
        remainingEuros = remainingEuros % 500;

        euros100 = remainingEuros / 100;
        remainingEuros = remainingEuros % 100;

        euros50 = remainingEuros / 50;
        remainingEuros = remainingEuros % 50;

        euros20 = remainingEuros / 20;
        remainingEuros = remainingEuros % 20;

        euros10 = remainingEuros / 10;
        remainingEuros = remainingEuros % 10;

        euros5 = remainingEuros / 5;
        remainingEuros = remainingEuros % 5;

        System.out.printf("euros500: %d, euros100: %d, euros50: %d, euros20: %d, euros10: %d, remainingEuros:%d", euros500, euros100,
                euros50, euros20 , euros10, euros5);
    }
}
