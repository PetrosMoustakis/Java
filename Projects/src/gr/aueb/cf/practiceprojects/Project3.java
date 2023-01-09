package gr.aueb.cf.practiceprojects;

//The runtime of the system is O(n) and n is the number of the items in the array.

public class Project3 {

    public static void main(String[] args) {

        int[][] src = {{1, 2, 4}, {4, 7}, {5, 8, 1, 4}, {1, 2}};
        int[][] shallowArr = shallowCopyArr(src);
        int[][] deepArr = deepCopyArr(src);

        System.out.println("The original array is: ");
        printArray(src);
        System.out.println("Shallow Array is: ");
        printArray(shallowArr);
        System.out.println("Deep Array is: ");
        printArray(deepArr);

        src[0][1] = 10;
        src[2][0] = 25;
        src[3][1] = 30;

        System.out.println("Shallow Array after the changes is: ");
        printArray(shallowArr);
        System.out.println("Deep Array after the changes is: ");
        printArray(deepArr);

    }

    public static int[][] shallowCopyArr(int[][] a) {
        int[][] shallowTable = new int[a.length][];

        System.arraycopy(a, 0, shallowTable, 0, a.length);
        return shallowTable;
    }

    public static int[][] deepCopyArr(int[][] a) {
        int[][] deepTable = new int[a.length][];

        for (int i = 0; i < a.length; i++) {
            deepTable[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                deepTable[i][j] = a[i][j];
            }
        }
        return deepTable;
    }

    public static void printArray(int[][] arr) {

        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
