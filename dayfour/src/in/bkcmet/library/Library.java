//Program to demonstrate on access specifier
package in.bkcmet.library;

public class Library {
	//different access specifier
	public String libraryname;
	private int userId;
	String booksname;
	
	//public method
	public void displaypublic()
	{
		System.out.println("Library name: "+libraryname);
	}
	
	//private method
	public void displayprivate()
	{
		System.out.println("user Id: "+userId);
	}
	
	//default method
	public void displaydefault()
	{
		System.out.println("Book Name: "+booksname);
	}
}
