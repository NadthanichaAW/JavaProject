/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class testLab4 {
    public static void main(String[] args) {
        double w,h;
        Scanner inputW = new Scanner(System.in);
        System.out.print("Enter weight : ");
        w = inputW.nextDouble();
        w = w*0.45359237;
        Scanner inputH = new Scanner(System.in);
        System.out.print("Enter height : ");
        h = inputH.nextDouble();
        h = h*0.0254;
        double BMI = w/(h*h);
        System.out.printf("BMI is %.4f",BMI);
    }
    
}
