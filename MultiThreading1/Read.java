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
		
		try
		{
		//System.out.println(filename.getName()+" thread created");	
		FileInputStream fis = new FileInputStream(filename);
		int c=0;
                do
                {
			System.out.println((char)c);
			if(c==0)
				continue;
			rRead.setData(c);
		}while((c=fis.read())!=-1);
		fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}