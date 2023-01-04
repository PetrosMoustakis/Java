package gr.aueb.cf.ch3;

/*
Αποφασισει αν θα αναψουν τα φωτα του αυτοκινητου
με βαση 3 μεταβλητες: αν βρεχει και ταυτοχρονα
εαν ισχυει ενα τουλαχιστον απο τα επομενα:
είναι σκοτάδι ή τρεχουμε (speed>100)
Αυτες τις τιμες τις λαμβανουμε απο τον χρηστη
 */

import java.util.Scanner;

public class LightsApp {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        boolean lightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int velocity = 0;

        System.out.println("Please insert if it is raining:");
        isRaining = in.nextBoolean();

        System.out.println("please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("please insert velocity");
        velocity = in.nextInt();

        isRunning = velocity > 100;

        lightsOn = isRaining && (isRunning || isDark);

        System.out.println("Lights On " + lightsOn);
    }
}
