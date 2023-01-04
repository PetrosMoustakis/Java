package gr.aueb.cf.ch3;

/*
Υπολογιζει το απολυτο ενος αριθμου
 */

import java.util.Scanner;

public class AbsAPP {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Insert a number");
        num = in.nextInt();

        abs = (num < 0) ? -num : num;

        System.out.printf("The absolute of %d is %d",num , abs);
    }
}
