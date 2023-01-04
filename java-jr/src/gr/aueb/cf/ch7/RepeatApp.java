package gr.aueb.cf.ch7;

public class RepeatApp {

    public static void main(String[] args) {
        System.out.println("*".repeat(10));

        for (int i = 1; i <= 10; i++) {
            System.out.println("*".repeat(10));
        }
    }
}
