
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
public class testLab8 {

    public static void main(String[] args) {
        int row = 0, m = 0, lenght1 = 0, lenght2 = 0;
        int i, j;
        Scanner importRow = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        row = importRow.nextInt();

        if(row > 1 )
        {           
        for (i = 1; i <= row; i++) 
        {
            for (j = 1; j <= row - i; j++) 
            {
                System.out.print("  ");
                lenght1++;
            }
            while (m != 2 * i - 1) 
            {
                if(lenght1 <= row-1)
                {
                    System.out.print((i-m)+" ");
                    lenght1++;
                }else
                {
                    lenght2++;
                    System.out.print((i-m+2*lenght2)+" ");
                }
                m++;
            }
            lenght2 = lenght1 = m = 0 ;
            System.out.println(" ");
        }
        }else
        {
            System.out.println("Plz input lines > 1 ");
        }
    }
}
