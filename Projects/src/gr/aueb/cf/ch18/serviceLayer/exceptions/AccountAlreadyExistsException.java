package gr.aueb.cf.ch18.serviceLayer.exceptions;

import gr.aueb.cf.ch18.model.Account;

public class AccountAlreadyExistsException extends Exception {
    private final static long serialVersionUID = 1L;

    public AccountAlreadyExistsException(Account account) {
        super("Account with iban: " +
                account.getIban() + " already exists.");
    }
}
