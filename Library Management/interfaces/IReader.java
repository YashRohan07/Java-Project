package interfaces;
import java.lang.*;
import classes.*;
public interface IReader 
{
	boolean insertReader(Reader obj);
	boolean removeReader(Reader obj);
	Reader searchReader(int nid);
	void showAllReaders();	
}