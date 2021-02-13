
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
public class lab12 {
    public static void main(String[] args) 
    {
        Stock stock = new Stock("ORCL","Oracle Coperation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println("Symbol : "+stock.symbol);
        System.out.println("Name : "+stock.name);
        System.out.println("Previous Closing Price: "+stock.previousClosingPrice);
        System.out.println("Current Price: "+stock.currentPrice);
        System.out.println("Price Change: "+stock.getChangePercent());           
    }   
}
class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    Stock(String newSymbol,String newName)//constructor
    {
        symbol = newSymbol;
        name = newName;
    }
    double getChangePercent()//method
    {
      return((currentPrice - previousClosingPrice)/previousClosingPrice)*100;   
    }    
}