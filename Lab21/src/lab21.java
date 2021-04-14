/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class lab21 {
    public static void main(String[] args) {
        Account account = new Account("Khim", 2000, 1122);
        account.setAnnualInterestRate(1.5);
        
        // Deposit $30, $40, and $50 to the account
	account.deposit(30);
	account.deposit(40);
	account.deposit(50);

	// withdraw $5, $4, and $2 from the account
	account.withdraw(5);
	account.withdraw(4);
	account.withdraw(2);
        
        
        System.out.println("Name: "+account.getName());
        System.out.println("Account ID: "+account.getId());        
	System.out.println("Annual interest rate: " + account.getAnnualInterestRate());
	System.out.println("Balance: "+account.getBalance());	
	System.out.print("\nDate");
        System.out.print("\t\t\t\t\tType ");
        System.out.print("\t\tAmount ");
        System.out.println("\t\tBalance ");
        for (int i = 0; i < account.getTransaction().size(); i++) 
        {          
            System.out.print((account.getTransaction()).get(i).getDateCreated());            
            System.out.print("\t\t"+(account.getTransaction()).get(i).getType());    
            System.out.print("\t\t"+(account.getTransaction()).get(i).getAmount());            
            System.out.print("\t\t"+(account.getTransaction()).get(i).getBalance());         
            System.out.println();
		
        }
        
    }
    
}
