package oop;

public class BankAccount
{
    private int balance;
    public void setBalance(int newBalance)
    {
        balance = newBalance;
    }
    public void addBalance(int addedAmount)
    {
        balance += addedAmount;
    }
    public void withdrawBalance(int withdrawnAmount)
    {
        balance -= withdrawnAmount;
    }
    public int readBalance()
    {
        return balance;
    }
}
