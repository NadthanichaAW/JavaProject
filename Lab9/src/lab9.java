import java.lang.Math;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class lab9 {      
    public static boolean checkPalin(int x)
    {
        String s = Integer.toString(x);
        for(int i = 0 ; i<s.length()/2;i++)
        {
            if(s.charAt(i)!= s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean checkPrime(int x)
    {
        if(x%2==0 && x!=2)
        {
            return false;
        }
        int  rand = (int)Math.sqrt(x);
        for(int i = 3;i <= rand;i +=2)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
      public static void main(String[] args) 
    {
        int count = 0;
        int start = 2;
        
        while(count < 100)
        {
            if(checkPrime(start) && checkPalin(start))
            {
                System.out.print(start + " ");
                count++;
                if(count % 10 == 0 )
                {
                    System.out.println();                           
                }
            }
            start++;
        }
    }
}
