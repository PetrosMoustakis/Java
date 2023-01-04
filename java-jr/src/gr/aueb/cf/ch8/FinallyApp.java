package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Finally is always executed
* */

public class FinallyApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        try {
            num = in.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("It's not always executed");
    }
}
