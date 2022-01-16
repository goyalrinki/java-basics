import java.io.*;
class CopyFile
{
	public static void main(String args[]) throws IOException
	{
		if(args.length < 3)
		{
			System.out.println("Parameter missing");
			System.exit(0);
		}
		if(args.length > 3)
		{
			System.out.println("Too much Parameter");
			System.exit(0);
		}
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);

		if((!f1.exists())&&(!f2.exists()))
		{
			System.out.println("Source File does not exist");
			System.exit(0);
		}

		FileInputStream fis1 = new FileInputStream(args[0]);
		FileInputStream fis2 = new FileInputStream(args[1]);

		FileOutputStream fos = new FileOutputStream(args[2],true);

		int ch;
		while((ch = fis1.read())!= -1)
			fos.write(ch);
		while((ch = fis2.read())!= -1)
			fos.write(ch);

		fis1.close();
		fis2.close();
		fos.close();
	}
}