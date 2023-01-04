package gr.aueb.cf.ch3;

/*
Υπολογιζει το γινομενο των 10 πρωτων αριθμων
 */

public class Mul10App {

    public static void main(String[] args) {

        int i = 1;
        int result = 1;

        while (i<=10) {
            result *= i;
            i++;
        }
        System.out.println("Result =" + result);

    }
}