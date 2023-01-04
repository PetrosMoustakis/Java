package gr.aueb.cf.ch6;

public class ArrayMinApp {

    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 7, 99};

        int minPotition = 0;
        int minValue = arr[minPotition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPotition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min value: %d , Min position: %d", minValue, (minPotition + 1));
    }
}
