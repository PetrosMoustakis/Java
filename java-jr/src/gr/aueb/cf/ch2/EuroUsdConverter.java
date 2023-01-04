package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int totalUsaCent = 0;
        int inputEuros = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        System.out.println("Please insert an amount (Euros)");
        inputEuros = in.nextInt();

        totalUsaCent = inputEuros * PARITY;
        usaDollars = totalUsaCent / 100;
        usaCents = totalUsaCent % 100;

        System.out.printf("%d euros = %d USA dollars & %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
