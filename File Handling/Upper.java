import java.io.*;
class Upper
{
	public static void main(String args[]) throws IOException
	{
		if(args.length < 2)
		{
			System.out.println("Parameter missing");
			System.exit(0);
		}
		if(args.length > 2)
		{
			System.out.println("Too much Parameter");
			System.exit(0);
		}
		File f1 = new File(args[0]);
		
		if(!f1.exists())
		{
			System.out.println("Source File does not exist");
			System.exit(0);
		}

		FileInputStream fis1 = new FileInputStream(args[0]);

		FileOutputStream fos = new FileOutputStream(args[1]);

		int ch;
		while((ch = fis1.read())!= -1)
		{
			char c = (char)ch;
			char a = Character.toUpperCase(c);
			ch = a;
			fos.write(ch);
		}

		fis1.close();
		fos.close();
	}
}