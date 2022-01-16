class UseRational
{
	public static void main(String args[])
	{
		Rational r1=new Rational(1,6);
		System.out.println("First no. is ");
		r1.show();

		Rational r2=new Rational(2,5);
		System.out.println("Second no. is ");
		r2.show();

		Rational r3,r4,r5,r6;
		
		r3=r1.add(r2);
		System.out.println("Sum is ");
		r3.show();

		r4=r1.less(r2);
		System.out.println("Difference is ");
		r4.show();

		r5=r1.multiply(r2);
		System.out.println("Multiplication is ");
		r5.show();

		r6=r1.divide(r2);
		System.out.println("Division is ");
		r6.show();

	
		
	}
}
