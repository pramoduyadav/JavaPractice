package com.company.Threading.challenge;

public class BankTransaction {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000.00, "12345-678");

        Thread t1 = new Thread(() -> {
            bankAccount.deposit(300);
            bankAccount.withdraw(50);
            System.out.println(bankAccount.getBalance());
        });

        Thread t2 = new Thread(() -> {
            bankAccount.deposit(203.75);
            bankAccount.withdraw(100);
            System.out.println(bankAccount.getBalance());
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final Balance " +bankAccount.getBalance());
    }
}

