/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Triangle extends GeometricObject{

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

    public Triangle(double x, double y, double z, String color, boolean filled) {
        super(color, filled);
        this.x = x;
        this.y = y;
        this.z = z;
        s = (this.x+this.y+this.z)/2;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
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
