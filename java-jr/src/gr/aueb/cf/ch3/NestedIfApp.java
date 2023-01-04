package gr.aueb.cf.ch3;

/*
Δεχεται ως εισοδο συνολο βαθμολογιας και πληθος μαθηματων
και υπολογιζει τον μ.ο και στην συνεχεια δινει feedback
στον χρηστη αναλογα με την βαθμολογια.
 */

import java.util.Scanner;

public class NestedIfApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modulesCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Insert the sum of grades and modules count");
        totalMarks = in.nextInt();
        modulesCount = in.nextInt();

        if (modulesCount != 0) {
            average = totalMarks / modulesCount;
            if (average >=9 && average <= 10){
                System.out.println("Αριστα");
            } else if ( average >=7 && average <= 8) {
                System.out.println("Λιαν Καλως");
            } else if (average >=5 && average <=6 ) {
                System.out.println("Kαλως");
            } else if (average < 5 && average >=0) {
                System.out.println("Αποτυχια");
            } else {
                System.out.println("Error in input data");
            }

        } else {
            System.out.println("Modules count cannot be zero");
        }

    }
}