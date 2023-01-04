package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
Ο χρηστης εισαγει τον αριθμο των αστεριων που θα εμφανιστουν
 */
public class StarsApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 1;

        System.out.println("Please insert number : ");
        n = in.nextInt();

        while (i <= n) {
            System.out.print("*");
            i++;
        }

        System.out.println();
    }
}
