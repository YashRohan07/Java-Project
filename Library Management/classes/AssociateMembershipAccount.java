package classes;
import java.util.*;
import java.lang.*;

public class AssociateMembershipAccount extends Reader{

	private double membershipDuration;

	public AssociateMembershipAccount(String name,int nid, int accountNumber, double balance, double membershipDuration)
	{
		super(name, nid, accountNumber, balance);
		this.membershipDuration=membershipDuration;
	}
	public void setmembershipDuration(double membershipDuration)
	{
		this.membershipDuration = membershipDuration;
	}
	public double getmembershipDuration()
	{
		return membershipDuration;
	}

	public void showDetails()
	{
		System.out.println("This is an Associate Membership Account");
		System.out.println("Account Holder Name: "+getName());
		System.out.println("NID number: " +getNid());
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("Total Balance : "+getBalance());
		System.out.println("Duration of an Associate Membership: "+getmembershipDuration());
	}

}