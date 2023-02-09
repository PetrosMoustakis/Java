package gr.aueb.cf.ch19.enums;

public enum AccountType {
    DEPOSIT("DP"),
    SAVINGS("SA"),
    CURRENT("CU");

    private String code;

     AccountType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}

class Main {
    public static void main(String[] args) {
        AccountType type = AccountType.CURRENT;
        AccountType type2 = AccountType.DEPOSIT;

        for (AccountType accountType : AccountType.values()) {
            System.out.println("Name: " + accountType.name());
            System.out.println("Ord: " + accountType.ordinal());

        }
    }
}
