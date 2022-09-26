package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;

public class Library implements  IReader, IEmployee, IBook 
{
	private Reader readers[] = new Reader[500];
	private Employee employees[] = new Employee [100];
	private Book books[] = new Book[100];

	public boolean insertReader(Reader obj)
	{
		boolean count = false;
		for(int i=0; i<readers.length; i++)
		{
			if(readers[i] == null)
			{
				readers[i] = obj;
				count= true;
				break;
			}
		}
		return count;
	}
	
	public boolean removeReader(Reader obj)
	{
		boolean count = false;
		for(int i=0; i<readers.length; i++)
		{
			if(readers[i] == obj)
			{
				readers[i] = null;
				count = true;
				break;
			}
		}
		return count;
	}
	
	public Reader searchReader(int nid)
	{
		Reader obj = null;
		
		for(int i=0; i<readers.length; i++)
		{
			if(readers[i] != null)
			{
				if(readers[i].getNid() == nid)
				{
					obj = readers[i];
					break;
				}
			}
		}
		return obj;
	}
	public void showAllReaders()
	{	
		for(int i=0; i<readers.length; i++)
		{
			if(readers[i] != null)
			{
				readers[i].showDetails();
				//readers[i].showAllAccounts();
				System.out.println();
			}
		}
	}
		
	public boolean insertEmployee(Employee e)
	{
		boolean count = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				count = true;
				break;
			}
		}
		return count;
	}
	
	public boolean removeEmployee(Employee e)
	{
		boolean count = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				count = true;
				break;
			}
		}
		return count;
	}

	public Employee searchEmployee(String employeeId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmployeeId().equals(employeeId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	public void showAllEmployeesInfo()
	{
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("Employee Id: " + employees[i].getEmployeeId());
				System.out.println("Employee Name: " + employees[i].getEmployeeName());
				System.out.println("Employee Salary: " + employees[i].getSalary());
				System.out.println();
				//break;
			}
			else
			{
				System.out.println("No employees availabe right now");
				System.out.println();
				break;
			}
		}
	}

	public boolean insertBook(Book b)
	{
		boolean bool = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i]==null)
			{
				books[i]=b;
				bool=true;
				break;
			}
		}
		return bool;
	}

	public boolean removeBook(Book b)
	{
		boolean bool = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i]==b)
			{
		
				books[i]=null;
				bool=true;
				break;
			}
		}
		return bool;
	}
	
	public void showAllBooks()
	{
		for(int i=0; i<books.length; i++)
        {
            if(books[i]!=null)
            {
            
                books[i].showDetails();
            
            }
            else
            {
            	System.out.println("Sorry!! No Book availabe");
            	break;
            }
            
        }
	}

	public Book searchBook(String isbn)
	{
		Book bb = null;
		
		for(int i=0; i<books.length; i++)
        {
            if(books[i]!=null)
            {
                if(books[i].getIsbn().equals(isbn))
                {
                    bb=books[i];
                
                    break;
                }
            }
        }
        return bb;
	}

}