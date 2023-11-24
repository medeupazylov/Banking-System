package bankning_system;

public class Account {
    private int account_number;
    private int account_balance;

    protected Account(int account_number, int account_balance) {
        this.account_balance=account_balance;
        this.account_number=account_number;
    }

    protected int getAccount_number() {
        return account_number;
    }

    protected int getAccount_balance() {
        return account_balance;
    }

    protected void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

}
