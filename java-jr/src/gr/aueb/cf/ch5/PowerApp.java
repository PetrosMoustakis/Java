package gr.aueb.cf.ch5;

/*
Evaluates a^n using method
 */

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int a = 0;
       int n = 0;
       int result  = 0;

        System.out.println("Insert a and n");
        a = in.nextInt();
        n = in.nextInt();
        result = pow(a, n );

        System.out.printf("%d ^ %d = %d", a, n ,result);

    }

    public static int pow(int a, int n) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        int power = 1;

        // Εντολες-Δομη ελεγχου
        for (int i = 1; i <= n; i++) {
            power *= a;
        }

        //Return power
        return power;
    }
}
