/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Student {
    private String name;
    private int id;
    Course[] courseList = new Course[8];
    int index;
    
    public Student(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    public void addCourse(Course c)
    {
        courseList[index] = c;
        index++;
    }
    public Course[] getCourse()
    {
        return courseList;
    }
    
}
