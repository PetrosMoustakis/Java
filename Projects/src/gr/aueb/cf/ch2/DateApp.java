package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int date = 0;
        int month = 0;
        int year = 0;
        int formattedYear = 0;

        System.out.println("Please insert date");
        date = in.nextInt();

        System.out.println("Please insert month");
        month = in.nextInt();

        System.out.println("Please insert year");
        formattedYear = in.nextInt();

        year %= 100;
        System.out.printf("The date is %02d/%02d/%d",date ,month ,formattedYear);

    }
}
