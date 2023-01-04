package gr.aueb.cf.ch3;

/*
Υπολογιζει το a^b
 */

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {

        int a = 0, b = 0;
        int i = 1;
        int result = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a anb b");
        a = in.nextInt();
        b= in.nextInt();

            while (i <= b) {
                result = result * a;
                i++;
            }
        System.out.println("Result =" + result);
    }

}
