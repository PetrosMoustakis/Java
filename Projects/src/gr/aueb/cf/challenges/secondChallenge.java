package gr.aueb.cf.challenges;

import java.util.Scanner;

public class secondChallenge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5, 8 ,12 ,17, 3, 6, 7};
        int k;
        System.out.println("Please insert k. If the number is bigger of the array's length it will return an array of zeros.");
        k = in.nextInt();

        printArr(rotate(arr,k));

    }

    public static int[] rotate(int[] arr,int k ) {
        int n = arr.length;
        int[] newArr = new int[arr.length];
        int j = 0;
        int b = k;

            for (int i = n - k; i < n; i++) {
            if (k > n) break;

            newArr[j] = arr[i];
            j++;
        }

        for (int i = 0; i < n-k ; i++) {
            newArr[b] = arr[i];
            b++;
        }
        return newArr;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
