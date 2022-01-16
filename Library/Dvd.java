import java.io.*;
class Dvd implements Item
{
	Console con = System.console();
	String title, director, category;
	public void read()
	{
		System.out.print("Enter dvd's tilte : ");
		title = con.readLine();
		System.out.print("Enter director's name : ");
		director = con.readLine();
		System.out.print("Enter category : ");
		category = con.readLine();
	}
	public void show()
	{
		System.out.println("Dvd : "+title+"  Director : "+director+"  Category : "+category);
	}
}
		
		 