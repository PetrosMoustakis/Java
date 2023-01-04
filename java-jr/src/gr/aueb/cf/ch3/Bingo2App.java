package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Bingo2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int key = 10;
        int inputNum = 0;
        boolean keyIsFound = false;

        while (true) {
            System.out.println("Guess the key number");
            inputNum = in.nextInt();

            if (inputNum == key) {
                keyIsFound = true;
                System.out.println("Bingo");
                break;

            } else {
                System.out.println("Try again");
            }
        }

    }
}