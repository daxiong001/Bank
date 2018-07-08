package testjava;

import com.javase.bank.Bank;
import com.javase.bank.Customer;

public class TestBanking {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Simms","Jane");
        bank.addCustomer("Bryant","Owen");
        bank.addCustomer("Soley","Tim");
        bank.addCustomer("Soley","Maria");
        int num = bank.getNumberOfCustomers();
        for (int i = 0; i < num; i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Customer"+"["+i+"]"+"is"+customer.getFirstName()+","+customer.getLastName());
        }
    }
}
