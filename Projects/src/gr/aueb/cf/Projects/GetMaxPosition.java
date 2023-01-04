package gr.aueb.cf.Projects;

public class GetMaxPosition {

    public static void main(String[] args) {

        int[] table = {5, 1, 200, 450, 2};
        int max;
        max = getMaxPosition(table, 0, table.length - 1);

        if (max == -1) System.exit(1);
        System.out.printf("MaxPosition = %d", (max + 1));

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = 0;
        int maxValue = 0;

        if ((arr == null) || (arr.length < 11)) return -1;
        if ((low < 0) || (high > arr.length - 1) || (low > high)) {
            System.out.println("Error in array dimensions");
            return -1;
        }
        maxValue = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        } return maxPosition;
    }
}
