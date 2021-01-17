
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
public class TestLab2 {

    public static void main(String[] args) {
        double a, b, e, c, d, f;
        double x = 0.0,y = 0.0;           
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = inputA.nextDouble();
        Scanner inputB = new Scanner(System.in);
        System.out.print("Enter b : ");
        b = inputB.nextDouble();
        Scanner inputC = new Scanner(System.in);
        System.out.print("Enter c : ");
        c = inputC.nextDouble();
        Scanner inputD = new Scanner(System.in);
        System.out.print("Enter d : ");
        d = inputD.nextDouble();
        Scanner inputE = new Scanner(System.in);
        System.out.print("Enter e : ");
        e = inputE.nextDouble();
        Scanner inputF = new Scanner(System.in);
        System.out.print("Enter f : ");
        f = inputF.nextDouble();
        System.out.println(a+"x"+"+"+b+"y = "+e);
        System.out.println(c+"x"+"+"+d+"y = "+f);
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("x = "+x+" and y = "+y);
        
    }

}
