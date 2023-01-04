package gr.aueb.cf.ch12.bankapp.model;

import gr.aueb.cf.ch12.bankapp.model.JointAccount;

public class OverdraftAccount {

    private JointAccount account;
    private double balance;
    private String  ssn;
    public OverdraftAccount() {
    }

    public OverdraftAccount(JointAccount account, double balance, String ssn) {
        this.account = account;
        this.balance = balance;
        this.ssn = ssn;
    }

    public JointAccount getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void withdraw(double amount) throws Exception {
        double newBalance = 0.0;
        try {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successful withdraw");
            } else {
                newBalance = balance-amount;
                setBalance(newBalance);
                System.out.println("Your account is locked until a deposit is made to bring the account up to a positive value");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public double getAccountBalance() {return getBalance();}


}
