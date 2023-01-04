package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoWhileApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int key = 10;
        int inpNumber = 0;
        boolean bingo = false;

        do {
            System.out.println("Guess the key number");
            inpNumber = in.nextInt();

                if (inpNumber == key) {
                    bingo = true;
                    System.out.println("Bingo!");
                }
                    else {
                    System.out.println("Try again");
                }
                } while (!bingo);
        }
    }

