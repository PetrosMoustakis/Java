package gr.aueb.cf.ch5;
/*
Υπολογιζει το αθροισμα δυο ακεραιων
 με την χρηση της μεθοδου add
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a , b);

        System.out.println("Sum = " + sum);
    }
    /**
    Adds two integers
     @a the first int to add
     @b the second int to add
     @return the sum of a and b
     */
    public static int add (int a, int b) {
        int sum = 0;

        sum = a + b;

        return sum;
    }
}
