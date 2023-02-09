package gr.aueb.cf.ch1;


import java.util.regex.Pattern;

public class Practice {

    public static void main(String[] args) throws NullPointerException {

        int[] arr = {3, 2, 4, 5, 8};
        int target = 20;
        try {
            assert twoSum(arr, target) != null;
            for (int item : twoSum(arr, target)) {
                System.out.print(item + " ");
            }
        } catch (NullPointerException e) {
            System.out.println("There are not numbers");
            throw e;
        }

    }

    public static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}



