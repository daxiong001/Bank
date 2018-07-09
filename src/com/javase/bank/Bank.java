package com.javase.bank;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;
    private static Bank instance;

    private Bank(){
        customers = new Customer[10];
    }

    public static Bank getInstance(){
        if (instance == null){
            instance = new Bank();
        }
        return instance;
    }

    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;
    }

    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomer(int numberOfCustomers){
        return customers[numberOfCustomers];
    }
}
