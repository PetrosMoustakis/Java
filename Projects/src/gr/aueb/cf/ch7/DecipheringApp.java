package gr.aueb.cf.ch7;

public class DecipheringApp {

    public static void main(String[] args) {
        String s = "Ifmmp!xpsme\"";
        char c = ' ';
        char f = ' ';
        int ascii = 0;

        for (int i = 0; i < s.length(); i ++) {

            c = s.charAt(i);
            ascii = (int) c - 1 ;
            f = (char) ascii;

            System.out.print(f);
        }
    }
}
