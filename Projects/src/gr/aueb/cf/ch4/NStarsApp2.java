package gr.aueb.cf.ch4;

import java.util.Scanner;

public class NStarsApp2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Insert number of times");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");

        }
    }
}
