package classes;
import java.util.*;
import java.lang.*;

public class SupportedMembershipAccount extends Reader
{
	private double discountRate;

	public SupportedMembershipAccount(String name,int nid, int accountNumber, double balance, double discountRate)
	{
		super(name, nid, accountNumber, balance);
		this.discountRate=discountRate;
	}
	public void setdiscountRate(double discountRate)
	{
		this.discountRate=discountRate;
	}
	public double getdiscountRate()
    {
        return discountRate;
    }

	public void showDetails()
	{
		System.out.println("This is a Supported Membership Account");
		System.out.println("Account Holder Name: "+getName());
		System.out.println("NID number: " +getNid());
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("Total Balance : "+getBalance());
		System.out.println("Total Discount Rate : "+getdiscountRate());
	}

}