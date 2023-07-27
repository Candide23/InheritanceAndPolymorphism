package org.example.accounts;

public class SavingAccount extends  Account{


    public SavingAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    public boolean withdraw(double amount){
        double fee = 0.25 * amount;
        amount +=fee;

        return super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
}
