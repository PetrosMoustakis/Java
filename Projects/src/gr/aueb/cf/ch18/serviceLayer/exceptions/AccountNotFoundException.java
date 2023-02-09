package gr.aueb.cf.ch18.serviceLayer.exceptions;

import gr.aueb.cf.ch18.model.Account;

public class AccountNotFoundException extends Exception {
    public final static long serialVersionUID = 1L;

    public AccountNotFoundException(String iban) {
        super("The account with iban: " + iban + " was not found.");
    }

    public AccountNotFoundException(Account account) {
        super("The account with id: " + account.getId() + " and iban: " + account.getIban() + " was not found.");
    }
}
