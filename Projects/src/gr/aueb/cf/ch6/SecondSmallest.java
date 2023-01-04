package gr.aueb.cf.ch6;

public class SecondSmallest {

    public static void main(String[] args) {


        int[] table = {15, 23, 3, 7, 65, 14, 6, 45};
        int min;
        int minPosition = 0;

        for (int i = 0; i < table.length; i++) {

            min = table[minPosition];
            minPosition = i;

                for (int j = i; j < table.length; j++) {
                if (table[j] < min) {
                    minPosition = j;
                    min = table[j];
                    }
                }
                swap(table, i, minPosition);
            }
        System.out.println("The second biggest number of the table is : " + table[1]);
    }


    public static void swap (int[] arr, int i, int j) {
        int tmp;

        tmp = arr[i];
        arr[i] = arr[j];
        arr[j]=tmp;
    }
}