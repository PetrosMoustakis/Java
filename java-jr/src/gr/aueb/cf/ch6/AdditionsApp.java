package gr.aueb.cf.ch6;

public class AdditionsApp {

    public static void main(String[] args) {
    int[] arr1 = {9, 9, 9, 6, 7, 1, 9};
    int[] arr2 = {9, 9, 9, 8, 6, 3, 5};
    int[] arrOut;

//    arrOut = addOne(arr1);
        arrOut = addTwoInts(arr1, arr2);

    for (int num: arrOut) {
        System.out.print(num + " ");
        }

    }


    public static int[] addOne(int[] arr) {
        int[] arrOut;
        int carry = 1;
        int currentSum;

        if (arr == null) throw new IllegalArgumentException("arr is null");

        arrOut = new int[arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            currentSum = arr[i] + carry;
            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }
        arrOut[0] = carry;
        return arrOut;
    }

    public static int[] addTwoInts(int[] arr1, int[] arr2) {
    int[] arrOut;
    int currentSum;
    int carry= 0;

    if ((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length)) {
        throw new IllegalArgumentException();
    }

    arrOut = new int[arr1.length + 1];

    for (int i = arr1.length - 1; i>= 0; i--) {
        currentSum = arr1[i] + arr2[i] ;
        arrOut[i+1] = currentSum % 10;
        carry = currentSum / 10;
    }

    arrOut[0] = carry;
    return arrOut;
    }
}
