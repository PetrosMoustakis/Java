package gr.aueb.cf.ch18.serviceLayer;

import gr.aueb.cf.ch18.dao.IAccountsDAO;
import gr.aueb.cf.ch18.dto.AccountDTO;
import gr.aueb.cf.ch18.dto.UserDetailsDTO;
import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.model.UserDetails;
import gr.aueb.cf.ch18.serviceLayer.exceptions.AccountAlreadyExistsException;
import gr.aueb.cf.ch18.serviceLayer.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.serviceLayer.exceptions.InsufficientBalanceException;

import java.util.List;

public class IAccountsImpl implements IAccountsService {

    private final IAccountsDAO dao;

    public IAccountsImpl(IAccountsDAO dao) {this.dao = dao;}

    @Override
    public Account insertAccount(AccountDTO accountDTO)
            throws AccountAlreadyExistsException {
        Account account;
        try {
            account = new Account();
            mapAccounts(account,accountDTO);

            if(dao.accountExists(account.getIban())) {
                throw new  AccountAlreadyExistsException(account);
            }
            return dao.insert(account);
        } catch (AccountAlreadyExistsException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account updateAccount(AccountDTO accountDTO) throws AccountAlreadyExistsException, AccountNotFoundException {
        Account account;
        try {
            account = new Account();
            mapAccounts(account,accountDTO);

            if(dao.accountExists(account.getIban())) {
                throw new AccountAlreadyExistsException(account);
            }

            if (!dao.accountHolderExists(account.getId())) {
                throw new AccountNotFoundException(account);
            }

            return dao.update(account);
        } catch (AccountAlreadyExistsException|AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteAccount(String iban) throws AccountNotFoundException {
        try {
            if (!dao.accountExists(iban)) {
                throw new AccountNotFoundException(iban);
            }
        }catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account get(String iban) throws AccountNotFoundException {
        Account account;
        try {
            account = dao.get(iban);
            if (account == null) {
                throw new AccountNotFoundException(iban);
            } return dao.get(iban);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Account> getAllAccounts() {
        return dao.getAll();
    }

    @Override
    public void deposit(double amount, String iban) throws AccountNotFoundException, InsufficientBalanceException {
        Account account;

        try {
            account = dao.get(iban);
            if (account == null) {
                throw new AccountNotFoundException(iban);
            }
            if (amount < 0) {
                throw new InsufficientBalanceException(amount);
            }
        } catch (AccountNotFoundException|InsufficientBalanceException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void withdraw(double amount, String iban) throws AccountNotFoundException, InsufficientBalanceException {
        Account account;

        try {
            account = dao.get(iban);
            if (account == null) {
                throw new AccountNotFoundException(iban);
            }
            if (amount > getAccountBalance(iban)) {
                throw new InsufficientBalanceException(amount);
            }
        } catch (AccountNotFoundException|InsufficientBalanceException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public double getAccountBalance(String iban) throws AccountNotFoundException {
        Account account;
        try {
            account = dao.get(iban);
            if (account == null) {
                throw new AccountNotFoundException(iban);
            }

            return dao.getAccountBalance(iban);
        }catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private void mapUserDetails(UserDetails userDetails, UserDetailsDTO userDetailsDTO) {
        userDetails.setId(userDetailsDTO.getUserDetailsId());
        userDetails.setFirstname(userDetailsDTO.getFirstname());
        userDetails.setLastname(userDetailsDTO.getLastname());
    }

    private void mapAccounts(Account account, AccountDTO accountDTO) {
        account.setId(accountDTO.getAccountsId());
        account.setIban(accountDTO.getIban());
        account.setBalance(accountDTO.getBalance());
        account.setSsn(accountDTO.getSsn());
        UserDetails userDetails = new UserDetails();
        mapUserDetails(userDetails,accountDTO.getUserDetailsDTO());
        account.setUserDetails(userDetails);
    }
}
