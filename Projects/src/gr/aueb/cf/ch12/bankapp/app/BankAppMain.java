package gr.aueb.cf.ch12.bankapp.app;

import gr.aueb.cf.ch12.bankapp.model.JointAccount;
import gr.aueb.cf.ch12.bankapp.model.OverdraftAccount;

public class BankAppMain {
    public static void main(String[] args) {

        JointAccount account = new JointAccount("Petros", "Giannis", "Moustakis", "Moustakis", 24104, "GR4839583", "R49503");
        OverdraftAccount balance = new OverdraftAccount();

        balance.setBalance(320);
        balance.setSsn("R49503");

        try {
            if (balance.getSsn().equals(account.getSsnKey())){
                balance.withdraw(270);
                System.out.println("Account State: " + account.getAccountState());
                System.out.println("Balance: " + balance.getAccountBalance());
            } else {
                throw new Exception("Ssn not valid exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
