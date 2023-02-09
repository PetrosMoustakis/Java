package gr.aueb.cf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ch20 {

    public static void main(String[] args) {
        String s = "A#E8hgT";

        System.out.println(isPasswordValid(s));

    }

    public static boolean isPasswordValid(String s) {
        boolean isValid = false;

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*\\W).{8,}$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) { isValid = true; }

        return isValid;
    }

}
