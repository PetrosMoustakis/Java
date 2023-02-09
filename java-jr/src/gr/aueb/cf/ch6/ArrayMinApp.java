package gr.aueb.cf.ch6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class ArrayMinApp {

    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 7, 99};

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5,9,2,7,3,99));
        sort(list);

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min value: %d , Min position: %d", minValue, (minPosition + 1));
    }

    public static void sort(ArrayList list) {
        Collections.sort(list);
        for (Object num : list ) {
            System.out.print(num + ", ");
        }
    }
}
