
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
public class testLab7ch3 {
    public static void main(String[] args) 
    {
        System.out.print("Enter year: (e.g.,2012): ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        System.out.print("Enter month: 1-12: ");
        input = new Scanner(System.in);
        int month = input.nextInt();
        if (month == 1 ||month == 2)
            { 
               month =(month==1)?13:14;
                year--;
            }

        System.out.print("Enter the day of the month: 1-31: ");
        input = new Scanner(System.in);
        int date = input.nextInt();

        int h = 0;
        h = (date + (26*(month + 1) / 10) + (year%100) + ((year%100)/4) + (year/100)/4 + ((year/100)*5))%7;
        switch (h)
        {
            case 0 : System.out.println("Day of the week is Saturday"); 
                     break;
            case 1 : System.out.println("Day of the week is Sunday"); 
                     break;
            case 2 : System.out.println("Day of the week is Monday"); 
                     break;
            case 3 : System.out.println("Day of the week is Tuesday"); 
                     break;
            case 4 : System.out.println("Day of the week is Wednesday"); 
                     break;
            case 5 : System.out.println("Day of the week is Thursday"); 
                     break;
            case 6 : System.out.println("Day of the week is Friday"); 
                     break;
        }
     }    
}
