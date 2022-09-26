package classes;
import interfaces.*;
import java.util.*;
import java.lang.*;
public abstract class Reader implements IReaderMembership
{
	private String name;
	private int nid;
	private int accountNumber;
	private double balance;

	public Reader(String name,int nid, int accountNumber, double balance)
	{
		this.name=name;
		this.nid=nid;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public void setNid(int nid)
	{
		this.nid=nid;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}

	public String getName()
	{
		return name;
	}
	public int getNid()
	{
		return nid;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}

	public abstract void showDetails();

	public boolean renewMembership(double amount)
	{
		boolean flag = false;
		if(amount>0)
		{
			balance = balance + amount;
			flag = true;
		}
		return flag;
	}
	public boolean removeMembership(double amount)
	{
		boolean flag = false;
		if(amount>0 && amount<=balance)
		{
			balance = balance - amount;
			flag = true;
		} 
		return flag;
	}
	
}