package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;

        System.out.println("Guess the key number");
        inputNum = in.nextInt();

        if (inputNum == key) {
            System.out.println("Bingo");
        }
        else {
            System.out.println("Try again");
        }
    }
}
