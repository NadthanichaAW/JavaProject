/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class lab23 {
    public static void main(String[] args) {
        Geometric[] geometric = {new Circle(1.0),new Circle(1.0),new Triangle(1, 1, 1),new Rectangle(1, 1),new Rectangle(1, 1)};
    
        System.out.printf("Total Area: %.2f",sumArea(geometric));
      
    }
public static double sumArea(Geometric[] geometric)
{
  double total = 0;
  
  for(int i =0;i<geometric.length;i++)
  {
      total += geometric[i].getArea();
  }
  return total;
}
}
