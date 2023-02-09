package gr.aueb.cf.ch18.serviceLayer.exceptions;

public class InsufficientBalanceException extends Exception {
    public final static long serialVersionUID = 1L;

    public InsufficientBalanceException(double amount) {
        super("The amount is not valid.");
    }
}
