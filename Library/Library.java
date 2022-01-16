import java.io.*;
class Library
{
	public static void main(String args[])
	{
		Console con = System.console();
		String option;
		Item arr[] = new Item[10];
		for(int i=0; i<10; i++)
		{
			System.out.print("book or dvd <b/d> : ");
			option = con.readLine();
		
			if(option.equals("b"))
			{
				arr[i] = new Book();
				arr[i].read();
			}
			else
			{
				arr[i] = new Dvd();
				arr[i].read();
			}
		}
	
		System.out.println("List of issued items : ");
		for(int i=0; i<10; i++)
		{
			arr[i].show();
		}
	}
}
		
		 