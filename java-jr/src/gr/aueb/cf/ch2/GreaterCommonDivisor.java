package gr.aueb.cf.ch2;

public class GreaterCommonDivisor {

    public static void main(String[] args) {
        int x = 32;
        int y = 72;
        int z = 24;
        int gcd = 1;

        for (int i = 1; i<=x && i<=y && i<=z; i++) {
            if (x % i == 0 && y % i == 0 && z % i == 0) {
                gcd = i;
            }
        }
        System.out.printf("GCD of %d, %d and %d is : %d", x, y, z, gcd);
    }
}
