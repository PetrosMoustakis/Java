package gr.aueb.cf.ch6;

/**
 * Search for a specific int and update
 */

public class SearchUpdateApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 21};

        update(arr, 1, 71);
        delete(arr, 21);
    }

    /**
     * returns the position of an element in an array
     * @param arr       the source array
     * @param num       the int to search for
     * @return          the position of the element in the array
     *                  if the element is found, -1 otherwise
     */

    public static int getPosition(int[] arr, int num) {
        int position = -1;

        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                position = i;
                break;
            }
        } return position;
    }

    public static void update(int[] arr,int oldValue, int newValue) {
        int positionToUpdate;

        if (arr == null) return;

        positionToUpdate = getPosition(arr, oldValue);

        if (positionToUpdate == -1) {
            System.out.println("Number was not found");
            return;
        }
            arr[positionToUpdate] = newValue;
    }

    public static void delete(int[] arr, int num) {
        int positionToDelete;

        if (arr == null) return;

        positionToDelete = getPosition(arr, num);

        if (positionToDelete == -1) {
            System.out.println("Value was not found");
            return;
        }

        for (int i = positionToDelete; i < arr.length -1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length -1] = 0;
    }
}
