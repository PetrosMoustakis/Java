package gr.aueb.cf.ch7;

public class CopyStrApp {

    public static void main(String[] args) {
        String s1 = "Petros";
        String s2 = clone(s1);

        s2 = s2.toLowerCase();
    }

    public static String clone(String s) {
        return s;
    }
}
