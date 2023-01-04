package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = " ";

        System.out.println("Please insert an int");
        inputStr = in.nextLine();

//        while (true) {
            if (isInt(inputStr)) {
                num = Integer.parseInt(inputStr);
                System.out.println("Input number " + num);
            } else {
                System.out.println("Error in parsing");
//                in.nextLine();
//                continue;
            }

        }
//    }

        /**
         * Returns true, if the source string evaluates to integer
         *
         * @param str   the input str
         * @return true if the string evaluates to int
         *          false otherwise
         */
        public static boolean isInt(String str){
            try {
                Integer.parseInt(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

}

