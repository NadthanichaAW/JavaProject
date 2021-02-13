import java.util.GregorianCalendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class lab13 {
    public static void main(String[] args) 
    {
         GregorianCalendar calender = new GregorianCalendar();
         
         System.out.println("Current year, month, date, and day of week");
         System.out.println("Year is "+calender.get(GregorianCalendar.YEAR));
         System.out.println("Month is "+calender.get(GregorianCalendar.MONTH));
         System.out.println("Date is "+calender.get(GregorianCalendar.DATE));
         System.out.println("Day of week is "+calender.get(GregorianCalendar.DAY_OF_WEEK));
         calender.setTimeInMillis(calender.getTimeInMillis() + 86400000); //time in 1 day 60*60 change millisecond       
        
         System.out.println("------------");         
         System.out.println("After specified the elapsed time of one day after current day"); 
         System.out.println("Year is "+calender.get(GregorianCalendar.YEAR));
         System.out.println("Month is "+calender.get(GregorianCalendar.MONTH));
         System.out.println("Date is "+calender.get(GregorianCalendar.DATE));
         System.out.println("Day of week is "+calender.get(GregorianCalendar.DAY_OF_WEEK));
         System.out.print(calender.getTime());
    }
}
