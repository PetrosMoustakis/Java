package gr.aueb.cf.ch18.model;

public class Account extends AbstractEntity {

    private UserDetails userDetails;
    private String iban;
    private double balance;
    private String ssn;

    public Account() {}

    public UserDetails getUserDetails() {
        return userDetails;
    }
    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
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

    @Override
    public String toString() {
        return "Account{" +
                "userDetails=" + userDetails +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                ", ssn='" + ssn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account that = (Account) o;

//        if (!getUserDetails().equals(account.getUserDetails())) return false;
//        return getIban().equals(account.getIban());
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
//        int result = getUserDetails().hashCode();
//        result = 31 * result + getIban().hashCode();
        return getId().hashCode();
    }

}
