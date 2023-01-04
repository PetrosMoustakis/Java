package gr.aueb.cf.ch8;

public class NullPointerExceptionApp {

    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            if (s.equals("Coding Plus")) {
                System.out.println("Coding +");
            } else {
                System.out.println("No Coding Plus");
            }
        } else {
            System.out.println("String is null");
        }
    }
}


