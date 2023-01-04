package gr.aueb.cf.ch5;

/*
Mutually exchanges the values of a,b
 */

public class Swap {

    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        swap(a , b);

        System.out.println("a= " + a + ", b= " +b);

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
