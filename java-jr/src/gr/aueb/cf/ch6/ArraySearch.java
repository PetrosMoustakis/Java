package gr.aueb.cf.ch6;

public class ArraySearch {
    public static void main(String[] args) {
        final int KEY = 30;
        boolean keyIsFound = false;
        int[] arr = {4, 7, 90, 40, 30};
        int position = 0;

        for (int item : arr) {
            if (item == KEY) {
                keyIsFound = true;
                break;
            }
        }

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == KEY) {
                keyIsFound = true;
                position = i;
                break;
            }
        }
        if (keyIsFound) {
            System.out.printf("Key : %d, Position: %d", KEY, (position + 1));
        } else {
            System.out.println("Key was not found");
        }

            if (keyIsFound) {
                System.out.println("Key was found");
            } else {
                System.out.println("Key was not found");
            }

        }

    }

