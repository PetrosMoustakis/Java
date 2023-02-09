package gr.aueb.cf.ch20.regexapp;

public class Main {

    public static void main(String[] args) {
        String s = "Green";
        System.out.println(isRedOrGreen(s));
    }

//If is "Red"
    public static boolean isRed(String s) {
        return s.matches("Red");
    }


//    If is "Red" or "Green"
    public static boolean isRedOrGreen(String s) {
        return s.matches("Red|Green");
    }

//  If is "Red" or "red" or "Green" or "green"
public static boolean isRredOrGgreen(String s) {
    return s.matches("[Rr]ed|[Gg]reen");
    }

//    Begin with one uppercase letter and then ending with "ing"
    public static boolean OneUpperCaseEndsWithIng (String s) {
        return s.matches("[A-Z]ing");
    }

    //    Begin with one uppercase/lowercase letter and then ending with "ing"
    public static boolean OneUpperCaseOrLowerCaseEndsWithIng (String s) {
        return s.matches("[a-zA-Z]ing");
    }

    /*
      . Οποιοσδηποτε χαρακτηρας
      ^ Χαρακτηρας String
      $ Τελος String
      \w Χαρακτηρας λεξης a-zA-Z0-0_
      \W Οποιοσδήποτε χαρακτήρας εκτός απο χαρακτήρα λέξης (Τα απο πάνω)
      \S white space
      \d Οποιοδήποτε ψηφίο
      \D Οποιοσδήποτε χαρακτήρας εκτός απο ψηφίο
     */

    public static boolean isAnySpaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    public static boolean isLetterDigit(String s) {
        return s.matches("\\w\\d");
    }

    public static boolean isLetterDigitAnywhere(String s) {
        return s.matches(".*\\w\\d.*");
    }

//    Letter Digit as a whole word
    public static boolean isLetterDigitAsWord(String s) {
        return s.matches(".*\\b\\w\\d\\b");
    }

    /*
     * ? Μηδεν ή μια εμφάνιση
     * + Μια ή περισσοτερες εμφανίσεις .+
     * * Μηδέν ή περισσότερες φορές
     * {n} n εμφανίσεις ακριβώς .{3}
     * {n,m} μεταξύ n και m εμφανίσεων .{5,7}
     * {n, } τουλάχιστον n .*a{3,}.*
     * {, m} Το πολύ m εμφανίσεις [a-z]{,5}
     */

//    e-mail
    public static boolean isValidEmail(String s) {
        return s.matches("\\w\\.?\\w+@\\w+\\.(com|gr)");
    }

//    Two uppercase lettersDashSevenDigits
    public static boolean isTwoLettersDashSevenDigits(String s) {
        return s.matches("[A-Z]{2}-\\d{7}");
    }

//    Returns an array of tokens delimited by one or more spaces
    public static String[] getTokens(String s) {
        return s.split("\\s+");
    }

//    Replaces one or more spaces with one space
    public static String normalizeStr(String s) {
        return s.replaceAll("\\s+", " ");
    }

    public static String mutuallyChange(String s) {
        return s.replaceAll("(.*)\\s+(.*)", "$2 $1");
    }
}
