package gr.aueb.cf.ch4;

import java.util.Scanner;

/*
Διαβαζει char με scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        System.out.println("Insert a char");
        inputChar = in.nextLine().charAt(0);
        System.out.println("Input char: " + (int) inputChar);
    }
}
