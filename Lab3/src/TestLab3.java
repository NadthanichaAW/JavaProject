
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
public class TestLab3 {
    public static void main(String[] args) 
    {
        int sum,num;
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        num = inputNum.nextInt();
        if(num>=0 && num<=999 )
        {
            sum = (num/100)+((num/10)%10)+(num%10);
            System.out.println("The sum of the digit is "+sum);
        }
        else
            System.out.println("Plz input a number between 0 and 1000");
        
    }    
}
