package gr.aueb.cf.practiceprojects;

public class Project2 {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("The maximum sum of the array is : " + maxSumSub(arr));
    }

    public static int maxSumSub(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++ ) {
            a[i] = Math.max(a[i], a[i] + a[i-1]);
            max = Math.max(max, a[i]);
        } return max;
    }
}
