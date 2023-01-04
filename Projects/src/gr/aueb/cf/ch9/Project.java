package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Project {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\petro\\OneDrive\\Desktop\\primIn.txt"));
        PrintStream ps = new PrintStream("C:\\Users\\petro\\OneDrive\\Desktop\\primOut.txt");
        PrintWriter log = new PrintWriter("log.txt");
        String token, output = " ";
        int num , sum = 0 , count = 0;
        double average = 0.0;

        try {
            while (sc.hasNext()) {
                token = sc.next();
                if (!isInteger(token)) {
                    output = token;
                }
                else {
                    num = Integer.parseInt(token);
                    count++;
                    sum += num;

                    average = (double) sum / count;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(log);
            throw  e;
        }

        ps.printf(output + "\n");
        ps.printf(Locale.ENGLISH, "Μέσος όρος : %.2f", average);

        log.close();


    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
