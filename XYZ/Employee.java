package a;
import a.b.ContactInfo;
public class Employee extends ContactInfo
{
	protected long salary;
	public Employee()
	{
		salary = 0;
	}
	public Employee(String sn, long s)
	{
		super(sn);
		salary = s;
	}
	public Employee(String sn, String ss, long s)
	{
		super(sn,ss);
		salary = s;
	}
	public Employee(String sn, String ss, long sp, long s)
	{
		super(sn,ss,sp);
		salary = s;
	}
	public Employee(Employee e)
	{
		super(e);
		salary = e.salary;
	}
	public void show()
	{
		System.out.println("Name : "+name+" Surname : "+surname+" Phone No. : "+phone+" Salary : "+salary);
	}
}