import java.io.*;

public class CircularLeftShift {

	
	public static void main(String[] args) {
		
		Console con = System.console();
		int arr[]= new int[10];
		int i, j;
		System.out.println("Enter 10 values");
		for(i=0; i<arr.length; i++)
			arr[i]=Integer.parseInt(con.readLine());
		
		System.out.println("Enter number for circular left shift");
		int n=Integer.parseInt(con.readLine());
		for(i=0; i<n; i++)
		{
			int temp = arr[0];
			for(j=0; j<arr.length-1; j++)	
				arr[j] = arr[j+1];
			arr[arr.length-1] = temp;
		}
		
		for(int value:arr)
			System.out.print(" "+value);
		
	}

}
