package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamMethodApp {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("C:/tmp/cf.txt")) {
            printMessage(ps,"Hello All!");
            printMessage(System.out, "Hello again!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printMessage(PrintStream ps,String msg) {
        ps.println(msg);
    }
}
