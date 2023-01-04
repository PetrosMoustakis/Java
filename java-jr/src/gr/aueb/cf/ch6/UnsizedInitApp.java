package gr.aueb.cf.ch6;

public class UnsizedInitApp {

    public static void main(String[] args) {
        int[] ages = {21, 18, 25, 32, 45};

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
