package user;

import bankning_system.ATM;
import bankning_system.Bank;

public class Customer {

    private Bank bank;
    private ATM atm;
    private int accountNum;

    public Customer(Bank bank, ATM atm) {
        this.atm = atm;
        this.bank = bank;
    }

    public void openAccount() {
        accountNum = bank.createAccount();
        //System.out.println(accountNum);
    }

    public void depositMoney(int amount) {
        atm.loginToAccount(accountNum);
        atm.deposit(amount);
        atm.logout();
    }

    public void withdrawMoney(int amount) {
        atm.loginToAccount(accountNum);
        atm.withdraw(amount);
        atm.logout();
    }

    public int checkBalance() {
        atm.loginToAccount(accountNum);
        int out = atm.getBalance();
        atm.logout();
        return out;
    }

    public int getAccountNum() {
        return accountNum;
    }
}
