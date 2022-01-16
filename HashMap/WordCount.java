import java.io.*;
import java.util.*;
class WordCount
{
	public static void main(String args[]) throws IOException
	{
		Console con = System.console();
		System.out.println("Enter filename");
		String str = con.readLine();

		HashSet set = new HashSet();
		HashMap map = new HashMap();

		StreamTokenizer st = new StreamTokenizer(new FileInputStream(str));

		while(st.nextToken() != StreamTokenizer.TT_EOF)
		{
			String s;
			switch(st.ttype)
			{
				case StreamTokenizer.TT_NUMBER:
					s=st.nval+"";
					break;
				case StreamTokenizer.TT_WORD:
					s=st.sval;
					break;
				default:
					s=""+ ((char)st.ttype);
					
			}	
	
				if(!set.contains(s))
				{
					set.add(s);
					map.put(s,1);
					
				}
				else
				{
					map.put(s, (int)map.get(s)+1);
				}
			}

		
			Iterator iter = set.iterator();
			while(iter.hasNext())
			{
				String a = (String)iter.next();
				System.out.println(a+" "+map.get(a));
			}
		}
}

		