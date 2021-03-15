
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
public class lab19 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        ObjectOfAccount account = new ObjectOfAccount(5000, 1122);
        CheckingAccount checking = new CheckingAccount(5000, 5000, 1122);
        SavingAccount saving = new SavingAccount(5000, 1122);
       
        System.out.println(account.toString());
        System.out.print("Choose CheckingAccount(0) or SavingAccount(1) : ");
        int choose = inputNum.nextInt();
        if(choose==0)
        {
            System.out.print("Choose Deposit(0) or Withdraw(1): ");
            int choose2 = inputNum.nextInt();
            if(choose2==0)
            {
                System.out.print("Deposit: ");
                double deposit = inputNum.nextDouble();
                checking.deposit(deposit);
                System.out.println(checking.toString());
            }
            else if(choose2==1)
            {               
                System.out.print("Withdraw: ");
                double withdraw = inputNum.nextDouble();
                checking.withdraw(withdraw);
                System.out.println(checking.toString());
            }
            else
            {
                System.out.print("Error");
            }
        }
        else if(choose==1)
        {
            System.out.print("Choose Deposit(0) or Withdraw(1): ");
            int choose2 = inputNum.nextInt();
            if(choose2==0)
            {
                System.out.print("Deposit: ");
                double deposit = inputNum.nextDouble();
                saving.deposit(deposit);
                System.out.println(saving.toString());
            }
            else if(choose2==1)
            {               
                System.out.print("Withdraw: ");
                double withdraw = inputNum.nextDouble();
                saving.withdraw(withdraw);
                System.out.println(saving.toString());
            }
            else
            {
                System.out.print("Error");
            }
        }
        else
        {
            System.out.print("Error");
        }

    }
}
