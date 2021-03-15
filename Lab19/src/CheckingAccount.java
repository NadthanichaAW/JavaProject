
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
public class CheckingAccount extends ObjectOfAccount{  
    private double overdraftLimit;

    public CheckingAccount() 
    {
        overdraftLimit = 5000;
    }

    public CheckingAccount(double overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(double overdraftLimit, double balance, int id) {
        super(balance, id);
        this.overdraftLimit = overdraftLimit;
    }
    
   
    //method
      double withdraw(double amountAccount)
    {
        if(getBalance() + 5000 >= amountAccount)
        {
            setBalance(getBalance()-amountAccount);
        }else
            System.out.println("Sorry , amount exceeds overdraft limit.");
        return 0;
    }

    @Override
    public String toString() {
        return "\nCheckings"+ "\nOverdraft limit: " +overdraftLimit+ super.toString();
    }
    
      
      
    
}
