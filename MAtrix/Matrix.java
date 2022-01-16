import java.io.*;
class Matrix
{
	private int arr[][] ;
	
	public Matrix()
	{
		arr = new int[3][3];
	}

	public Matrix(int r, int c)
	{
		arr = new int[r][c];
	}
	
	public Matrix(Matrix m)
	{	
		int r = m.arr.length;
		int c = m.arr[0].length;
		arr = new int[r][c];
	}

	public void read()
	{
		int i,j;
		Console con = System.console();
		for(i=0; i<arr.length; i++)
			for(j=0; j<arr[i].length; j++)
				arr[i][j] = Integer.parseInt(con.readLine());
	}

	public void show()
	{
		int i,j;
		for(i=0; i<arr.length; i++)
		{
			for(j=0; j<arr[i].length; j++)
			System.out.print(arr[i][j]+" ");
		System.out.println();
		}
	}
}