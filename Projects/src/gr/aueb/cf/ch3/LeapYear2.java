package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYear2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inpYear = 0;
        int year = 0;
        boolean isLeap = false;

        System.out.println("Please insert year");
        inpYear = in.nextInt();
        year = inpYear;

        isLeap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        System.out.println("Year is leap (true/false) : " + isLeap);

    }
}
