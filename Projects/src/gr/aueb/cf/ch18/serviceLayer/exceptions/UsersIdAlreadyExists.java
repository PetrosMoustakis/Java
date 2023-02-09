package gr.aueb.cf.ch18.serviceLayer.exceptions;

import gr.aueb.cf.ch18.model.Account;

public class UsersIdAlreadyExists extends Exception {

    public final static long serialVersionUID = 1L;

    public UsersIdAlreadyExists(Account account) {
        super("The account with user id: " +
                account.getId() + " already exists.");
    }
}
