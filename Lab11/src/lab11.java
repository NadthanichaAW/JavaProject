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
public class lab11 {
    public static void main(String[] args) 
    {
        int col = 0,row = 0,major = 0,sub = 0,sup = 0;
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = inputNum.nextInt();
        int[][] metrix = new int[size][size];
        
             
        if(size > 1 )
        {
            generateMetrix(metrix);
            displayMetrix(metrix);
        for(int k = 0; k <2;k++)
        {
            for(int i = 0;i < metrix.length;i++)
            {
                if(rowSequen(metrix,k,i))
                {
                    System.out.println("All "+k+" s on row "+i);
                    row++;
                }
            }
        }
        for(int k = 0;k<2;k++)
        {
            for(int i =0;i<metrix.length;i++)
            {
                if(colSequen(metrix,k,i))
                {
                    System.out.println("All "+k+" s on column "+i);
                    col++;
                }
            }
        }
        for(int i = 0;i<metrix.length;i++)
        {
            if(majorDia(metrix, i))
            {
                System.out.println("All "+i+" s on Major diagonal");
                major++;
            }
        }
        for(int i = 0;i<metrix.length;i++)
        {
            if(subDia(metrix,i))
            {
                System.out.println("All "+i+" s on the sub-diagonal");
                sub++;
            }
        }
        for(int i = 0 ;i<metrix.length;i++)
        {
            if(superDia(metrix,i))
            {
                System.out.println("All "+i+" s on the superdiagonal");
                sup++;
            }
        }
        if(col==0)
        {
            System.out.println("No same numbers on a column");
        }
        if(row==0)
        {
             System.out.println("No same numbers on a row");
        }
        if(major==0)
        {
            System.out.println("No same numbers on the major diagonal");
        }
        if(sub==0)
        {
            System.out.println("No same numbers on the sub-diagonal");
        }
       if(sup==0)
       {
           System.out.println("No same numbers on the superdiagonal");
       }
        }
        else
            System.out.println("Error");        
    }
    public static boolean rowSequen(int[][] metrix, int n, int row) {

        for (int k = 0; k < metrix[row].length; k++) 
        {
            if (metrix[row][k] != n) 
            {
                return false;
            }
        }
        return true;
    }
    public static boolean colSequen(int[][] metrix, int n, int col) {

        for (int i = 0; i < metrix.length; i++) 
        {
            if (metrix[i][col] != n) 
            {
                return false;
            }
        }
        return true;
    }  
    public static void displayMetrix(int[][] metrix)
    {
        System.out.println("");
        for(int i = 0;i < metrix.length;i++)
        {
            for(int j = 0;j < metrix[i].length; j++)
            {
                System.out.print(metrix[i][j]);
            }
            System.out.println("");
        }
    }
    public static void generateMetrix(int[][] metrix)
    {
        int count = 0;
        for(int i = 0 ;i < metrix.length;i++)
        {
            for(int j = 0 ;j < metrix[i].length; j++)
            {
                metrix[i][j] = (int)(Math.random()*2);
            }
        }
    }
    public static boolean majorDia(int[][] metrix,int n)
    {
        boolean topLeftDown = true; // top left to right
        for(int i = 0; i < metrix.length; i++)
        {
            if(metrix[i][i] != n )
            {
                topLeftDown = false;
            }
        }
        
        boolean bottomLeftDown = true;
        int k = 0 ;
        for(int i = metrix.length - 1; i >= 0 ;i--)
        {
            if(metrix[i][k++] != n)
            {
                bottomLeftDown = false;
            }
        }
        return topLeftDown || bottomLeftDown;
    }
    public static boolean subDia(int[][] metrix,int n)
    {
        //row i col j ; j = i-1
        for(int i = 1 ; i< metrix.length ; i++)
        {
            if(n != metrix[i][i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean superDia(int[][] metrix,int n)
    {
        //j = i+1
        for(int i = 0;i < metrix.length - 1;i++)
        {
            if(n != metrix[i][i+1])
            {
                return false;
            }
        }
        return true;
    }
}
