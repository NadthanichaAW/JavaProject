
import java.util.HashSet;
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
public class Testquice_1 {
    public static void main(String[] args) 
    {
        Scanner inputNum = new Scanner(System.in);
             
        int[] numberS = {1,2,3,4,5,6,7,8,9};                       
        HashSet<Integer> num = new HashSet<>();             
        int[] array = new int[9];
        System.out.print("Select 5 numbers from the list : ");
        for(int i =0;i<5;i++)
        {
            array[i] = inputNum.nextInt();           
        }               
        for(int i = numberS[0];i <= numberS[numberS.length-1];i++)
        {
            num.add(i);            
        }
        for(int i = 0 ;i<numberS.length;i++)
        {
            num.remove(array[i]);
        }
        System.out.print("Number non in the list are : ");
        for(int x : num)
        {
            System.out.print(" "+x);
        }        
    }
}
