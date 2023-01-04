package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
Ελεγχει αν ενα τριγωνο με υποτεινουσα α και πλευρες
α,β ειναι ορθογωνιο, δηλαδη
α^2 == β^2 + ψ^2
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;

        System.out.println("Please insert a,b,c ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = (Math.abs(a*a - b*b - c*c) <= EPSILON);

        System.out.print("Triangle is right " + isRight);
    }
}
