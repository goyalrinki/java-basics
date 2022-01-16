import java.io.*;
class FileMerger
{
	public static void main(String args[]) throws IOException
	{
		
		Console con=System.console();
		String str;
		int n=0;
		System.out.println("Specify file to be retrieved");
		str=con.readLine();

		File fi = new File("C:/Users/Goyal/Desktop/Assignments/File Handling");
		String arr[];
		arr = fi.list();

		for(int i=0; i<arr.length; i++)
		 if(arr[i].contains(str))
			n++;
		//System.out.print("Enter the no. of files to be merged");
		//int n=Integer.parseInt(con.readLine());
		File f=new File(str);
		if(!f.exists())
		{
			f.createNewFile();
			FileOutputStream fos=new FileOutputStream(f);
			int ch;
			for(int i=1;i<=n;i++)
			{
				File filename = new File(str+i+".txt");
				FileInputStream fis=new FileInputStream(filename);
				while((ch=fis.read())!=-1)
				{
					fos.write(ch);
				}
				fis.close();
			filename.delete();
			}	
			fos.close();
		}
		System.out.println("File Merging Successful...!!!");
	}
	
}