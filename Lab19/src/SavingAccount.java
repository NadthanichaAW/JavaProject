/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class SavingAccount extends ObjectOfAccount{
    
    public SavingAccount()
    {
        super();
    }
    
    public SavingAccount(double balance,int id)
    {
        super(balance,id);
    }
    double withdraw(double amountAccount)
    {
        if(getBalance() > amountAccount)
        {
            setBalance(getBalance()-amountAccount);
        }else
            System.out.println("Sorry , you DONT have enough balance");
        return 0;
    }

    @Override
    public String toString() {
        return "\nSaving"+super.toString();
    }
    
    
}
