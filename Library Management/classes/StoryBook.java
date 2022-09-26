package classes;
import java.util.*;
import java.lang.*;
public class StoryBook extends Book{
	
	private String category;

	public StoryBook(){}

	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, 
	String category)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.category = category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getCategory()
	{
		return category;
	}

	public void showDetails()
	{
		System.out.println("This is a story Book");
		System.out.println("The Isbn is : "+getIsbn());
		System.out.println("Tittle of the Book : "+getBookTitle());
		System.out.println("Book Author's Name : "+getAuthorName());
		System.out.println("Book Price is : "+getPrice());
		System.out.println("Number of Available Quantity : "+getAvailableQuantity());
		System.out.println("Category is : "+category);
	}


}