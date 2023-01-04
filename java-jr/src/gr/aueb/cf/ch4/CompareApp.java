package gr.aueb.cf.ch4;

/*
compares two chars
 */

public class CompareApp {

    public static void main(String[] args) {
        char ch1 = 'α';
        char ch2 = 'b';
        boolean isGreater = false;

        System.out.println(ch1);
        System.out.println(ch2);

        if (ch1 > ch2) {
            isGreater = true;
        }
        System.out.println("ch1 IsGreater:" + isGreater);
        System.out.println((int)ch1);
        System.out.println((int)ch2);
    }
}
