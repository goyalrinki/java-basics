import java.io.*;
import java.util.*;

class Write extends Thread
{
	private ReadWrite wWrite;
	File filename1;
	String str;

	public Write(ReadWrite h, File f)
	{
		wWrite = h;
		filename1 = f;
		//str = filename1.get();
	}

	public void run()
	{
		//int si;
		//si = wWrite.get();
		//for(int i = 1; i<=10; i++)
		//{
		try
		{
			String s= filename1+""+1+".txt";
		File f=new File(s);
		FileOutputStream fos = new FileOutputStream(f);
		while(true)
		{
			int d =(Integer)wWrite.getData();
			
			if(d!= (-1))
				{

				System.out.println((char)d);
				fos.write(d);
				}
			else
				{
				System.out.println(d);
				fos.close();
				}
		}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//}
		
	}
}