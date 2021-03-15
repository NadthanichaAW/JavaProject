
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class lab16 {
    public static void main(String[] args) {
        String name = null;
        int age = 0; 
        double weight = 0;
        double feet = 0;
        double inches = 0;
        Scanner inputData = new Scanner(System.in);
           
        System.out.print("Enter name : ");
        name = inputData.nextLine();
        System.out.print("Enter age : ");
        age = inputData.nextInt();
        System.out.print("Enter weight in pounds : ");
        weight = inputData.nextDouble();
        System.out.print("Enter height in feet : ");
        feet = inputData.nextDouble();
        System.out.print("Enter height in inches : ");
        inches = inputData.nextDouble();
         
        Bmi bmi = new Bmi(name,age,weight,feet,inches);   
        System.out.println("Bmi : "+bmi.getBMI());
        System.out.println("Interpretation : "+bmi.getInterpretation());
    }
    
}

class Bmi
{
    private String name;
    private int age;
    private double weight; //pond
    private double height; //inches 
    private double feet;
    private double inches;
      
    public Bmi(String name, int age, double weight, double feet, double inches)
    {
        this.name = name;
        this.age = age;
        this.weight = weight*0.45359237;
        this.feet = feet*0.3048;
        this.inches = inches*0.0254;
        this.height = this.inches + this.feet;    
    }   
    double getBMI()
    {      
        return this.weight/(this.height*this.height);      
    }
    String getInterpretation()
    {
        double bmi = getBMI();
        if(bmi < 18.5)
        {
            return "Underweight";
        }
        else if(bmi>=18.5 && bmi < 25.0)
        {
            return "Normal";
        }
        else if(bmi >= 25.0 && bmi < 30.0)
        {
            return "Overweight";
        }
        else
            return "Obese";
    }    
}