package testjava;

import com.javase.bank.*;

public class TestBanking5 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer;
        bank.addCustomer("Jane","Smith");
        System.out.println("Jane Smith");
        bank.getCustomer(0).setAccount(new SavingAccount(500,0.03));
        System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest");


        bank.addCustomer("Owen","Bryant");
        customer = bank.getCustomer(1);
        System.out.println("Creating the customer"+"  "+customer.getFirstName()+" "+customer.getLastName());
        System.out.println("Creating his Checking Account with a 500.00 balance and no " + "overdraft protection");
        customer.setAccount(new CheckingAccount(500));

        bank.addCustomer("Tim"," Soley");
        customer = bank.getCustomer(2);
        System.out.println("Creating the customer"+"  "+customer.getFirstName()+" "+customer.getLastName());
        customer.setAccount(new CheckingAccount(500,500));
        System.out.println("Creating his Checking Account with a 500.00 balance and 500.00 in overdraft protection");

        bank.addCustomer("Maria","Soley");
        customer = bank.getCustomer(3);
        customer.setAccount(bank.getCustomer(2).getAccount());
        System.out.println("Maria shares her Checking Account with her husband Tim");

        System.out.println("Retrieving the customer Jane Smith with her savings account");
        boolean a = bank.getCustomer(0).getAccount().withdraw(150);
        System.out.println("Withdraw 150.00:"+"  "+a);
        boolean b = bank.getCustomer(0).getAccount().deposit(22.50);
        System.out.println("Deposit 22.50: "+b);
        boolean c = bank.getCustomer(0).getAccount().withdraw(47.62);
        System.out.println("Withdraw 47.62: "+c);
        boolean d = bank.getCustomer(0).getAccount().withdraw(400);
        System.out.println("Withdraw 400.00: "+d);
        double e = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("Customer [Simms, Jane] has a balance of  "+e);

        System.out.println("Retrieving the customer Owen Bryant with his checking account with " +
                "no overdraft protection");
        boolean a1 = bank.getCustomer(1).getAccount().withdraw(150);
        System.out.println("Withdraw 150.00:"+"  "+a1);
        boolean b1 = bank.getCustomer(1).getAccount().deposit(22.50);
        System.out.println("Deposit 22.50: "+b1);
        boolean c1 = bank.getCustomer(1).getAccount().withdraw(47.62);
        System.out.println("Withdraw 47.62: "+c1);
        boolean d1 = bank.getCustomer(1).getAccount().withdraw(400);
        System.out.println("Withdraw 400.00: "+d1);
        double e1 = bank.getCustomer(1).getAccount().getBalance();
        System.out.println("Customer [Bryant, Owen] has a balance of  "+e1);
    }
}
