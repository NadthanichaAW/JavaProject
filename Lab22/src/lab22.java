
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
public class lab22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle(); 
        System.out.print("Input X side: ");
        double x = input.nextDouble();
        
        System.out.print("Input Y side: ");
        double y = input.nextDouble();
      
        System.out.print("Input Z side: ");
        double z = input.nextDouble();
           
        System.out.print("Want to filled color ?: ");
        boolean filled = input.nextBoolean();
        
        
        double s = (x+y+z)/2;
        if(((s-x)*(s-y)*(s-z))>0)
        {
            if(filled==false)
            {   
                Triangle triangle1 = new Triangle(x, y, z);        
                System.out.println("Area: "+triangle1.getArea());
                System.out.println("Perimeter: "+triangle1.getPerimeter());         
                       
            }
            else
            {
                Triangle triangle1 = new Triangle(x, y, z); 
                System.out.print("Color you want to filled: ");
                String fillColor = input.next();
                triangle.setColor(fillColor);
                System.out.println("Area: "+triangle1.getArea());
                System.out.println("Perimeter: "+triangle1.getPerimeter());
                System.out.println("Color: "+triangle.getColor());     
                              
            }
        }else
        {
            System.out.println("Error input side again");
        }
        

        
        
        
        
        
    }
}
