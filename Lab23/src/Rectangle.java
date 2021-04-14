/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Rectangle extends Geometric{
    private double x;
    private double y;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x, double y, String color, boolean filled) {
        super(color, filled);
        this.x = x;
        this.y = y;
    }

    @Override
    double getArea() {
        return x*y;
    }

    @Override
    double getPerimeter() {
        return (x*2)+(y*2);
    }
    
    
    
}
