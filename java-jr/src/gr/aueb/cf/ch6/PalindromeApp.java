package gr.aueb.cf.ch6;

public class PalindromeApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        System.out.println("isArrayPalindrome(arr))");

    }

    public static boolean isArrayPalindrome(int[] arr) {
        boolean isPalindrome = false;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
        }
            return isPalindrome;
        }
    }
