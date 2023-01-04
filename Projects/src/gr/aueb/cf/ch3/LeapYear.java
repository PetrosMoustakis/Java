package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inpYear = 0;
        int year = 0;
        int result = 0;
        int result1 = 0;
        int result2 = 0;

        System.out.println("Insert year");
        inpYear = in.nextInt();

        year = inpYear;
        result = year % 4;

        if (result == 0) {
            result1 = year % 100;
            result2 = year % 400;
                if (result1 != 0 && result2 !=0) {
                    System.out.println("The year is leap");
                } else if (result1 == 0 && result2 == 0) {
                    System.out.println("The year is leap");
                } else if (result1 == 0 & result2 != 0) {
                    System.out.println("The year is not leap");
                }
        } else {
            System.out.print("The year is not leap");
        }

    }
}
