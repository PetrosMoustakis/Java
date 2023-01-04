package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Prints with print stream
 */

public class PrinStreamApp {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("C:/tmp/f1.txt")) {
            ps.println("Hello Coding Factory");
        }   catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
