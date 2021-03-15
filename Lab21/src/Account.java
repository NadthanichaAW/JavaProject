
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Account {
    private String name;
    private double balance; 
    private int id;
    private double annualInterestRate = 0.0;
    private ArrayList<Transaction> transaction;

    public Account() 
    {
        transaction = new ArrayList<Transaction>();
    }

    public Account(String name, double balance, int id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
        transaction = new ArrayList<Transaction>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }
    double getMonthlyInterestRate()
    {
        return (annualInterestRate/100)/12;
    }
    double getMonthlyInterest()
    {
        return balance*getMonthlyInterestRate();
    }    
   
    public void withdraw(double amount)
    {
       balance -= amount;
       transaction.add(new Transaction('W',"Withdrawal from account" , balance, amount));       
    }
    public void deposit(double amount)
    {
        balance += amount;
        transaction.add(new Transaction('D',"Deposit to account" , balance, amount));
    }
    
    public ArrayList<Transaction> getTransaction()
    {
        return transaction;
    }
    
}
