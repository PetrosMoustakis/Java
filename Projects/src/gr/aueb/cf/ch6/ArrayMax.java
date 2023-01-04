package gr.aueb.cf.ch6;

public class ArrayMax {

    public static void main(String[] args) {
        int[] table = {5, 1, 200, 450, 2};
        int max;
        max = getMaxPosition(table, 0, table.length - 1);

        System.out.printf("MaxPosition = %d", (max + 1));
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int maxValue;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error in array dimensions");
            return -1;
        }
           maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        } return maxPosition;
    }
}
