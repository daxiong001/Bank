package com.javase.bank;

public class Customer {
    private String firstName;
    private String lastName;

    private SavingAccount savingAccount;
    private CheckingAccount checkAccount;

    private int numberOfAccount;

    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }



    public CheckingAccount getCheckAccount() {
        return checkAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public void setCheckAccount(CheckingAccount checkAccount) {
        this.checkAccount = checkAccount;
    }

    public int getNumberOfAccount(){
        return numberOfAccount;
    }

}
