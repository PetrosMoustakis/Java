package gr.aueb.cf.ch7;

public class StringDeclareInit {

    public static void main(String[] args) {
        String alice = "Alice";
        String bob = new String("bob");

        System.out.println(alice + " and " + bob);
        System.out.printf("%s and %s\n", alice, bob);
        System.out.println("Total length = " + ((alice.length()) + bob.length()));
    }
}
