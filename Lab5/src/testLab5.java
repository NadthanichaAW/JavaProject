
import java.util.Scanner;

//import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class testLab5 {
    public static void main(String[] args) 
    {
        int date , elapsed , fDate ;
        String dayWeek = "";
        Scanner importDay = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        date = importDay.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        elapsed = importDay.nextInt();
        
        fDate = (date + elapsed)%7;
        switch(date)
        {
            case 0 : dayWeek = "Sunday";
            break;
            case 1 : dayWeek = "Monday";
            break;
            case 2 : dayWeek = "Tuesday";
            break;
            case 3 : dayWeek = "Wednesday";
            break;
            case 4 : dayWeek = "Thursday";
            break;
            case 5 : dayWeek = "Friday";
            break;
            case 6 : dayWeek = "Saturday";
            break;
        }
        
        if(fDate == 0)
        {
            System.out.printf("Today is %s and the future day is Sunday",dayWeek);
        }
        else if(fDate == 1)
        {
            System.out.printf("Today is %s and the future day is Monday",dayWeek);
        }
        else if(fDate == 2)
        {
            System.out.printf("Today is %s and the future day is Tuesday",dayWeek);
        }
        else if(fDate == 3)
        {
            System.out.printf("Today is %s and the future day is Wednesday",dayWeek);
        }
        else if(fDate == 4)
        {
            System.out.printf("Today is %s and the future day is Thursday",dayWeek);
        }
        else if(fDate == 5)
        {
            System.out.printf("Today is %s and the future day is Friday",dayWeek);
        }
        else if(fDate == 6)
        {
            System.out.printf("Today is %s and the future day is Saturday",dayWeek);
        }       
    }
}
