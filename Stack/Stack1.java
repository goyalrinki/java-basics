import java.util.*;
class Stack1
{

	Vector v = new Vector();
	public void push(Object o)
	{
		v.add(o);
	}

	public Object pop() throws UnderFlowException
	{
		if(v.size()>0)
		{
			Object a = v.lastElement();
			int position = v.indexOf(a);
			v.remove(position);
			return a;
		}
		else
			throw new UnderFlowException(" Underflow Exception ");
	}
		
	public boolean empty()
	{
		if(v.size()!=0)
			return false;
		else
			return true;
	}
	
}