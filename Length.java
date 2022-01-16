class Length
{
	public static void main(String args[])
	{
		int no,i,max=0,count=0,length=0;
		System.out.println("Generated values are");
		for(i=1; i<=10; i++)
		{
			no = (int)(Math.random()*100);
			System.out.println(no+" ");
			if(no>max)
			{
				max=no;
				count++;
			}
			else
			{
				max=no;
				count=1;
			}
	
			if(count>length)
				length = count;
		
		}
		System.out.print("Length: "+length);
		
	}
}