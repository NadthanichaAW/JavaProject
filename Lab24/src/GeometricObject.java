/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
abstract  class GeometricObject implements Cloneable
{
    private String color;
    private double weight;
    
    
    //Abstract
    abstract double getArea();
    abstract  double getPerimeter();
    
    public GeometricObject() 
    {
        
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean equal(GeometricObject obj)
    {
        return this.getArea()==obj.getArea();
    }
    
    public static int max(GeometricObject o1,GeometricObject o2)
    {
        if(o1.getArea()>o2.getArea())
            return 1;
        else if(o1.getArea()<o2.getArea())
            return 2;
        else
            return 3;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
     
}
