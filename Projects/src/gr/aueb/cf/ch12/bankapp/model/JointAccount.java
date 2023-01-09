package gr.aueb.cf.ch12.bankapp.model;

public class JointAccount {

    private String firstname1;
    private String firstname2;
    private String lastname1;
    private String lastname2;
    private int id;
    private String iban;
    private String ssnKey;


    public JointAccount() {}

    public JointAccount(String firstname1, String firstname2, String lastname1, String lastname2, int id, String iban, String ssnKey, double balance) {
        this.firstname1 = firstname1;
        this.firstname2 = firstname2;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.id = id;
        this.iban = iban;
        this.ssnKey = ssnKey;
    }

    public String getFirstname1() {
        return firstname1;
    }

    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSsnKey() {
        return ssnKey;
    }

    public void setSsnKey(String ssnKey) {
        this.ssnKey = ssnKey;
    }



    public String getAccountState() {
        return "(" + id + ", " + iban + ", " + firstname1 + ", "
                + lastname1 + ", " + firstname2 + ", " + lastname2 + ", " + ssnKey + ")";
    }


}
