import java.io.*;
import java.util.*;

public class SharedCell
{
	public static void main(String args[]) throws Exception
	{
		Console con = System.console();

		System.out.println("Enter directory");
		String workingDir = con.readLine();
		//String workingDir = System.getProperty("user.dir");
		File f = new File(workingDir);
		File arr[];
		arr = f.listFiles();
		int t = arr.length;

		ReadWrite rw[] =  new ReadWrite[t];
		Read r[] = new Read[t];
		Write w[] = new Write[t];
		System.out.println("nO OF FILES = "+t);
		for(int j=0; j<t; j++)
		{
			rw[j] = new ReadWrite();
			r[j] = new Read(rw[j], arr[j]);
			w[j] = new Write(rw[j], arr[j]);
			
			r[j].start();
			w[j].start();
		}
		
	
	}
}