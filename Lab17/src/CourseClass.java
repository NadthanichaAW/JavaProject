

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class CourseClass {
    public static void main(String[] args) {       
        Course course[] = new Course[10];
        
        course[0] = new Course("oop");
        course[0].addStudent("graceeieiza");
        course[0].addStudent("romram");
        course[0].addStudent("khimja");
        System.out.println();
        
        course[0].displayListStudent();          
        course[0].dropStudent("romram");
        course[0].displayListStudent();
        course[0].clear();
        course[0].displayListStudent();     
    }
    
}
