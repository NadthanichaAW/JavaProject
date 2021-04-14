/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
abstract class Geometric {
   String color;
   boolean filled;
   
   //Abstract
   abstract double getArea();
   abstract double getPerimeter();

    public Geometric() {
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
       
}
