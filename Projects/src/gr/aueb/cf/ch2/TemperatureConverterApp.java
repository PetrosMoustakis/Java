package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TemperatureConverterApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please insert temperature in Fahrenheit");
        fahrenheit = in.nextInt();

        celsius = (5 * (fahrenheit - 32))/ 9;

        System.out.println("The temperature in Celsius is:" + celsius);

    }
}
