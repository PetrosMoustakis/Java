package gr.aueb.cf.ch18.dto;

public class AccountDTO {

    private Long AccountsId;
    private UserDetailsDTO userDetailsDTO;
    private String iban;
    private double balance;
    private String ssn;

    public AccountDTO() {}

    public Long getAccountsId() {
        return AccountsId;
    }
    public void setAccountsId(Long accountsId) {
        AccountsId = accountsId;
    }
    public UserDetailsDTO getUserDetailsDTO() {
        return userDetailsDTO;
    }
    public void setUserDetailsDTO(UserDetailsDTO userDetailsDTO) {
        this.userDetailsDTO = userDetailsDTO;
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
}
