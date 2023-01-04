package gr.aueb.cf.ch7;

import java.util.Scanner;

public class ContainsIndexOfApp {

    public static void main(String[] args) {
        String s = "";
        Scanner in = new Scanner(System.in);
        int index = 0;

        System.out.println("Insert string");
        s = in.nextLine();

        if (s.contains("Athens")) {
            index = s.indexOf("Athens");
            System.out.println("Athens. Index: " + index);
        } else {
            index = s.indexOf("Athens");
            System.out.println("Athens not found. Index: " + index);
        }
        System.out.println("Total string length " + s.length());
    }
}
