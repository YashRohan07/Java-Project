package classes;
import java.util.*;
import java.lang.*;

public class InstitutionalMembershipAccount extends Reader
{
	private double membershipDuration;

	public InstitutionalMembershipAccount(String name,int nid, int accountNumber, double balance, double membershipDuration)
	{
		super(name, nid, accountNumber, balance);
		this.membershipDuration=membershipDuration;
	}

	public void setmembershipDuration(double membershipDurationin)
	{
		this.membershipDuration=membershipDuration;
	}
	public double getmembershipDuration(){
		return membershipDuration;
	}
	public void showDetails()
	{
		System.out.println("This is an Institutional Membership Account");
		System.out.println("Account Holder Name: "+getName());
		System.out.println("NID number: " +getNid());
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("Total Balance : "+getBalance());
		System.out.println("The Duration of Institutional Membership : "+getmembershipDuration());
	}

}