package gr.aueb.cf.ch17.runna;

public class Main {

    private final static Runnable joa = new Knight("joa");
    private final static Runnable whiteKnight = new Knight("White knight");
    private final static Runnable blackKnight = new Knight("Black knight");


    public static void main(String[] args) {

        (new Thread(joa)).start();
        (new Thread(whiteKnight)).start();
        (new Thread(blackKnight)).start();

    }
}
