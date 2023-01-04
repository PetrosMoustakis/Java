package gr.aueb.cf.ch7;

public class StringConstantPull {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "Coding Factory";

        s1 = "My Coding Factory";
        s2 = "Hello Coding Factory";

        System.out.printf("%s and %s  ", s1, s2);
    }
}
