package gr.aueb.cf.ch5;

public class FactorialRecursive {

    public static void main(String[] args) {
        int facto ;

        facto = factorial(4);

        System.out.println(facto);
    }

    public static int factorial (int n) {
        if (n <= 1) {
            return 1;
        } else {
            return  n * factorial(n-1);
        }

    }
}
