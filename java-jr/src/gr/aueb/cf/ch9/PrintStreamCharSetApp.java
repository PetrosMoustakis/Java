package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * PrintStream με charset
 */
public class PrintStreamCharSetApp {

    public static void main(String[] args) {

        try ( PrintStream ps = new PrintStream("C:/tmp/file1.txt", StandardCharsets.UTF_8);
            PrintWriter pw = new PrintWriter("C:/tmp/file2.txt", "Windows-1253") ) {
            ps.println("Γεια");
            pw.println("Καλησπερα!");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
