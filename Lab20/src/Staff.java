
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
public class Staff extends Employee{
    private String title;

    public Staff() 
    {
        
    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String title, String office, double salary, Date datehired) {
        super(office, salary, datehired);
        this.title = title;
    }

    public Staff(String title, String office, double salary, Date datehired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, datehired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" + "title=" + title + '}';
    }
    
    
}
