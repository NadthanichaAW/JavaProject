
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class lab14 {
    public static void main(String[] args) 
    {
        Scanner inputMoney = new Scanner(System.in);
        Account account = new Account(1122,20000);
        account.setAnnual(4.5);
        
        System.out.println("The balance is "+account.getBlance());
        System.out.print("Withdraw : ");
        double inputWithdraw = inputMoney.nextDouble();
        account.withdraw(inputWithdraw);        
        System.out.print("Deposit : ");
        double inputDeposit = inputMoney.nextDouble();
        account.deposit(inputDeposit);
        
        System.out.println("The balance is "+account.getBlance());
        System.out.println("The monthly interest is  "+account.getMonthlyInterest());
        System.out.println("The date when this account was created :  "+account.getDateCreated());
    }    
}
class Account
{
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0 ; //store current rate
    private java.util.Date dateCreated;
    
    public Account()
    {
        dateCreated = new java.util.Date();
    }
   public Account(int id,double balance)
    {
        this();
        this.id = id;
        this.balance = balance;
    }
    //Accessor method
    public int getId()
    {
        return this.id;
    }
    public double getBlance()
    {
        return this.balance;
    }
    public double getAnnual()
    {
        return annualInterestRate;
    }
    public String getDateCreated()
    {
        return this.dateCreated.toString();
    }
    //mutator method
    public int setId(int id)
    {
        return this.id = id;
    }
    public double setBalance(double balance)
    {
        return this.balance = balance;
    }
    public double setAnnual(double annualInterestRate )
    {
        return this.annualInterestRate = annualInterestRate;
    }
    //method
    double getMonthlyInterestRate()
    {
        return (annualInterestRate/100)/12;
    }
    double getMonthlyInterest()
    {
        return balance*getMonthlyInterestRate();
    }
    double withdraw(double amountAccount)
    {
        if(this.balance > amountAccount)
        {
            this.balance -= amountAccount;
            System.out.println("The balance is "+this.getBlance());
        }
        else
          System.out.println("Not enough balance ");        
        return 0;       
    }
    double deposit(double amountAccount)
    {
        return this.balance += amountAccount;    
    }    
}