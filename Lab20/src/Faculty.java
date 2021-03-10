
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
public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty() 
    {
      
    }

    public Faculty(String officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String officeHours, String rank, String office, double salary, Date datehired) {
        super(office, salary, datehired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String officeHours, String rank, String office, double salary, Date datehired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, datehired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"Faculty{" + "officeHours=" + officeHours + ", rank=" + rank + '}';
    }
    
    
    
}
