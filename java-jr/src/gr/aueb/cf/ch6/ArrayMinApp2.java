package gr.aueb.cf.ch6;

public class ArrayMinApp2 {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 3};

        int minValue = Integer.MAX_VALUE;
        int minPosition = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
    }
}
