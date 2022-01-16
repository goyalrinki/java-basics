import java.io.*;
import java.util.*;

class Read extends Thread
{
	private ReadWrite rRead;

	File filename;

	public Read(ReadWrite h, File f)
	{
		rRead = h;
		filename = f;
	}

	public void run()
	{
		//int si = rRead.get();
		//for(int count =1; count<=1; count++)
		//{
		try
		{
			
		FileInputStream fis = new FileInputStream(filename);
		int c = fis.read() ;
                do
                {
			System.out.println((char)c);
			rRead.setData(c);
		}while((c= fis.read())!=-1);
		if( (c = fis.read())==-1)
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//}

	}
}