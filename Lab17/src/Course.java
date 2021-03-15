import java.util.Arrays;
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
public class Course {
    private String name;
    private String listName[] = new String[0];   
   
    public Course(String name) 
    {
        this.name = name;
    }
   
    public int getNumberOfStudent()
    {
        return listName.length;
    }
    public String getName() 
    {
        return name;
    }
    public void addStudent(String nameStudeant)
    {
        String updateListName[] = new String[listName.length + 1];
        for(int i = 0;i<listName.length;i++)
        {
            updateListName[i] = listName[i];
        }
        updateListName[listName.length] = nameStudeant;
        listName = updateListName;
        listName[listName.length-1] = nameStudeant;       
    }
    public void displayListStudent()
    {
        System.out.println("\nList Student");
        System.out.println("Course : "+name);
        System.out.print("member : ");
        if(listName.length>0)
        {
            for(int i =0;i<listName.length;i++)
            {
                System.out.print(listName[i]);
                if(i<listName.length-1)
                {
                    System.out.print(", ");
                }
            }
        }else
        {
            System.out.print("no student in this course");            
        }
        System.out.print("\n\n");
    }
    public void dropStudent(String nameStudent)
    {
        int index = Arrays.binarySearch(listName, nameStudent);
        
        if(index != -1)
        {
            String updateListName[] = new String[listName.length-1];
            for(int i = 0;i< index;i++)
            {
                 updateListName[i] = listName[i];
            }
            for (int i = index; i < updateListName.length; i++) 
            {
                updateListName[i] = listName[i + 1];
            }
            Arrays.copyOf(listName,updateListName.length);
            listName = updateListName;
        }else
        {
            System.out.println("name: "+nameStudent+" is not member in the Course: "+name);
        }
    }
    public void clear()
    {
        String updateListName[] = new String[0];
        listName = updateListName;
        System.out.println("Course "+name+" is remove all student");
    }

 
}
