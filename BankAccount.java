package Day11_12_OOPProgram;

import java.util.Scanner;

public class BankAccount {

    static Scanner scanner = new Scanner(System.in);

    private double balance;

    /*
     * create constructor with no return type (void, boolean etc) and has the same
     * name as the class
     */
    public BankAccount(double intialBalance) {
        balance = intialBalance;

    }

    public void debit(double balance) {
        System.out.println("enter ammount to withdraw");
        double withdraw = scanner.nextDouble();

        if (withdraw > balance)
            System.out.println("withdraw exceeds the balance please enter correct amount");
        else
            balance = balance - withdraw;
        System.out.println("Remaining balance is " + balance);

    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public static void main(String[] args) {

        System.out.println("Enter the balance to mention in the account");
        BankAccount account = new BankAccount(scanner.nextDouble());
        account.debit(account.balance);
    }
}

