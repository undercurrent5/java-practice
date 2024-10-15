package oop1.ex;

public class Account {

    private int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        }
        else {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
