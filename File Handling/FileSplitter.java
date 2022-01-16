import java.io.*;
class FileSplitter
{
	public static void main(String args[]) throws IOException
	{
		int length = 1;
		Console con = System.console();
		System.out.println("Enter filename");
		String f = con.readLine();
		File f1 = new File(f);
		if(!f1.exists())
		{
			System.out.println("File does not exist");
			System.exit(0);
		}

		

		System.out.println("Enter destination file size");
		byte size = (byte)Integer.parseInt(con.readLine());

		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream bis =new BufferedInputStream(fis);

		int ch;
		int n = 0;
		if(f1.length()%size!=0)
			n = (int)(f1.length()/size) + 1;
		else
			n = (int)(f1.length()/size);

		System.out.println("No of partitions = "+n);

		for(int i=1; i<=n; i++)	
		{

			//System.out.println("File = "+i);
			File temp = new File(f+i+".txt");
			if(!temp.exists())
				temp.createNewFile();
			FileOutputStream fos = new FileOutputStream(temp);
			
			while((length<=size)&&((ch=bis.read())!=-1))	
			{
				
			//System.out.println("ch is"+ch);
			fos.write(ch);
			length++;

		}
		fos.close();
		//System.out.println("File = "+i+"executed");
		length = 1;
		}

		System.out.println("File Splitting Successful...!!!");

		bis.close();
		fis.close();
		f1.delete();
	}
}