import java.io.*;
import java.util.*;

public class SharedCell1
{
	public static void main(String args[]) throws Exception
	{
		String workingDir = args[0];
		//String workingDir = System.getProperty("user.dir");
		File f = new File(workingDir);
		File arr[];
		arr = f.listFiles();
		int t = arr.length;

		Number n[] = new Number[t];
		double sum[] = new double[t];

		double finalSum = 0;

		for(int j=0; j<t; j++)
		{
			n[j] = new Number(arr[j]);
			n[j].start();

			n[j].join();
			sum[j] = n[j].total();
		}

		for(int i=0; i<t; i++)
		{
			finalSum = finalSum + sum[i];
		}

		String str = workingDir+"sum.txt";		
		File fi = new File(str);
		FileWriter fr = new FileWriter(fi);
		String s = finalSum+"";
		fr.write(s);
		fr.close();
	
	}
}