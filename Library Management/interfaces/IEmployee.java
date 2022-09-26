package interfaces;
import java.lang.*;
import classes.*;
public interface IEmployee
{
	boolean insertEmployee(Employee e);
	boolean removeEmployee(Employee e);
	Employee searchEmployee(String employeeId);
	void showAllEmployeesInfo();	
}