/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class LabExam {
    public static void main(String[] args) {
        Circle[] cArray = new Circle[5];//before slot jub jong 
        //cArray[0] = new Circle(2);
        for(int i = 0;i <cArray.lenght;i++)//assign after
        {
            cArray[i] = new Circle(i);
        }
        Circle[]cArray2 = (new Circle(2),new Circle(20))//make object no name 
        System.out.println(cArray[0].getRadius());
    }
    
}
