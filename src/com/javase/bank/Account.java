package com.javase.bank;

public class Account {
    protected  double balance;
    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amt){
        this.balance += amt;
        return true;
    }

    public void withdraw(double amt){
        if (this.balance<amt){
           throw new OverdraftException("资金不足",(amt-balance));
        }
        this.balance -= amt;

    }
}
