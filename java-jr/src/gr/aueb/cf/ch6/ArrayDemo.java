package gr.aueb.cf.ch6;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] ages = {23, 45, 67, 31};

        printArray(ages, 0, 3);

    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void  printArray(int[] arr, int low, int high) {
        if (arr == null) return;

        if ((low < 0) || (high > arr.length-1) || (high < low)) {
            System.out.println("Error");
            return;
        }

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }
}
