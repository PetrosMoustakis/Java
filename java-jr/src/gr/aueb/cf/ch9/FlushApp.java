package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FlushApp {
    public static void main(String[] args) {


        try {
            PrintWriter pw = new PrintWriter("C:/tmp/flush-text.txt");
            pw.print("Hello");
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
