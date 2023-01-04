package gr.aueb.cf.ch8;

import java.io.IOException;

public class ThrowsVsTryCatchApp {

    public static void main(String[] args) {

            try {
                int ch = getChar();
            } catch (IOException e) {
                System.out.println("IO error");
            }

    }

    public static int getChar() throws IOException {

        try {
            return System.in.read();
        } catch (IOException e) {
            e.printStackTrace();        // log
                                        // recover state
            throw e;                    // rethrow
        }

    }
}
