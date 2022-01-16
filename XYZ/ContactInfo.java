package a.b;
import a.b.c.Person;

public class ContactInfo extends Person
{
	protected long phone;
	public ContactInfo()
	{
		phone = 0;
	}
	public ContactInfo(String cn)
	{
		super(cn);
		phone = 0;
	}
	public ContactInfo(String cn, String cs)
	{
		super(cn,cs);
		phone = 0;
	}
	public ContactInfo(String cn, long p)
	{
		super(cn);
		phone = p;
	}
	public ContactInfo(String cn, String cs, long p)
	{
		super(cn,cs);
		phone = p;
	}
	public ContactInfo(ContactInfo c)
	{
		super(c);
		phone = c.phone;
	}
}