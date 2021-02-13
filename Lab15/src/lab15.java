
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
public class lab15 {
    public static void main(String[] args) 
    {   
        Scanner inputChoice = new Scanner(System.in);
        System.out.println("Three RegularPolygon object :");
        System.out.println("(1) no-arg");
        System.out.println("(2) RegularPolygon(n,side) ");
        System.out.println("(3) RegularPolygon(n,side,x,y)");
        System.out.print("Your choice : ");
        int choice = inputChoice.nextInt();
        
        if(choice <= 3 && choice > 0)
        {
        if(choice==1)
        {
             RegularPolygon regularPolygon = new RegularPolygon();
            System.out.println("Perimetor : "+regularPolygon.getPerimeter());
            System.out.println("Area : "+regularPolygon.getArea());
        }
        if(choice==2)
        {
            System.out.print("Input number of side : ");
            int n = inputChoice.nextInt();
            System.out.print("Input side : ");
            double side = inputChoice.nextDouble();
            RegularPolygon regularPolygon = new RegularPolygon(n,side);
            System.out.println("Perimetor : "+regularPolygon.getPerimeter());
            System.out.println("Area : "+regularPolygon.getArea());         
        }
        if(choice==3)
        {
            System.out.print("Input number of side : ");
            int n = inputChoice.nextInt();
            System.out.print("Input side : ");
            double side = inputChoice.nextDouble();
            System.out.print("Input x : ");
            double x = inputChoice.nextDouble();
            System.out.print("Input y : ");
            double y = inputChoice.nextDouble();
            RegularPolygon regularPolygon = new RegularPolygon(n,side,x,y);
            System.out.println("Perimetor : "+regularPolygon.getPerimeter());
            System.out.println("Area : "+regularPolygon.getArea());         
        }       
        }else
            System.out.println("Error input again");
    }
    
}
class RegularPolygon
{
    private int n = 3; // number of side
    private double side = 1.0;
    private double x = 0.0;
    private double y = 0.0;
    
    RegularPolygon()
    {
        
    }
    RegularPolygon(int n,double side)
    {
        this.n = n;
        this.side = side;
        x = y = 0;
    }
    RegularPolygon(int n,double side,double x,double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    //Accessor
    public int getN() 
    {
        return n;
    }
    public double getSide() 
    {
        return side;
    } 
    public double getX() 
    {
        return x;
    }
    public double getY() 
    {
        return y;
    }    
    //mutator
    public int setN(int n) 
    {
        return this.n = n;
    }
    public double setSide(double side) 
    {
        return this.side = side;
    }
    public double setX(double x) 
    {
        return this.x = x;
    }
    public double setY(double y) 
    {
        return this.y = y;
    }   
    //method
    double getPerimeter()
    {
        return this.n * this.side;
    }
    double getArea()
    {
        return (this.n * Math.pow(this.side, 2))/(4*Math.tan(Math.PI/this.n));
    }
    
}