package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringInputApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        System.out.println("Please insert a string");
        s = in.next();      //Coding
        in.nextLine();

        System.out.println(s);

        System.out.println("Please insert a new string");
        s = in.nextLine();      //Coding Factory

        System.out.println(s);
    }
}
