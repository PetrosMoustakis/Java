package gr.aueb.cf.ch7;

public class CryptographyDecipheringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        String crypto= Cryptography(s);
        System.out.println(crypto);

        String uncrypto = Deciphering (crypto);
        System.out.println(uncrypto);

    }


            public static String Cryptography(String str) {
                char input;
                char output;
                int ascii;
                StringBuilder crypted = new StringBuilder();

                for (int i = 0; i < str.length(); i++) {

                    input = str.charAt(i);
                    ascii = (int) input + 1;
                    output = (char) ascii;
                    crypted.append(output);
                }
                    return crypted.toString();
        }

            public static String Deciphering (String str) {
                char input;
                char output;
                int ascii;
                StringBuilder uncrypted = new StringBuilder();

                for (int i = 0; i < str.length(); i++) {

                    input = str.charAt(i);
                    ascii = (int) input - 1;
                    output = (char) ascii;
                    uncrypted.append(output);
                }
                return uncrypted.toString();

            }

}