public class Pattern
{
	public static void main(String args[])
	{
		int no,i,j;
		no=(int)(Math.random()*10);
		System.out.println("Number of lines are: "+no);
		for(i=1; i<=no; i++)
		{
			for(j=no; j>i; j--)
				System.out.print(" ");
			for(j=1; j<=i; j++)
				System.out.print(j);
			for(j=i-1; j>=1; j--)
				System.out.print(j);
			System.out.println();
		}
	}
}