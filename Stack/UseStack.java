import java.io.*;

class UseStack
{
	public static void main(String args[])
	{
		Stack1 s = new Stack1();
		s.push("c");
		s.push("C++");
		s.push("java");


		try
		{
			while(!s.empty())
				System.out.println((String)s.pop());
		

		}
		catch(UnderFlowException e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}