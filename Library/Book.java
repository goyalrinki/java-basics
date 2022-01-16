import java.io.*;
class Book implements Item
{
	Console con = System.console();
	String title, name, publication;
	public void read()
	{
		System.out.print("Enter book's tilte : ");
		title = con.readLine();
		System.out.print("Enter author's name : ");
		name = con.readLine();
		System.out.print("Enter publication : ");
		publication = con.readLine();
	}
	public void show()
	{
		System.out.println("Book : "+title+"  Author : "+name+"  Publication : "+publication);
	}
}
		
		 