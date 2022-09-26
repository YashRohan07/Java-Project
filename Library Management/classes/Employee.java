package classes;
import java.util.*;
import java.lang.*;

public class Employee
{
	private String employeeId;
	private String employeename;
	private double salary;
	
	
	public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }

	public void setEmployeeName(String employeename){
        this.employeename = employeename;
    }

	public void setSalary(double salary){
        this.salary = salary;
    }
	
	public String getEmployeeId(){
        return employeeId;
    } 
	public String getEmployeeName(){
        return employeename;
    }
	public double getSalary(){
        return salary;
    } 

	
}