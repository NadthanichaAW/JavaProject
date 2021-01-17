/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class TestLab1 {
    public static void main(String[] args) {
        int second = 365*24*60*60;
        int cPop = 312032486;
        for(int i=1;i<=5;i++)
        {
            cPop += (second/7)-(second/13)+(second/45);
            System.out.println("Population in "+i+" year = "+cPop);
        }
    }
    
}
