package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Finally is always executed
 * */

public class TryWithResourcesApp {

    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);

        try (in) {
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                in.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }


        System.out.println("It's not always executed");
    }
}
