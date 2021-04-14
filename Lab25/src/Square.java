/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Square extends GeometricObject{    
    public Square() {
    }
 
    public Square(double area) {
        super(area);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    
}
