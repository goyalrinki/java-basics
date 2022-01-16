
class UseMatrix
{
	public static void main(String args[])
	{
		Matrix m1 = new Matrix();
		System.out.println("Enter 9 values");
		m1.read();
		System.out.println("First Matrix is :");
		m1.show();

		Matrix m2 = new Matrix(5,4);
		System.out.println("Enter 20 more values");
		m2.read();
		System.out.println("Second Matrix is :");
		m2.show();

		Matrix m3 = new Matrix(m2);
		System.out.println("Third Matrix is :");
		m3.show();

		System.out.println("Enter 20 more values");
		m3.read();
		System.out.println("Now Third Matrix is :");
		m3.show();
	
	}
}