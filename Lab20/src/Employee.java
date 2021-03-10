
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Employee extends Person{
    private String office;
    private double salary;
    private java.util.Date datehired;

    public Employee() 
    {
         datehired = new java.util.Date();
    }

    public Employee(String office, double salary, Date datehired) {
        this.office = office;
        this.salary = salary;
        this.datehired = datehired;
    }

    public Employee(String office, double salary, Date datehired, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.datehired = datehired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDatehired() {
        return datehired;
    }

    public void setDatehired(Date datehired) {
        this.datehired = datehired;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" + "office=" + office + ", salary=" + salary + ", datehired=" + datehired + '}';
    }

    
    
}
