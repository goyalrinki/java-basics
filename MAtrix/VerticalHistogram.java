import java.io.*;
public class VerticalHistogram {

	public static void main(String[] args) {
		
		Console con = System.console();
		int arr[]= new int[10];
		int i, j, max=0,var=0;
		System.out.println("Enter 10 values");
		for(i=0; i<arr.length; i++)
		{
			arr[i]=Integer.parseInt(con.readLine());
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		 var=max;
		//System.out.print(max);
		
		for(i=0; i<var; i++)
		{
			for(j=0; j<arr.length;j++)
			
				if(arr[j]>=max)
					System.out.print("*");
				else
					System.out.print(" ");
				max--;
				System.out.println();
			
			
		}

	}

}
