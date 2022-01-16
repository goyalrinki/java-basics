import java.awt.*;
class Calc
{
	public static void main(String args[])
	{
		Frame f = new Frame();
		f.setSize(300,400);
		f.setLayout(new GridLayout(5,1));

		f.add(new TextField(""));

		Panel p1 = new Panel(new GridLayout(1,4));
		for(int i=1; i<=3; i++)
			p1.add(new Button(""+i));
		p1.add(new Button("+"));
		f.add(p1);

		Panel p2 = new Panel(new GridLayout(1,4));
		for(int i=4; i<=6; i++)
			p2.add(new Button(""+i));
		p2.add(new Button("-"));
		f.add(p2);

		Panel p3 = new Panel(new GridLayout(1,4));
		for(int i=7; i<=9; i++)
			p3.add(new Button(""+i));
		p3.add(new Button("*"));
		f.add(p3);
		
		Panel p4 = new Panel(new GridLayout(1,4));
		p4.add(new Button("c"));
		p4.add(new Button("0"));
		p4.add(new Button("/"));
		p4.add(new Button("="));
		f.add(p4);

		f.setVisible(true);
	}
}

