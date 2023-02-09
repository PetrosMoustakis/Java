package gr.aueb.cf.ch18;

import gr.aueb.cf.ch18.dao.IAccountsDAOImpl;
import gr.aueb.cf.ch18.dto.AccountDTO;
import gr.aueb.cf.ch18.dto.UserDetailsDTO;
import gr.aueb.cf.ch18.serviceLayer.IAccountsImpl;
import gr.aueb.cf.ch18.serviceLayer.exceptions.AccountAlreadyExistsException;
import gr.aueb.cf.ch18.serviceLayer.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.serviceLayer.exceptions.InsufficientBalanceException;

public class Main {

    public static void main(String[] args) throws AccountAlreadyExistsException, AccountNotFoundException, InsufficientBalanceException {


        IAccountsDAOImpl dao = new IAccountsDAOImpl();
        IAccountsImpl service = new IAccountsImpl(dao);
        UserDetailsDTO newUser = new UserDetailsDTO();
        AccountDTO newAccount = new AccountDTO();


        newUser.setUserDetailsId(123L);
        newUser.setFirstname("petros");
        newUser.setLastname("peter");

        newAccount.setAccountsId(123L);
        newAccount.setIban("iban123");
        newAccount.setBalance(1000.0);
        newAccount.setSsn("ssn123");
        newAccount.setUserDetailsDTO(newUser);


        System.out.println(service.insertAccount(newAccount));
        System.out.println(service.getAllAccounts());
        System.out.println(service.getAccountBalance("iban123"));
//        service.deposit(100, "iban123");
        service.withdraw(100, "iban123");
        System.out.println(service.getAccountBalance("iban123"));


    }
}
