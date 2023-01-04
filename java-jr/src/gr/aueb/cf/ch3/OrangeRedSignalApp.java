package gr.aueb.cf.ch3;

/*
Ενα αεροσκαφος εχει δυο δεξαμενες.
Ο πιλοτος δινει true σε μια κονσολα αν η μια δεξαμενη
εχει μικροτερο απο το 1/4 της χωρητικοτητας της καυσιμα.
Τοτε αναβει ενα πορτοκαλι λαμπακι. Αν δωσει δυο true,
τοτε αναβει ενα κοκκινο σημα
 */

import java.util.Scanner;

public class OrangeRedSignalApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean orangeOn= false;
        boolean redOn = false;
        boolean isTankLessThanOneQuarter = false;
        boolean isTank2LTOneQuarter = false;

        System.out.println("Insert if tank1/tank2 less than 1/4 (true/false)");
        isTankLessThanOneQuarter = in.nextBoolean();
        isTank2LTOneQuarter = in.nextBoolean();

        orangeOn = isTankLessThanOneQuarter || isTank2LTOneQuarter;
        redOn = isTankLessThanOneQuarter && isTank2LTOneQuarter;

        System.out.println("Orange On " + orangeOn);
        System.out.println("Red On " + redOn);
    }
}
