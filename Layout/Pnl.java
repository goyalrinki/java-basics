import java.awt.*;
class Pnl
{
	public static void main(String args[])
	{
		Frame f = new Frame();
		f.setSize(300,300);
		f.setLayout(new GridLayout(2,2,2,2));

		Panel p1 = new Panel(new GridLayout(2,1,2,2));
		p1.add(new Button("1"));
		p1.add(new Button("2"));
		f.add(p1);
		
		Panel p2 = new Panel(new GridLayout(1,3,2,2));
		p2.add(new Button("3"));
		p2.add(new Button("4"));
		p2.add(new Button("5"));
		f.add(p2);

		Panel p3 = new Panel(new GridLayout(1,2,2,2));
		Panel p4 = new Panel(new GridLayout(2,1,2,2));
		p4.add(new Button("6"));
		p4.add(new Button("7"));
		p3.add(p4);
		Panel p5 = new Panel(new GridLayout(3,1,2,2));
		p5.add(new Button("8"));
		p5.add(new Button("9"));
		p5.add(new Button("10"));
		p3.add(p5);
		f.add(p3);

		Panel p6 = new Panel(new GridLayout(2,1,2,2));
		Panel p7 = new Panel(new GridLayout(1,2,2,2));
		p7.add(new Button("11"));
		p7.add(new Button("12"));
		p6.add(p7);
		Panel p8 = new Panel(new GridLayout(1,3,2,2));
		p8.add(new Button("13"));
		p8.add(new Button("14"));
		p8.add(new Button("15"));
		p6.add(p8);
		f.add(p6);

		f.setVisible(true);
	}
}

