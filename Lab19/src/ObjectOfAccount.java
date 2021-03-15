
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class ObjectOfAccount {   
    private double balance; 
    private int id;
    private double annualInterestRate = 4.2;
    private java.util.Date dateCreated;
    
    
    public ObjectOfAccount() 
    {
        dateCreated = new java.util.Date();
    }       
    public ObjectOfAccount(double balance, int id) 
    {
        this();
        this.balance = balance;
        this.id = id;
      
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

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    double withdraw(double amountAccount)
    {        
        return this.balance -= amountAccount ;
    }
    double deposit(double amountAccount)
    {
        return this.balance += amountAccount;       
    }

    @Override
    public String toString() {
        return "\nid = " + id + "\nAnnualInterestRate = " + annualInterestRate + "\nBalance is " + balance + "\nThis account was created at " + dateCreated ;
    }
    
    

    
    
   
    
            
}
