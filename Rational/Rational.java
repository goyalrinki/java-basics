class Rational
{
	private int numerator;
	private int denominator;

	public Rational(int n,int d)
	{
		numerator=n;
		denominator=d;
	}

	public Rational()
	{
		this(0,0);
	}

	public Rational(Rational r)
	{
		this(r.numerator, r.denominator);
	}

	public void set(int n,int d)
	{
		numerator=n;
		denominator=d;
	}

	public void show()
	{
		System.out.println(numerator+"/"+denominator);
	}

	public Rational add(Rational r)
	{
		Rational temp=new Rational();
		temp.denominator=denominator*r.denominator;
		temp.numerator=(numerator*r.denominator)+(r.numerator*denominator);
		return temp;
	}

	public Rational less(Rational r)
	{
		Rational temp=new Rational();
		temp.denominator=denominator*r.denominator;
		temp.numerator=(numerator*r.denominator)-(r.numerator*denominator);
		return temp;
	}

	public Rational multiply(Rational r)
	{
		Rational temp=new Rational();
		temp.numerator=numerator*r.numerator;
		temp.denominator=denominator*r.denominator;
		return temp;
	}

	public Rational divide(Rational r)
	{
		Rational temp=new Rational();
		temp.numerator=numerator*r.denominator;
		temp.denominator=denominator*r.numerator;
		return temp;
	}
	
}			
