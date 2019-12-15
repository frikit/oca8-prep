package org.frikit.practice.ex2;

public class CheckingAccount {
    public int amount = 0;

    public CheckingAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void changeAmount(int amount) {
        this.amount += amount;
    }
}
