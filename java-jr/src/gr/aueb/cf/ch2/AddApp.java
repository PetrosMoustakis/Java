package gr.aueb.cf.ch2;

import java.sql.SQLOutput;

public class AddApp {

    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητων

        int num1 = 5;
        int num2 = 2_147_483_647;
        int result = 0;

        // Εντολες
        result = num1 + num2;

                //Εκτυπωση αποτελεσματος
        //System.out.println( "Το αποτελεσμα των " + num1 + " και " + num2 + " ειναι: " + result);
        //System.out.println();

        System.out.printf("Το αποτελεσμα των %d και %d ειναι: %,d\n", num1,num2,result);
    }
}
