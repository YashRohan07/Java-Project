package interfaces;
import java.lang.*;
import classes.*;
public interface IBook 
{
	boolean insertBook(Book b);
	boolean removeBook(Book b);
	Book searchBook(String isbn);
	void showAllBooks();	
}