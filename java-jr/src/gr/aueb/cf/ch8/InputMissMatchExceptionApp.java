package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* InputMissMatchException is unchecked
* */

public class InputMissMatchExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC = 12;

        while (true) {
            try {
                System.out.println("Please insert an int");
                inputNum = in.nextInt();
                if (inputNum == MAGIC) break;
                System.out.println("Input num = " + inputNum);
            } catch (InputMismatchException e) {
//                e.printStackTrace();
                System.out.println("Please insert a valid int");
                in.nextLine();
            }
        }
    }
}