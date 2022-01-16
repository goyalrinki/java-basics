import java.io.*;
import java.util.*;

class Number extends Thread
{
	File filename;
	double sum = 0;

	public Number(File f)
	{
		filename = f;
	}

	public void run()
	{		
		try
		{
			
			StreamTokenizer st = new StreamTokenizer(new FileInputStream(filename));
			while(st.nextToken()!=StreamTokenizer.TT_EOF)
                	{
				if(st.ttype == StreamTokenizer.TT_NUMBER)
				{
					sum = sum+st.nval;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
	
	public double total()
	{
		return sum;
	}
}