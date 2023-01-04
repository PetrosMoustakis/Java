package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayCopyApp {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] clone;
//        int[] arrClone;

        int[] arrClone;

//        arrClone = shallowCopy(arr);

//         copy
        clone = Arrays.copyOf(arr, arr.length);

//        truncate one item ar RHS
        clone = Arrays.copyOf(arr, arr.length - 1);

//        padding with zeros at RHS (right hand side)
        clone = Arrays.copyOf(arr, arr.length + 1);

        System.arraycopy(arr, 0 , clone, 0, arr.length - 1);
    }

    public static int[] shallowCopy(int[] arr) {
        return arr;
    }
}
