//Driver class
//Program to demonstrate on access specifier
package in.kkwagh.library;
import in.bkcmet.library.*;
//import in.bkcmet.library.Library;

public class FacultyExecutor {

	public static void main(String[] args) {
		Library l = new Library();
		l.libraryname="Bhujbal Library";
		l.displaypublic();
		
		/*userId and displayprivate method is private so we can't access into another package or class, 
		 * only we can access inside a same class*/
		
		//l.userId=1234555L;
		//l.displayprivate();
		
		
		/*booksname and displaydefault method is default we can't access into another 
		 * package only we can access it within the same package*/
		
		//l.booksname;
		//l.displaydefault();

	}

}
