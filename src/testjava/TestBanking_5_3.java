package testjava;

import com.javase.bank.*;

public class TestBanking_5_3 {
    public static void main(String[] args) {
        Customer customer;
        Bank bank = new Bank();
        bank.addCustomer("Simms","Jane");
        customer = bank.getCustomer(0);
        customer.setCheckAccount(new CheckingAccount(200,customer.getSavingAccount()));
        customer.setSavingAccount(new SavingAccount(200,0.05));
    }
}
