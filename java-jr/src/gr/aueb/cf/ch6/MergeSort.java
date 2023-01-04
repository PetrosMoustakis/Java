package gr.aueb.cf.ch6;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4, 6, 10, 43, 39, 47, 29, 19, 48, 28, 5, 2, 7};

        mergeSort(arr);
        print(arr);
    }

    public static void mergeSort(int[] arr) {
        int length = arr.length;

        if (arr.length < 2) {
            return;
        }

        int midIndex = arr.length/2;
        int[] leftHand= new int[midIndex];
        int[] rightHand = new int[arr.length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHand[i] = arr[i];
        }

        for (int j = midIndex; j < arr.length ; j++) {
            rightHand[j - midIndex] = arr[j];
        }

        mergeSort(leftHand);
        mergeSort(rightHand);

        merge(arr, leftHand, rightHand);
    }

    public static void merge(int[] arr, int[] leftHand, int[] rightHand) {
        int left = leftHand.length;
        int right = rightHand.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<left && j<right) {
            if (leftHand[i] <= rightHand[j]) {
             arr[k] = leftHand[i];
             i++;
            }
            else {
                arr[k] = rightHand[j];
                j++;
            }
            k++;
        }
        while (i < left) {
            arr[k] = leftHand[i];
            i++;
            k++;
        }
        while (j < right) {
            arr[k] = rightHand[j];
            j++;
            k++;
        }
    }

        public static void print (int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
            }
        }

}
