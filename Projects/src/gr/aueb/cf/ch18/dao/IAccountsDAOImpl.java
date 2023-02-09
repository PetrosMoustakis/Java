package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.Account;

import java.lang.management.LockInfo;
import java.util.ArrayList;
import java.util.List;

public class IAccountsDAOImpl implements IAccountsDAO {

    private static final List<Account> accounts = new ArrayList<>();

    @Override
    public Account get(String iban) {
        int pos = getIndexByIban(iban);
        if (pos == -1) return null;
        return accounts.get(pos);
    }

    @Override
    public List<Account> getAll() {
        return new ArrayList<>(accounts);
    }

    @Override
    public Account insert(Account account) {
        accounts.add(account);
        return account;
    }

    @Override
    public Account update(Account account) {
        return accounts.set(accounts.indexOf(account),account);
    }

    @Override
    public void delete(String iban) {
        accounts.removeIf((account -> account.getIban().equals(iban)));
    }

    @Override
    public void deposit(double amount, String iban) {
        int index = getIndexByIban(iban);
        if (index != -1) {
            Account account = accounts.get(index);
            if (amount > 0) {
                account.setBalance(account.getBalance() + amount);
            }
        }
    }

    @Override
    public void withdraw(double amount, String iban) {
        int index = getIndexByIban(iban);
        if (index != -1) {
            Account account = accounts.get(index);
            if (amount <= getAccountBalance(iban)) {
                account.setBalance(getAccountBalance(iban) - amount);
                update(account);
            }
        }
    }

    @Override
    public boolean accountExists(String iban) {
        return getIndexByIban(iban) != -1;
    }

    @Override
    public boolean accountHolderExists(Long id) {
        return getIndexById(id) != -1;
    }

    @Override
    public double getAccountBalance(String iban) {
        int index = getIndexByIban(iban);
        if (index == -1) {
            return -1;
        } else {
            return accounts.get(index).getBalance();
        }
    }

    private int getIndexByIban(String iban) {
        int pos = -1;

        for (int i = 0; i < accounts.size(); i++ ) {
            if (accounts.get(i).getIban().equals(iban)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    private int getIndexById(Long id) {
        int pos = -1;

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().equals(id)) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
