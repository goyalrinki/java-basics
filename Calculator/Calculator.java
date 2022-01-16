
import java.awt.*;
 import java.awt.event.*;
class Calculator implements ActionListener
{
	Frame f;
	TextField t1;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
	Panel p1, p2, p3, p4;
	String str = "";
	long num = 0;
	long result = 0;
	String oper = "";
	String check;
	public void calcResult()
	{
		if(check.equals("1"))
		{
		if(oper.equals(""))
			result = num;
		else if(oper.equals("+"))
			result = result + num;
		else if(oper.equals("-"))
			result = result - num;
		else if(oper.equals("*"))
			result = result * num;
		else if(oper.equals("/"))
			result = result / num;
		else
			result = result;
		}
	}
	
	public Calculator()
	{
		f = new Frame();
		f.setSize(300,400);
		f.setLayout(new GridLayout(5,1));

		Font fn = new Font("Arial", Font.BOLD, 20);

		t1 = new TextField("");
		f.add(t1);
		
		b1 = new Button("1");
		b1.setFont(fn);
		b1.addActionListener(this);

		b2 = new Button("2");
		b2.setFont(fn);
		b2.addActionListener(this);
	
		b3 = new Button("3");
		b3.setFont(fn);
		b3.addActionListener(this);
	
		b4 = new Button("4");
		b4.setFont(fn);
		b4.addActionListener(this);
	
		b5 = new Button("5");
		b5.setFont(fn);
		b5.addActionListener(this);

		b6 = new Button("6");
		b6.setFont(fn);
		b6.addActionListener(this);

		b7 = new Button("7");
		b7.setFont(fn);
		b7.addActionListener(this);

		b8 = new Button("8");
		b8.setFont(fn);
		b8.addActionListener(this);

		b9 = new Button("9");
		b9.setFont(fn);
		b9.addActionListener(this);
	
		b10 = new Button("+");
		b10.setFont(fn);
		b10.addActionListener(this);

		b11 = new Button("-");
		b11.setFont(fn);
		b11.addActionListener(this);
	
		b12 = new Button("*");
		b12.setFont(fn);
		b12.addActionListener(this);

		b13 = new Button("=");
		b13.setFont(fn);
		b13.addActionListener(this);

		b14 = new Button("/");
		b14.setFont(fn);
		b14.addActionListener(this);

		b15 = new Button("0");
		b15.setFont(fn);
		b15.addActionListener(this);

		b16 = new Button("C");
		b16.setFont(fn);
		b16.addActionListener(this);


		p1 = new Panel(new GridLayout(1,4));
			p1.add(b1);
			p1.add(b2);
			p1.add(b3);
			p1.add(b10);
		f.add(p1);

		p2 = new Panel(new GridLayout(1,4));	
			p2.add(b4);
			p2.add(b5);
			p2.add(b6);
			p2.add(b11);
		f.add(p2);

		p3 = new Panel(new GridLayout(1,4));
			p3.add(b7);
			p3.add(b8);
			p3.add(b9);
			p3.add(b12);
		f.add(p3);
		
		p4 = new Panel(new GridLayout(1,4));
			p4.add(b13);
			p4.add(b15);
			p4.add(b14);
			p4.add(b16);	
		f.add(p4);
	
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			check = "1";
			str = str+"1";
			num = Long.parseLong(str);
			t1.setText(str);
		}
		if(e.getSource()==b2)
		{
			check = "1";
			str = str+"2";
			num = Long.parseLong(str);
			t1.setText(str);
		}
		if(e.getSource()==b3)
		{
			check = "1";
			str = str+"3";
			num = Long.parseLong(str);
			t1.setText(str);
		}
		if(e.getSource()==b4)
		{
			check = "1";
			str = str+"4";
			num = Long.parseLong(str);
			t1.setText(str);
		}	
		if(e.getSource()==b5)
		{
			check = "1";
			str = str+"5";
			num = Long.parseLong(str);
			t1.setText(str);
		}
		if(e.getSource()==b6)
		{
			check = "1";
			str = str+"6";
			num = Long.parseLong(str);
			t1.setText(str);
		}
		if(e.getSource()==b7)
		{
			check = "1";
			str = str+"7";
			num = Long.parseLong(str);
			t1.setText(str);
		}
		if(e.getSource()==b8)
		{
			check = "1";
			str = str+"8";
			num = Long.parseLong(str);
			t1.setText(str);
		}
		if(e.getSource()==b9)
		{
			check = "1";
			str = str+"9";
			num = Long.parseLong(str);
			t1.setText(str);
		}
		if(e.getSource()==b10)
		{
			calcResult();
			t1.setText(""+result);
			str="";
			oper="+";
			check = "2";
				
		}
		if(e.getSource()==b11)
		{
			calcResult();
			t1.setText(""+result);
			str="";
			oper="-";
			check = "2";
			
		}
		if(e.getSource()==b12)
		{

			calcResult();
			t1.setText(""+result);
			str="";
			oper="*";
			check = "2";
		}
		if(e.getSource()==b14)
		{
			calcResult();
			t1.setText(""+result);
			str="";
			oper="/";
			check = "2";
			
		}

		if(e.getSource()==b13)
		{
			calcResult();
			t1.setText(""+result);
			str="";
			num = result;
			oper="";
			check = "2";
			
		}
		if(e.getSource()==b15)
		{
			check ="1";
			str = str+"0";
			num = Long.parseLong(str);
			t1.setText(str);
		}
		if(e.getSource()==b16)
		{
			result = 0;
			num =0;
			t1.setText("");
			str="";
			oper="";
		}
	}
	public static void main(String args[])
	{
		Calculator c = new Calculator();
	}

}

