package user;

import bankning_system.ATM;
import bankning_system.Bank;

public class Tester {
    public static void main(String[] args) {

        Bank kaspi_bank = new Bank();
        ATM atm1 = new ATM();
        ATM atm2 = new ATM();
        kaspi_bank.attachATM(atm1);
        kaspi_bank.attachATM(atm2);

        Customer ben = new Customer(kaspi_bank, atm1);
        Customer lisa = new Customer(kaspi_bank, atm2);
        Customer jack = new Customer(kaspi_bank, atm1);

        ben.openAccount();
        System.out.println("The logged account: "+ben.getAccountNum());
        ben.depositMoney(1500);
        System.out.println("The cash: " +ben.checkBalance());
        ben.withdrawMoney(700);
        System.out.println("The cash: " +ben.checkBalance());
        ben.withdrawMoney(1000);
        System.out.println("The cash: " +ben.checkBalance());

        lisa.openAccount();;
        System.out.println("\nThe logged account: "+lisa.getAccountNum());
        lisa.depositMoney(27000);
        System.out.println("The cash: " +lisa.checkBalance());
        lisa.withdrawMoney(27000);
        System.out.println("The cash: " +lisa.checkBalance());
        lisa.withdrawMoney(1);
        System.out.println("The cash: " +lisa.checkBalance());

        jack.openAccount();
        System.out.println("\nThe logged account: "+jack.getAccountNum());
        jack.withdrawMoney(10000);
        System.out.println("The cash: " +jack.checkBalance());
        jack.depositMoney(10000);
        System.out.println("The cash: " +jack.checkBalance());
        jack.depositMoney(1900);
        jack.withdrawMoney(3900);
        System.out.println("The cash: " +jack.checkBalance());



    }
}
