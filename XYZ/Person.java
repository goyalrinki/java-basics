package a.b.c;
public class Person
{
	protected String name, surname;
	public Person()
	{
		name = "unknown";
		surname = "unknown";
	}
	public Person(String n)
	{
		name = n;
		surname = "unknown";
	}
	public Person(String n, String s)
	{
		name = n;
		surname = s;
	}
	public Person(Person p)
	{
		name = p.name;
		surname = p.surname;
	}
}