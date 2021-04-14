
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
public class lab24 {
    public static void main(String[] args) throws CloneNotSupportedException {        
        Scanner inputNum = new Scanner(System.in);
       
        
        System.out.print("Menu (1=Circle, 2=Rectangle, 3=Triangle, 4=Exit) : ");
        int menu = inputNum.nextInt();
        
        if(menu==1)
        {
            System.out.print("Circle c1 (radius color weight): ");
            double r1 = inputNum.nextDouble();
            String c1 = inputNum.next();
            double w1 = inputNum.nextDouble();
            Circle circle1 = new Circle(r1,c1,w1);
            System.out.print("Circle c2 (radius color weight): ");
            double r2 = inputNum.nextDouble();
            String c2 = inputNum.next();
            double w2 = inputNum.nextDouble();
            Circle circle2 = new Circle(r2,c2,w2);
            
            System.out.print("\n3.1 Find the larger object using max method : ");
            String cir1 = inputNum.next();
            String cir2 = inputNum.next();
            switch(Circle.max(circle1, circle2))
            {
                case 1 -> System.out.println("Answer: c1");
                case 2 -> System.out.println("Answer: c2");
                default -> System.out.println("Answer: EQUAL");           
            }
            
            System.out.print("\nCloning Circle c3 by using : ");
            String clone1 = inputNum.next();
            Circle c3; 
            if(clone1.contains("c1"))
            {
                c3 = (Circle)circle1.clone();
                System.out.printf("%s==c3 is : %b \n",clone1,circle1==c3);
                System.out.println(clone1+".equals(c3)is "+circle1.equal(c3));
            }
            else 
            {
                c3 = (Circle)circle2.clone();
                System.out.printf("%s==c3 is : %b \n",clone1,circle2==c3);
                System.out.println(clone1+".equals(c3)is "+circle2.equal(c3));
            }
            System.out.print("\n3.2 Find the larger of 2 instances of comparable objects : ");
            String cir3 = inputNum.next();
            String cir4 = inputNum.next();
           
            if((cir3.contains("c1")&&cir4.contains("c3"))||(cir3.contains("c3")&&cir4.contains("c1")))
            {
                switch(Circle.max(circle1, c3))
                {
                    case 1 -> System.out.println("Answer: c1");
                    case 2 -> System.out.println("Answer: c3");
                    default -> System.out.println("Answer: EQUAL");           
                }           
            }
            else
            {
                switch(Circle.max(circle2, c3))
                    {
                        case 1 -> System.out.println("Answer: c2");
                        case 2 -> System.out.println("Answer: c3");
                        default -> System.out.println("Answer: EQUAL");           
                    }
            }
            System.out.println("------------------------------");
        }
        else if(menu==2)
        {
            System.out.print("Rectangle r1 (width height color weight) : ");
            double x1 = inputNum.nextDouble();
            double y1 = inputNum.nextDouble();
            String c1 = inputNum.next();
            double w1 = inputNum.nextDouble();
            Rectangle rectangle1 = new Rectangle(x1, y1, c1, w1);
            System.out.print("Rectangle r2 (width height color weight) : ");
            double x2 = inputNum.nextDouble();
            double y2 = inputNum.nextDouble();
            String c2 = inputNum.next();
            double w2 = inputNum.nextDouble();
            Rectangle rectangle2 = new Rectangle(x2, y2, c2, w2);
            
            System.out.print("\n3.1 Find the larger object using max method : ");
            String rec1 = inputNum.next();
            String rec2 = inputNum.next();
            switch(Rectangle.max(rectangle1, rectangle2))
            {
                case 1 -> System.out.println("Answer: r1");
                case 2 -> System.out.println("Answer: r2");
                default -> System.out.println("Answer: EQUAL");           
            }
            
            System.out.print("\nCloning Rectangle r3 by using : ");
            String clone1 = inputNum.next();
           Rectangle r3;
            if(clone1.contains("r1"))
            {
                r3 = (Rectangle)rectangle1.clone();
                System.out.printf("%s==r3 is : %b \n",clone1,rectangle1==r3);
                System.out.println(clone1+".equals(r3)is "+rectangle1.equal(r3));
            }
            else 
            {
                r3 = (Rectangle)rectangle2.clone();
                System.out.printf("%s==r3 is : %b \n",clone1,rectangle2==r3);
                System.out.println(clone1+".equals(r3)is "+rectangle2.equal(r3));
            }
            System.out.print("\n3.2 Find the larger of 2 instances of comparable objects : ");
            String rec3 = inputNum.next();
            String rec4 = inputNum.next();
           
            if((rec3.contains("r1")&&rec4.contains("r3"))||(rec3.contains("r3")&&rec4.contains("r1")))
            {
                switch(Circle.max(rectangle1, r3))
                {
                    case 1 -> System.out.println("Answer: r1");
                    case 2 -> System.out.println("Answer: r3");
                    default -> System.out.println("Answer: EQUAL");           
                }           
            }
            else
            {
                switch(Circle.max(rectangle2, r3))
                    {
                        case 1 -> System.out.println("Answer: r2");
                        case 2 -> System.out.println("Answer: r3");
                        default -> System.out.println("Answer: EQUAL");           
                    }
            }
            System.out.println("------------------------------");
        }
        else if(menu==3)
        {
            System.out.print("Triangle t1 (x y z color weight) : ");
            double x1 = inputNum.nextDouble();
            double y1 = inputNum.nextDouble();
            double z1 = inputNum.nextDouble();
            String c1 = inputNum.next();
            double w1 = inputNum.nextDouble();
            Triangle triangle1 = new Triangle(x1, y1, z1, c1, w1);
            System.out.print("Triangle t2 (x y z color weight) : ");
            double x2 = inputNum.nextDouble();
            double y2 = inputNum.nextDouble();
            double z2 = inputNum.nextDouble();
            String c2 = inputNum.next();
            double w2 = inputNum.nextDouble();
            Triangle triangle2 = new Triangle(x2, y2, z2, c2, w2);
            
            System.out.print("\n3.1 Find the larger object using max method : ");
            String tri1 = inputNum.next();
            String tri2 = inputNum.next();
            switch(Triangle.max(triangle1, triangle2))
            {
                case 1 -> System.out.println("Answer: t1");
                case 2 -> System.out.println("Answer: t2");
                default -> System.out.println("Answer: EQUAL");           
            }
            
            System.out.print("\nCloning Triangle t3 by using : ");
            String clone1 = inputNum.next();
           Triangle t3;
            if(clone1.contains("t1"))
            {
                t3 = (Triangle)triangle1.clone();
                System.out.printf("%s==c3 is : %b \n",clone1,triangle1==t3);
                System.out.println(clone1+".equals(c3)is "+triangle1.equal(t3));
            }
            else 
            {
                t3 = (Triangle)triangle2.clone();
                System.out.printf("%s==c3 is : %b \n",clone1,triangle2==t3);
                System.out.println(clone1+".equals(c3)is "+triangle2.equal(t3));
            }
            System.out.print("\n3.2 Find the larger of 2 instances of comparable objects : ");
            String tri3 = inputNum.next();
            String tri4 = inputNum.next();
           
            if((tri3.contains("t1")&&tri4.contains("t3"))||(tri3.contains("t3")&&tri4.contains("t1")))
            {
                switch(Circle.max(triangle1, t3))
                {
                    case 1 -> System.out.println("Answer: t1");
                    case 2 -> System.out.println("Answer: t3");
                    default -> System.out.println("Answer: EQUAL");           
                }           
            }
            else
            {
                switch(Circle.max(triangle2, t3))
                    {
                        case 1 -> System.out.println("Answer: t2");
                        case 2 -> System.out.println("Answer: t3");
                        default -> System.out.println("Answer: EQUAL");           
                    }
            }
            System.out.println("------------------------------");
        }
        else if(menu==4)
        {
            System.out.println("End of Program.");
        }

    }
}
