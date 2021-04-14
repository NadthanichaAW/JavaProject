/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
abstract class GeometricObject implements Colorable{ 
    private double area;
    
    public double getArea()
    {
      return area;
    }   
    public GeometricObject() {
    }

    public GeometricObject(double area) {
        this.area = area;
    }

    @Override
    public abstract void howToColor(); 
    
   
}
