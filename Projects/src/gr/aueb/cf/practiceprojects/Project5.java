package gr.aueb.cf.practiceprojects;

import java.util.Scanner;

public class Project5 {

    public static void main(String[] args) {
        boolean[][] seats = new boolean[30][12];
        Scanner in = new Scanner(System.in);
        char column;
        int row;
        int choice = -1 ;

            while (choice!= 0) {

                System.out.println("If you want to make a booking pleaser enter 1. \nIf you want to cancel a booking enter 2\n" +
                        "If you want to exit insert 0");
                choice = in.nextInt();

                if (choice == 1) {
                    System.out.println("Please insert first the column (A-L) : ");
                    column = in.next().charAt(0);
                    System.out.println("Now insert the row (1-30) : ");
                    row = in.nextInt();

                    book(column, row, seats);
                    System.out.println("Continue with your next choice: ");
                } else if (choice == 2) {
                    System.out.println("Please insert first the column (A-L) : ");
                    column = in.next().charAt(0);
                    System.out.println("Now insert the row (1-30) : ");
                    row = in.nextInt();

                    cancelBook(column, row, seats);
                    System.out.println("Continue with your next choice: ");
                } else if ((choice > 2) || (choice < 0)) {
                    System.out.println("Please insert a valid number");
                }
        }
        printSeats(seats);
        System.out.println("Thanks for using our app!");

    }


     public static void printSeats (boolean[][] arr) {

         for (int i = 0; i < arr.length ; i++) {
             for (int j = 0; j < arr[i].length; j ++) {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
     }


     public static void book(char column, int row, boolean[][] seats) {

        try {
            int ascii = ((int) column) - 65;

            if (!(seats[row - 1][ascii])) {
                seats[row - 1][ascii] = true;
                System.out.println("You have successfully booked the seat");
            } else {
                System.out.println("The position is already booked.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You have enter a non existing position");
        }
     }

     public static void cancelBook(char column, int row, boolean[][] seats) {

        try {
            int ascii = ( (int) column ) - 65;

            if (seats[row-1][ascii]) {
                seats[row-1][ascii] = false;
                System.out.println("You have successfully canceled the booking");
            } else {
                System.out.println("The position cannot be canceled because it is not booked.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You have enter a non existing position");
        }
    }



}
