/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Student extends Person{
    private int status;
    public final static int Freshman = 1;
    public final static int Sophomore = 2;
    public final static int Junior = 3;
    public final static int Senior = 4;

    public Student() 
    {
        
    }

    public Student(int status) {
        this.status = status;
    }

    public Student(int status, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() 
    {
        switch(status)
        {
            case 1 : return "Freshman" ; 
            case 2 : return "Sophomore";
            case 3 : return "Junior";
            case 4 : return "Senior";
            default : return "Unknow";
        }                 
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" + "status=" + status + '}';
    }

    
   
    
    
}
