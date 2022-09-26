package classes;
import java.util.*;
import java.lang.*;

public class TextBook extends Book{
	
	private int standard;

	
	public TextBook()
	{
		
	}

	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.standard = standard;
		
	}

	
	public void setStandard(int standard)
	{
		this.standard = standard;
	}
	
	public int getStandard()
	{
		return standard;
	}

	public void showDetails()
	{
		System.out.println("This is a Text Book");
		System.out.println("The Isbn is : "+getIsbn());
		System.out.println("Title of the book is : "+getBookTitle());
		System.out.println("Book Author's Name : "+getAuthorName());
		System.out.println("Book Price is : "+getPrice());
		System.out.println("Number of available Quantity : "+getAvailableQuantity());
		System.out.println("Standard : "+standard);
	}


}