
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
public class Ex2 {
    public static void main(String[] args){
       double first, two ,swap;
       
       Scanner swip = new Scanner(System.in);
        System.out.println("Before swap");
        System.out.print("First number : ");
        first = swip.nextDouble();
        System.out.print("Second number : ");
        two = swip.nextDouble();
        swap = first;
        first = two;
        two = swap;
        
        System.out.println("After swap");
        System.out.println("First number : "+first);
        System.out.println("Second number : "+two);
        
        
    }
}
