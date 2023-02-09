package gr.aueb.cf.ch20.regexapp;

// gets as Input a string containing any 6 chars and asserts that the string includes at least
//one lowercase letter.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LowerCaseValidationApp {

    public static void main(String[] args) {

        String s = "";

        Pattern pattern = Pattern.compile("^(?=.*[a-z]).{6,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
