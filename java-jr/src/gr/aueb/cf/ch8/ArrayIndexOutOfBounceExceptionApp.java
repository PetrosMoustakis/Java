package gr.aueb.cf.ch8;

// array index out of bounds exception
//    runtime/unchecked exception

public class ArrayIndexOutOfBounceExceptionApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
