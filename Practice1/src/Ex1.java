
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
public class Ex1 {
    public static void main(String[] args){
        String ch = " ";
        int charLenght = ch.length(); //count lenght of string
         
       Scanner reader = new Scanner(System.in);
       System.out.print("Enter your char : ");   
       ch = reader.next();//input kha kao ma save
       for(int i=0 ; i < charLenght;i++)//while counting characters if less than the length add one
       {
           char ch2 = ch.charAt(i); //start at the char first
           int ascii = (int)ch2; //change char ch2 to int 
           System.out.println(ch2+" in Ascii is "+ascii);
       }          
    }
}
