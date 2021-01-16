
import java.util.Scanner; //import libery

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class TestClass {

    public static void main(String[] args) {//type psvm with press key tap 
        System.out.println("Hello Test"); //sout with press key tap
        double radius = 0.0;
        Scanner input = new Scanner(System.in); //input data from keybord,use Scanner class
        System.out.print("enter radius: ");
        radius = input.nextDouble();//object input use appropriate method with type of variable
        double area = 3.14159 * radius * radius;
        System.out.println("radius = " +radius+" area = "+area);

    }
}
