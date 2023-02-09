package gr.aueb.cf.ch7;

public class TraverseApp {

    public static void main(String[] args) {
        String firstname = "thanos";
        String cf = "Coding Factory";

        for (int i = 0; i < firstname.length(); i++) {
            System.out.print(firstname.charAt(i) + " ");
        }

        for (char ch : cf.toCharArray()) {
            System.out.print(ch + " ");
        }

        System.out.println("\u2764");

        System.out.println(reverse(firstname));

        // Reverse Traverse
        for (int i = cf.length() - 1; i >= 0; i--) {
            System.out.print(cf.charAt(i) + " ");
        }
    }
        public static String reverse (String s) {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        }
}
