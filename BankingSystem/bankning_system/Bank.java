package bankning_system;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<Account>();

    public int createAccount() {
        accounts.add(new Account(100001+accounts.size(), 0));
        return 100000+accounts.size();
    }

    public void attachATM(ATM atm) {
        atm.setBank(this);
    }

    protected int accessAccInfo(int accNum) throws Exception{
        for (int i = 0; i < accounts.size(); i++) {
            if (accNum == accounts.get(i).getAccount_number())
                return accounts.get(i).getAccount_balance();
        }
        throw new Exception("No corresponding account in the Bank");
    }

    protected void updateAccBal(int accNum, int diff) throws Exception{

        boolean accFound = false;

        for (int i = 0; i < accounts.size(); i++) {
            if (accNum == accounts.get(i).getAccount_number()) {
                if(accounts.get(i).getAccount_balance()+diff >= 0) {
                    accounts.get(i).setAccount_balance(accounts.get(i).getAccount_balance()+diff);
                    accFound = true;
                } else {
                    throw new Exception("Not enough money to withdraw");
                }

            }
        }
        if(!accFound)
            throw new Exception("No corresponding account in the Bank");
    }

    protected int getAccBal(int accNum) throws Exception{
        for (int i = 0; i < accounts.size(); i++) {
            if (accNum == accounts.get(i).getAccount_number()) {
                return accounts.get(i).getAccount_balance();
            }
        }
        throw new Exception("No corresponding account in the Bank");
    }


}