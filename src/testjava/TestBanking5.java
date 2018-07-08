package testjava;

import com.javase.bank.Bank;
import com.javase.bank.CheckingAccount;
import com.javase.bank.Customer;
import com.javase.bank.SavingAccount;

public class TestBanking5 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer;
        bank.addCustomer("Jane","Smith");
        System.out.println("Jane Smith");
        bank.getCustomer(0).setAccount(new SavingAccount(500,0.03));
        System.out.println("Creating his Checking Account with a 500.00 balance and no \n" + "overdraft protection");
        bank.addCustomer("Owen","Bryant");
        customer = bank.getCustomer(1);

    }
}
