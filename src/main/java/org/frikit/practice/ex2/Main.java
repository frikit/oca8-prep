package org.frikit.practice.ex2;

public class Main {

    public static void main(String[] args) {
        //case 1
        CheckingAccount checkingAccount = new CheckingAccount(133);
        //this is not working
//        checkingAccount(0);
        System.out.println(checkingAccount.amount);
        //case 2
        checkingAccount = new CheckingAccount(133);
        //this is not working
//        this.amount = 0;
        System.out.println(checkingAccount.amount);
    }
}
