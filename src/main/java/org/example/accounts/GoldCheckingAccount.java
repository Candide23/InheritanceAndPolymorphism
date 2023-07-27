package org.example.accounts;

public class GoldCheckingAccount extends CheckingAccount{

    public GoldCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return super.calculateRewardPoints(cost);
    }
}
