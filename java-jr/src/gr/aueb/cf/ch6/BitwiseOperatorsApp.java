package gr.aueb.cf.ch6;

public class BitwiseOperatorsApp {

    public static void main(String[] args) {

    }

    public static int[] binaryAND(int[] arr1, int[] arr2) {
        int[] arrOut;

        if ((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length)) {
            throw new IllegalArgumentException();
        }

        arrOut = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrOut[i] = booleanToInt(intToBoolean(arr1[i]) && (intToBoolean(arr2[i])));
        }

        return arrOut;
    }

    public static int[] binaryOR(int[] arr1, int[] arr2) {
        int[] arrOut;

        if ((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length)) {
            throw new IllegalArgumentException();
        }

        arrOut = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrOut[i] = booleanToInt(intToBoolean(arr1[i]) || (intToBoolean(arr2[i])));
        }

        return arrOut;
    }

    public static int[] binaryXOR(int[] arr1, int[] arr2) {
        int[] arrOut;

        if ((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length)) {
            throw new IllegalArgumentException();
        }

        arrOut = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrOut[i] = booleanToInt( XOR(intToBoolean(arr1[i]), intToBoolean(arr2[i])) );
        }

        return arrOut;
    }

    public static int[] complimentByOne(int[] vector) {
        int[] arrOut;

        if (vector == null) throw new IllegalArgumentException();

        arrOut = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            arrOut[i] = (vector[i] == 0) ? 1 : 0;
        }

        return arrOut;
    }

    public static boolean XOR(boolean b1, boolean b2) {
        return ((b1 && !b2) || (!b1 && b2));
    }

    public static boolean intToBoolean(int binDigit) {
        if ((binDigit != 1) && (binDigit !=0)) throw new IllegalArgumentException();
        return (binDigit == 1);
    }

    public static int booleanToInt(boolean b) {
        return (b) ? 1 : 0;
    }
}
