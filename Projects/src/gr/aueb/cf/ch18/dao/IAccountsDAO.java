package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.Account;

public interface IAccountsDAO extends DAO<Account> {

    void deposit (double amount,String iban);

    void withdraw (double amount,String iban);

    boolean accountExists(String iban);

    boolean accountHolderExists(Long id);

    double getAccountBalance(String iban);

}
