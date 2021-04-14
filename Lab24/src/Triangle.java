/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Triangle extends GeometricObject{

    private double x;
    private double y;
    private double z;    
    private double s;
    
    public Triangle() {
    }

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        s = (this.x+this.y+this.z)/2;
    }

    public Triangle(double x, double y, double z, String color, double weight) {
        super(color, weight);
        this.x = x;
        this.y = y;
        this.z = z;
        s = (this.x+this.y+this.z)/2;
    }

    @Override
    double getArea() {
        return Math.sqrt(s*(s-x)*(s-y)*(s-z));
    }

    @Override
    double getPerimeter() {
        return x+y+z;
    }

}
