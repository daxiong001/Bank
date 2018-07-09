package com.javase.bank;

public class CheckingAccount extends Account {
    private double OverdraftProtection = -1;


    public CheckingAccount(double init_balance) {
        super(init_balance);
    }


    public CheckingAccount(double init_balance, double OverdraftProtection) {
        super(init_balance);
        this.OverdraftProtection = OverdraftProtection;
    }

    @Override
    public void withdraw(double amt) {
        if (this.balance >= amt){
            balance -= amt;
        }else if (OverdraftProtection == -1){
            throw new OverdraftException("no overdraft protection",(amt-balance));
        }
        else if (OverdraftProtection>= (amt - balance)){
            OverdraftProtection -= (amt - balance);
                balance = 0;
        }else{
            throw new OverdraftException("Insufficient funds for overdraft protection",(amt - balance));
        }

    }

}
