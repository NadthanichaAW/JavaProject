/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class lab25 {
    public static void main(String[] args) {
        GeometricObject geometricObject[] = new GeometricObject[5];
    
    for(int i = 0;i<5;i++)
    {
        geometricObject[i] = new Square((i+5)*100);
    }
    for(int i =0;i<5;i++)
    {
        System.out.println("Area : "+ geometricObject[i].getArea()+"\nColor: ");      
        geometricObject[i].howToColor();    
        }    
    }
}
