import a.Employee;
public class Office
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		System.out.println("First Employee is : ");
		e1.show();
		Employee e2 = new Employee("John","Ross",1234567890,23000);
		System.out.println("Second Employee is : ");
		e2.show();
		Employee e3 = new Employee(e2);
		System.out.println("Third Employee is : ");
		e3.show();
	}
}