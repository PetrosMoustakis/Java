package gr.aueb.cf.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class thirdChallenge {


    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 4, 9, 3, 6};

        System.out.println(findNum(arr));

    }

    public static int findNum (int[] arr) {
        int num = 0;

        for (int item : arr) {
            num ^= item;
        }
        return num;
    }


}


