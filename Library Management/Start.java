import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Start
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		FileReadWriteDemo frwd = new FileReadWriteDemo();

		System.out.println("\t\t--------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t WELCOME TO");
		System.out.println("\t\t\t\t\t Library Management System ");
		System.out.println("\t\t--------------------------------------------------------------------------");

		boolean repeat = true;
		while(repeat)
		{
			System.out.println();
			System.out.println("\t\t\tWhat do you want to do?");
			System.out.println("\t\t\t1. Employee Managment");
			System.out.println("\t\t\t2. Reader Management");
			System.out.println("\t\t\t3. Reader Membership Transactions(Renew Membership & Cancel Membership)");
			System.out.println("\t\t\t4. Book Management");
			System.out.println("\t\t\t5. Exit");

			System.out.println();
			int choice = 0;
			boolean done = false;

			while(!done)
			{
				try
				{
					System.out.print("\t\tPlaese enter your choice: ");
					choice = sc.nextInt();
					done = true;
				}
				catch(InputMismatchException e)
				{
					String str=sc.nextLine();
					System.out.println();
					System.out.println("\t\tThis is a invalid input!");
					System.out.println("\t\tPlaese Enter a whole number.");
					System.out.println();
				}
			}
			switch(choice)
			{
			case 1:
				System.out.println("\t\t--------------------------------------------------------------------------");
				System.out.println("\t\tYou have choose employee management.");
				System.out.println("\t\t--------------------------------------------------------------------------");

				System.out.println("\t\t\tYou have following options: ");
				System.out.println("\t\t\t1. Insert New  Employee");
				System.out.println("\t\t\t2. Remove Existing Employee");
				System.out.println("\t\t\t3. Search An Employee");
				System.out.println("\t\t\t4. Show all Employee");
				System.out.println("\t\t\t5. Go Back");
				System.out.println();

				System.out.print("\t\tEnter your option: ");
				int op1 = sc.nextInt();
				switch(op1)
				{
				case 1:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou choose for Insert an Employee");
					System.out.println("\t\t--------------------------------------------------------------------------");

					System.out.print("\t\t\tEnter Employee ID: ");
					String eid1 = sc.next();
					System.out.print("\t\t\tEnter Employee Name: ");
					String eNa = sc.next();
					System.out.print("\t\t\tEnter Employee Salary: ");
					double eSalary= sc.nextDouble();

					Employee e1 = new Employee();
					e1.setEmployeeId(eid1);
					e1.setEmployeeName(eNa);
					e1.setSalary(eSalary);

					if(l.insertEmployee(e1))
					{
						System.out.println("\t\t---Employee "+ e1.getEmployeeId()+" has been Inserted.---");
					}
					else
					{
						System.out.println("\t\t---Employee "+ e1.getEmployeeId()+" can not be Inserted!---");
					}
					System.out.println();
					break;

				case 2:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose for Remove an Employee");
					System.out.println("\t\t--------------------------------------------------------------------------");

					System.out.print("\t\t\tEnter Employee ID: ");
					String eid2 = sc.next();

					Employee e2 = l.searchEmployee(eid2);
					if(e2 != null)
					{
						System.out.println("\t\t\t### EMployee found for removing ###");
						if(l.removeEmployee(e2))
						{
							System.out.println("\t\t---Employee "+ e2.getEmployeeId()+" has been Removed.---");
						}
					}
					else
					{
						System.out.println("\t\t\t### Employee not found and can not be removed!!! ###");
					}
					break;

				case 3:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose to Search an Employee");
					System.out.println("\t\t--------------------------------------------------------------------------");

					System.out.print("\t\t\tEnter Employee ID: ");
					String eid3 = sc.next();

					Employee e3 = l.searchEmployee(eid3);
					if(e3 != null)
					{
						System.out.println("\t\t\t###Employee Found ###");
						System.out.println("\t\t\tEmployee Name: "+ e3.getEmployeeName());
						System.out.println("\t\t\tEmployee ID: " + e3.getEmployeeId());
						System.out.println("\t\t\tEmployee Salary: " + e3.getSalary());
					}
					else
					{
						System.out.println("");
						System.out.println("\t\t\t### Employee not found!!! ###");
					}
					break;

				case 4:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose to Show all Emoloyee");
					System.out.println("\t\t--------------------------------------------------------------------------");

					l.showAllEmployeesInfo();
					break;

				case 5:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose to go back.");
					System.out.println("\t\t--------------------------------------------------------------------------");
					break;

				default:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\t\tInvalid Option!!!");
					System.out.println("\t\t--------------------------------------------------------------------------");
					break;
				}

				break;

			case 2:
				System.out.println("\t\t--------------------------------------------------------------------------");
				System.out.println("\t\tYou have choose Reader management.");
				System.out.println("\t\t--------------------------------------------------------------------------");

				System.out.println("\t\t\tYou have following options: ");
				System.out.println("\t\t\t1. Insert New Reader");
				System.out.println("\t\t\t2. Reamove Existing Reader");
				System.out.println("\t\t\t3. Search A Reader");
				System.out.println("\t\t\t4. Show All Reader");
				System.out.println("\t\t\t5. Go Back");
				System.out.println();

				System.out.print("\t\t\tSelect your option: ");
				int op2 = sc.nextInt();
				switch(op2)
				{
				case 1:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose Insert New Reader");
					System.out.println("\t\t--------------------------------------------------------------------------");

					System.out.println("\t\t\tWhich type of account do you want to create?");
					System.out.println("\t\t\t1. Associate Membership Account");
					System.out.println("\t\t\t2. Supported Membership Account");
					System.out.println("\t\t\t3. InstitutionalMembershipAccount");
					System.out.println("\t\t\t4. Go Back");
					System.out.println();

					System.out.print("\t\t\tSelect Option: ");
					int select = sc.nextInt();

					if(select == 1)
					{
						System.out.println("\t\t--------------------------------------------------------------------------");
						System.out.println("\t\t\tYou have choose Associate Membership Account");
						System.out.println("\t\t--------------------------------------------------------------------------");
						System.out.println();
						System.out.print("\t\t\tEnput Reader Name: ");
						String rNa = sc.next();
						System.out.print("\t\t\tEnter Reader NID: ");
						int rNid = sc.nextInt();
						System.out.print("\t\t\tEnter Reader Account Number: ");
						int rAn = sc.nextInt();
						System.out.print("\t\t\tEnter Reader Balance: ");
						double rBalance = sc.nextDouble();
						System.out.print("\t\t\tEnter Membership Duretion: ");
						int rMd = sc. nextInt();

						Reader r1 = new AssociateMembershipAccount(rNa,rNid,rAn,rBalance,rMd);

						if(l.insertReader(r1))
						{
							System.out.println("\t\t---Reader " + r1.getNid() +" hasbeen inserted.---");
						}
						else
						{
							System.out.println("\t\t---Reader " + r1.getNid() +" can not be inserted.---");
						}

					}
					else if (select == 2) {
						System.out.println("\t\t--------------------------------------------------------------------------");
						System.out.println("\t\tYou have choose Supported Membership Account");
						System.out.println("\t\t--------------------------------------------------------------------------");
						System.out.println();
						System.out.print("\t\t\tEnput Reader Name: ");
						String reNa = sc.next();
						System.out.print("\t\t\tEnter Reader NID: ");
						int reNid = sc.nextInt();
						System.out.print("\t\t\tEnter Reader Account Number: ");
						int reAn = sc.nextInt();
						System.out.print("\t\t\tEnter Reader Balance: ");
						double reBalance = sc.nextDouble();
						System.out.print("\t\t\tEnter Discountrate: ");
						double reMd = sc. nextDouble();

						Reader r2 = new SupportedMembershipAccount(reNa,reNid,reAn,reBalance,reMd);

						if(l.insertReader(r2))
						{
							System.out.println("\t\t---Reader " + r2.getNid() +" hasbeen inserted.---");
						}
						else
						{
							System.out.println("\t\t---Reader " + r2.getNid() +" can not be inserted.---");
						}

					}
					else if(select == 3)
					{
						System.out.println("\t\t--------------------------------------------------------------------------");
						System.out.println("\t\tYou have choose Institutional Membership Account");
						System.out.println("\t\t--------------------------------------------------------------------------");

						System.out.print("\t\t\tEnput Reader Name: ");
						String riNa = sc.next();
						System.out.print("\t\t\tEnter Reader NID: ");
						int riNid = sc.nextInt();
						System.out.print("\t\t\tEnter Reader Account Number: ");
						int riAn = sc.nextInt();
						System.out.print("\t\t\tEnter Reader Balance: ");
						double riBalance = sc.nextDouble();
						System.out.print("\t\t\tEnter Membership Duretion: ");
						double riMd = sc. nextInt();

						Reader r3 = new InstitutionalMembershipAccount(riNa,riNid,riAn,riBalance,riMd);
						if(l.insertReader(r3))
						{
							System.out.println("\t\t---Reader " + r3.getNid() +" hasbeen inserted.---");
						}
						else
						{
							System.out.println("\t\t---Reader " + r3.getNid() +" can not be inserted.---");
						}

					}
					else if(select == 4)
					{
						System.out.println("\t\t--------------------------------------------------------------------------");
						System.out.println("\t\tYou have choose to Go Back");
						System.out.println("\t\t--------------------------------------------------------------------------");
					}
					else
					{
						System.out.println("\t\t--------------------------------------------------------------------------");
						System.out.println("\t\tInvalid option!");
						System.out.println("\t\t--------------------------------------------------------------------------");
					}
					break;
				case 2:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose to remove Account");
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.print("\t\t\tEnter Reader NID: ");
					int xyz = sc.nextInt();

					Reader r4 = l.searchReader(xyz);
					if(r4 != null)
					{
						System.out.println("\t\t\t### Reader Found ###");
						if(l.removeReader(r4))
						{
							System.out.println("\t\t---Reader " + r4.getNid() +" hasbeen removed.---");
						}
						else
						{
							System.out.println("\t\t---Reader " + r4.getNid() +" can not removed.---");
						}
					}
					else
					{
						System.out.println("\t\t\t### Reader can not Found ###");
					}
					System.out.println();
					break;

				case 3:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose to Search an Account");
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.print("\t\t\tEnter Reader NID: ");
					int sear = sc.nextInt();

					Reader r5 = l.searchReader(sear);

					if(r5 != null)
					{
						r5.showDetails();
					}
					else{
						System.out.println("\t\t\t### Reader can not Found ###");
					}
					System.out.println();
					break;
				case 4:

					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\t\tYou have choose  to show all Reader.");
					System.out.println("\t\t--------------------------------------------------------------------------");
					l.showAllReaders();
					System.out.println();
					break;

				case 5:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\t\tYou choose to go back.");
					System.out.println("\t\t--------------------------------------------------------------------------");
					break;

				default:
					System.out.println();
					System.out.println("\t\t\tInvalid Choice.");
					break;
				}

				break;

			case 3:
				System.out.println("\t\t\tYou have choose Reader Membership Transactions");
				System.out.println();
				System.out.println("\t\t\tHere is your options: ");
				System.out.println("\t\t\t1. Renew Membership");
				System.out.println("\t\t\t2. Cancel Membership");
				System.out.println("\t\t\t3. Go Back");
				System.out.println();
				System.out.print("\t\t\tEnter  your option: ");
				int op4 = sc.nextInt();
				System.out.println();

				switch(op4)
				{
				case 1:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose Renew Membership.");
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.print("\t\t\tEnter NID number: ");
					int nid2 = sc.nextInt();

					Reader r7 = l.searchReader(nid2);
					if(r7 != null)
					{
						System.out.println();
						System.out.println("\t\t\t### Valid reader ###");
						System.out.println();
						System.out.println("\t\t---Current Balance: "+r7.getBalance()+"---");
						System.out.println();
						System.out.print("\t\t\tEnter Deposit money to Renew Membership: ");

						double dm = sc.nextDouble();
						if(r7.renewMembership(dm))
						{
							System.out.println("\t\t### Account renew Successfull ###");
							System.out.println("\t\tNew Balance : " + r7.getBalance());
							frwd.writeInFile("\t\t"+r7.getNid() + " has deposited amount " + dm + " in account number " + r7.getAccountNumber());	
						}
						else
						{
							System.out.println("\t\t### Invalid Amount ###");
						}
					}
					else{
						System.out.println("\t\t### Inavlid Reader ###");
					}
					System.out.println();
					break;

				case 2:
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose Remove Membership.");
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.print("\t\t\tEnter NID number: ");
					int nid3 = sc.nextInt();

					Reader r8 = l.searchReader(nid3);
					if(r8 != null)
					{
						System.out.println();
						System.out.println("\t\t\t### Valid reader ###");
						System.out.println();
						System.out.println("\t\t\tCurrent Balance: "+r8.getBalance());
						System.out.println();
						System.out.print("\t\t\tEnter Withdraw money: ");

						double wm = sc.nextDouble();
						if(r8.removeMembership(wm))
						{
							System.out.println("\t\t### Account Successfull canceled ###");
							System.out.println("\t\tNew Balance : " + r8.getBalance());
							frwd.writeInFile("\t\t"+r8.getNid() + " has deposited amount " + wm + " in account number " + r8.getAccountNumber());	
							l.removeReader(r8);
						}
						else
						{
							System.out.println("\t\t### Invalid Amount ###");
						}
					}
					else{
						System.out.println("\t\t### Inavlid Reader ###");
					}
					System.out.println();
					break;

				case 3: 
					System.out.println("\t\t--------------------------------------------------------------------------");
					System.out.println("\t\tYou have choose to Go Back");
					System.out.println("\t\t--------------------------------------------------------------------------");
					break;

				default:
					System.out.println();
					System.out.println("\t\t### Inavlid Option ###");
					break;

				}
				break;
			case 4:
				System.out.println("\t\t--------------------------------------------------------------------------");
				System.out.println("\t\t\tYou have choose Book Management");
				System.out.println("\t\t--------------------------------------------------------------------------");
				System.out.println();
				System.out.println("\t\t\tPlaese choose your option: ");
				System.out.println("\t\t\t1. For Employee");
				System.out.println("\t\t\t2. For Reader");
				System.out.println("\t\t\t3. Go Back");
				System.out.println();
				System.out.print("\t\t\tEnter your option: ");

				int option5 = sc.nextInt();


				switch(option5)
				{
					case 1: //for employee
						{
							System.out.println("\t\t-------------------------------------------------------------------------------");
							System.out.println("\t\tYou have choosen Book Management for Employee");
							System.out.println("\t\t-------------------------------------------------------------------------------");
							System.out.println("\t\t\t1. Insert New Book");
							System.out.println("\t\t\t2. Remove Book");
							System.out.println("\t\t\t3. Search Books");
							System.out.println("\t\t\t4. Show all Books");
							System.out.println("\t\t\t5: Go Back");
							System.out.println("");
							System.out.print("\t\tEnter you option: ");
							int option6 = sc.nextInt();

							switch(option6)
							{
							case 1:

								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Insert New Book");
								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tWhich type of books do you want to insert?");
								System.out.println("\t\t\t1. Story Book");
								System.out.println("\t\t\t2. Text Book");
								System.out.println("\t\t\t3: Go Back");
								System.out.println();

								System.out.print("\t\tEnter you option: ");
								int option7 = sc.nextInt();

								if(option7==1)
								{
									System.out.println("\t\t-------------------------------------------------------------------------------");
									System.out.println("\t\tYou have chose to Insert Story Books");
									System.out.println("\t\t-------------------------------------------------------------------------------");

									System.out.print("\t\t\tISBN : ");
									String sisbn=sc.next();
									System.out.print("\t\t\tBook Title : ");
									String sbooktitle = sc.next();
									System.out.print("\t\t\tBook Author Name : ");
									String sauthorName = sc.next();
									System.out.print("\t\t\tPrice : ");
									//sc.next();
									double sprice = sc.nextDouble();
									System.out.print("\t\t\tAvailable Quantity : ");
									int savailablequantity=sc.nextInt();
									System.out.print("\t\t\tCategory : ");
									String scategory=sc.next();

									Book sb1 = new StoryBook(sisbn,sbooktitle,sauthorName,sprice,savailablequantity,scategory);

									if(l.insertBook(sb1)==true)
									{
										System.out.println("\t\t---Story Book inserted---");
										System.out.println();
									}
									else
									{
										System.out.println("\t\t---Story Book not inserted---");
										System.out.println();
									}

								}

								else if(option7==2)
								{
									System.out.println("\t\t-------------------------------------------------------------------------------");
									System.out.println("\t\tYou have chose to Insert Text Books");
									System.out.println("\t\t-------------------------------------------------------------------------------");

									System.out.print("\t\t\tISBN : ");
									String tisbn=sc.next();
									System.out.print("\t\t\tBook Title : ");
									String tbooktitle=sc.next();
									System.out.print("\t\t\tBook Author Name : ");
									String tauthorName=sc.next();
									System.out.print("\t\t\tPrice : ");
									double tprice=sc.nextDouble();
									System.out.print("\t\t\tAvailable Quantity : ");
									int tavailablequantity=sc.nextInt();
									System.out.print("\t\t\tStandard : ");
									int tstandard=sc.nextInt();

									Book sb2 = new TextBook(tisbn,tbooktitle,tauthorName,tprice,tavailablequantity,tstandard);

									if(l.insertBook(sb2)==true)
									{
										System.out.println("\t\t---Text Book inserted---");
										System.out.println();
									}
									else
									{
										System.out.println("\t\t---Text Book not inserted---");
										System.out.println();
									}
								}

								else if(option7>3)
								{
									System.out.println("\t\tInvalid Option");
								}

								else
								{
									continue;
								}

								break;

							case 2:

								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Remove Books");
								System.out.println("\t\t-------------------------------------------------------------------------------");

								System.out.print("\t\t\tEnter the ISBN of the book: ");
								String disbn = sc.next();

								Book b1 = l.searchBook(disbn);

								if(l.removeBook(b1)==true)
								{
									System.out.println("\t\tBook removed");
								}
								else
								{
									System.out.println("\t\tBook not found and can not be removed ");
								}

								break;

							case 3:

								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Search Book");
								System.out.println("\t\t-------------------------------------------------------------------------------");

								System.out.print("\t\tEnter the isbn of the book: ");
								String sisbn = sc.next();

								Book b2 = l.searchBook(sisbn);

								if(b2!=null)
								{
									System.out.println("\t\t--Book Found--");
									System.out.println("\t\tBook ISBN : "+b2.getIsbn());
									System.out.println("\t\tBook Title : "+b2.getBookTitle());
									System.out.println("\t\tBook Author Name : "+b2.getAuthorName());
									System.out.println("\t\tBook price : "+b2.getPrice());
								}
								else
								{
									System.out.println("\t\t--Book not Found--");
								}

								break;

							case 4:

								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to show all Books");
								System.out.println("\t\t-------------------------------------------------------------------------------");

								l.showAllBooks();

								break;

							case 5:

								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tYou have chose to Go Back");
								System.out.println("\t\t-------------------------------------------------------------------------------");

								break;

							default:

								System.out.println("\t\t-------------------------------------------------------------------------------");
								System.out.println("\t\tInvalid Choice...");
								System.out.println("\t\t-------------------------------------------------------------------------------");

								break;	

							}

						}

						break;

								case 2: //for reader
									System.out.println("\t\t-------------------------------------------------------------------------------");
									System.out.println("\t\tYou have chose Book Management for Readers");
									System.out.println("\t\t-------------------------------------------------------------------------------");
									System.out.println("\t\t\t1. Search Books");
									System.out.println("\t\t\t2. Show all Books");
									System.out.println("\t\t\t3: Go Back");
									System.out.println("");
									System.out.print("\t\tEnter you option: ");
									int option8 = sc.nextInt();
									switch(option8)
									{
									case 1:
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tYou have chose to Search Book");
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.print("\t\tEnter the isbn of the book: ");
										String rsisbn = sc.next();
										Book b3 = l.searchBook(rsisbn);
										if(b3!=null)
										{
											System.out.println("\t\t--Book Found--");
											System.out.println("\t\tBook ISBN : "+b3.getIsbn());
											System.out.println("\t\tBook Title : "+b3.getBookTitle());
											System.out.println("\t\tBook Author Name : "+b3.getAuthorName());
											System.out.println("\t\tBook price : "+b3.getPrice());
										}
										else
										{
											System.out.println("\t\t--Book not Found--");
										}
										break;
									case 2:
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tYou have chose to show Books");
										System.out.println("\t\t-------------------------------------------------------------------------------");
										l.showAllBooks();
										break;
									case 3:
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tYou have chose to Go Back");
										System.out.println("\t\t-------------------------------------------------------------------------------");
										break;
									default:
										System.out.println("\t\t-------------------------------------------------------------------------------");
										System.out.println("\t\tInvalid Choice...");
										System.out.println("\t\t-------------------------------------------------------------------------------");
										break;		
									}
									break;	
								case 3:
									System.out.println("\t\t-------------------------------------------------------------------------------");
									System.out.println("\t\tYou have chose to Go Back");
									System.out.println("\t\t-------------------------------------------------------------------------------");
									
									break;
								default:
									System.out.println("\t\t-------------------------------------------------------------------------------");
									System.out.println("\t\tInvalid Choice...");
									System.out.println("\t\t-------------------------------------------------------------------------------");
									break;	
								}
								break;
							case 5:
								System.out.println();
								System.out.println("\t\tYou have choose Exit");
								System.out.println();
								repeat = false;
								break;
							default:
								System.out.println();
								System.out.println("\t\tInvalid Choice!");
								System.out.println();
							}
						}
					}
				}