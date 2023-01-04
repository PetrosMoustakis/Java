package gr.aueb.cf.ch4;

/*
Unicode chars greater than 4 Hex digits
using surrogate pairs.
 */


public class UnicodeApp {

    public static void main(String[] args)  {
        int codePoint = 0x1F600;

        System.out.println("Smiley: \uD83D\uDE00");

        System.out.print("Smiley: ");
        System.out.print(Character.toChars(codePoint));
    }
}
