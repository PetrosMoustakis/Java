package gr.aueb.cf.ch2;

public class TypecastApp {

    public static void main(String[] args) {
        long myLong1 = 10L;
        long myLong2 = 20L;
        int result;

        int myint1 = 10;
        int myint2 = 20;
        long longResult;

        result = (int) (myLong1 + myLong2);

        longResult = myint1 + myint2;
    }
}
