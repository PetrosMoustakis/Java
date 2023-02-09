package gr.aueb.cf.ch18.serviceLayer;

import gr.aueb.cf.ch18.dto.AccountDTO;
import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.serviceLayer.exceptions.AccountAlreadyExistsException;
import gr.aueb.cf.ch18.serviceLayer.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.serviceLayer.exceptions.InsufficientBalanceException;

import java.util.List;

public interface IAccountsService {

    Account insertAccount(AccountDTO accountDTO)
        throws  AccountAlreadyExistsException;

    Account updateAccount(AccountDTO accountDTO)
        throws AccountAlreadyExistsException, AccountNotFoundException;

    void deleteAccount(String iban)
        throws AccountNotFoundException;

    Account get(String iban)
        throws AccountNotFoundException;

    List<Account> getAllAccounts();

    void deposit(double amount,String iban)
        throws AccountNotFoundException, InsufficientBalanceException;

    void withdraw(double amount,String iban)
        throws AccountNotFoundException, InsufficientBalanceException;

    double getAccountBalance(String iban)
        throws AccountNotFoundException;

}

