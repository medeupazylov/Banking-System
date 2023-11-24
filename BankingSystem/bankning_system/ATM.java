package bankning_system;

public class ATM {

    Bank bank;

    private int loggedAccNum;

    protected void setBank(Bank bank) {
        this.bank = bank;
    }


    public boolean loginToAccount(int accNum) {
        try {
            bank.accessAccInfo(accNum);
            this.loggedAccNum=accNum;
            //System.out.println("logged in:"+loggedAccNum);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deposit(int amount) {
        if(loggedAccNum != 0) {
            try {
                bank.updateAccBal(loggedAccNum, amount);
                return true;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }

        }
        return false;
    }

    public boolean withdraw(int amount) {
        if(loggedAccNum != 0) {
            try {
                bank.updateAccBal(loggedAccNum, -amount);
                return true;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        }
        return false;
    }

    public int getBalance() {
        if(loggedAccNum != 0) {
            //System.out.println("have access");
            try {
                return bank.getAccBal(loggedAccNum);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        return 0;
    }

    public void logout() {
        loggedAccNum = 0;
    }




}
