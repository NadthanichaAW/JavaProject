
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
public class lab20 {
    public static void main(String[] args) {
        Scanner inputInfor = new Scanner(System.in);      
        Student student = new Student();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();
        
        System.out.print("Name: ");
        String name = inputInfor.nextLine();
        staff.setName(name);               
        System.out.print("Address: ");
        String address = inputInfor.nextLine();
        staff.setAddress(address);       
        System.out.print("Phone: ");
        String phone = inputInfor.nextLine();
        staff.setPhoneNumber(phone);       
        System.out.print("Email: ");
        String email = inputInfor.nextLine();
        staff.setEmailAddress(email);        
        System.out.print("Status: ");
        int status = inputInfor.nextInt();
        student.setStatus(status);       
        System.out.print("Office: ");
        String office = inputInfor.next();
        staff.setOffice(office);        
        System.out.print("Salary: ");
        double salary = inputInfor.nextDouble();
        staff.setSalary(salary);        
        System.out.print("Office Hours: ");
        String officeHours = inputInfor.next();
        faculty.setOfficeHours(officeHours);       
        System.out.print("Rank: ");
        String rank = inputInfor.next();
        faculty.setRank(rank);        
        System.out.print("Title: ");
        String title = inputInfor.next();
        staff.setTitle(title);
        
       // Staff staff = new Staff(title,office,salary,datehired,name,ddress,phoneNumber, emailAddress);
        System.out.println(staff.toString());
        
       
    }
    
}
