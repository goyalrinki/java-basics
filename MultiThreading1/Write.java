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
		
		try
		{
			String s= filename1+""+1+".txt";
		File f=new File(s);
		//System.out.println(f.getName()+" file created");
		FileOutputStream fos = new FileOutputStream(f);
		int d =Integer.parseInt(wWrite.getData()+"");	
		while(d!=-1)
		{
			System.out.println((char)d);
				fos.write(d);
		}
		fos.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}