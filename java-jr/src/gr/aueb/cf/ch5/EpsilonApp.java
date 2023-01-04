package gr.aueb.cf.ch5;

public class EpsilonApp {

    public static void main(String[] args) {
        final double EPSILON = 0.00005;
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual += 0.1; }

            if (Math.abs(actual - expected) <= EPSILON) {
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }

        }
    }


