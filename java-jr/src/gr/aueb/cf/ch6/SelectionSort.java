package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 3, 10, 6};
        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int min;
        int minPosition;

        for (int i = 0; i < arr.length; i++) {

            minPosition = i;
            min = arr[minPosition];

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    minPosition = j;
                    min = arr[j];
                }
            }

//            Swap
            swap(arr, i, minPosition);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp;

        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
