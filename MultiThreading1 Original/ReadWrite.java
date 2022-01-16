import java.io.*;
import java.util.*;

class ReadWrite
{
	private boolean empty = true;
	//private int size;
	Vector v = new Vector();

	//File filename;
	//FileInputStream fis;
	
	/*public ReadWrite(String f)
	{
		filename = new File(f);
		fis = new FileInputStream(filename);
	}*/
	
	synchronized public void setData(Object o)
	{
		while(!empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e1)
			{
				System.out.println(e1.getMessage());
			}
		}
		v.add(o);
		empty = false;
		notify();
	}

	synchronized public Object getData()
	{
		while(empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e2)
			{
				System.out.println(e2.getMessage());
			}
		}
		Object o1 = v.firstElement();
		v.remove(o1);
		notify();
		empty = true;
		return o1;
	}
	
	
}