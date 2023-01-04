package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo
 */

public class BigIntegerApp {

    public static void main(String[] args) {


        BigInteger bignum1 = new BigInteger("2147483647");
        BigInteger bignum2 = new BigInteger("214748364789");
        BigInteger result;

        result = bignum1.add(bignum2);

        System.out.printf("%,d", result);
    }
}