
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
public class testLab07 {
    public static void main(String[] args) {   
           String name1,name2,name3,swap;
        
        Scanner city = new Scanner(System.in);
        System.out.print("Enter the first city : ");
        name1 = city.nextLine();
        System.out.print("Enter the second city : ");
        name2 = city.nextLine();
        System.out.print("Enter the third city : ");
        name3 = city.nextLine();
        
        if((name2.compareTo(name1)<0) && (name2.compareTo(name3)<0))
        {
           //preab song tua rak 
            swap = name1;
            name1 = name2;
            name2 = swap;
        }else if((name3.compareTo(name1) < 0) && (name3.compareTo(name2)<0))
        {//preb tua rak kab tua sudthai
            swap = name1;
            name1 = name3;
            name3 = swap;                    
        }if(name3.compareTo(name2)<0)
        {
            //song tua lang
            swap = name2;
            name2 = name3;
            name3 = swap;                  
        }
        System.out.println("The three cities in alphabetical order are  "+name1+" "+name2+" " +name3);
    } 
}
