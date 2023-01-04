package gr.aueb.cf.ch6;

public class ArrayMinMethod {

    public static void main(String[] args) {
        int[] ages = {23, 45, 65, 21};

        int minPosition = 0;

        minPosition = getMinPosition(ages, 0, ages.length - 1 );

        System.out.printf("MinValue = %d, MinPosition= %d", ages[minPosition], (minPosition + 1));

    }

    public static int getMinPosition(int[] arr, int low, int high) {
        int minPosition = low;
        int minValue = arr[low];

        if (arr == null) return -1;
        if (low > high) return -1;

        if ((low < 0) || (high > arr.length -1)) {
            System.out.println("Error in array dimensions");
            return -1;
        }

        minValue = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }
}
