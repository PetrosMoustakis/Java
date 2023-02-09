package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DigitsSumApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int sum = 0;
        int digit = 0;
        int digitsCount = 0;

        System.out.println("Insert a num (int)");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            digit = num % 10;
            digitsCount++;
            sum += digit;
            num = num / 10;
        } while (num != 0);

        System.out.printf("DigitsCount = %d , sum= %d ", digitsCount ,sum);
        }
    }
