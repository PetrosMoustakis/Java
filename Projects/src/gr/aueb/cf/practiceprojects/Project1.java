package gr.aueb.cf.practiceprojects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Project1 {

    public static void main(String[] args) throws FileNotFoundException {

        final int EVENTHRESHOLD = 4;
        final int ODDTHRESHOLD = 4;
        final int ISCONTIGUOUS = 2;
        final int SAMEENDING = 3;
        final int SAMETEN = 3;

        final int N = 6;
        File intFile = new File("C:/Users/petro/OneDrive/Desktop/Project1Numbers.txt");
        File outFile = new File("C:/Users/petro/OneDrive/Desktop/Result.txt");
        Scanner in = new Scanner(intFile);
        PrintStream ps = new PrintStream(outFile);
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] arr = new int[6];

        while (in.hasNext()) {
            numbers.add((in.nextInt()));
        }

        Collections.sort(numbers);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size() - N; i++) {
            for (int j = i + 1; j < numbers.size() - N + 1; j++) {
                for (int k = j + 1; k < numbers.size() - N + 2; k++) {
                    for (int m = k + 1; m < numbers.size() - N + 3; m++) {
                        for (int n = m + 1; n < numbers.size() - N + 4; n++) {
                            for (int p = n + 1; p < numbers.size() - N; p++) {
                                arr[0] = numbers.get(i);
                                arr[1] = numbers.get(j);
                                arr[2] = numbers.get(k);
                                arr[3] = numbers.get(m);
                                arr[4] = numbers.get(n);
                                arr[5] = numbers.get(p);

                                if ((!isEven(arr, EVENTHRESHOLD)) && (!isOdd(arr, ODDTHRESHOLD)) && (!isContiguous(arr,ISCONTIGUOUS))
                                && (!isSameEnding(arr,SAMEENDING)) && (!isSameTen(arr,SAMETEN))) {
                                ps.printf("%d\t%d\t%d\t%d\t%d\t%d\t\n", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public static boolean isEven(int[] row, int threshold) {
        int count = 0;

        for (int num : row) {
            if (num % 2 == 0) count++;
        }
        return count > threshold;
    }

    public static boolean isOdd(int[] row, int threshold) {
        int count = 0;

        for (int num : row) {
            if (num % 2 != 0) count++;
        }
        return count > threshold;
    }

    public static boolean isContiguous(int[] arr, int threshold) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
                if ((arr[i] - arr[i+1] == abs(1)) && ((arr[i]+arr[i+1]) % 2 != 0))
                    count++;
        }
        return count > threshold;
    }

    public static boolean isSameEnding(int[] arr, int threshold) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] % 10) == (arr[j] % 10))
                    count++;
            }
        } return count > threshold;
    }

    public static boolean isSameTen (int[] arr, int threshold) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] / 10) == (arr[j] / 10))
                    count++;
            }
        } return count > threshold;
    }

//    public static boolean isSameEnding(int[] arr, int threshold) {
//        int[] count = new int[10];
//        int num ;
//
//        for (int i = 0; i < arr.length; i++) {
//        num = arr[i] % 10;
//        count[num]++;
//        }
//        return (count[] )> threshold;
//    }

}
