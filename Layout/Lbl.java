import java.awt.*;
class Lbl
{
	public static void main(String args[])
	{
		Frame f = new Frame();
		f.setSize(300,250);
		//f.setLayout();
		

		CheckboxGroup cap = new CheckboxGroup();
		Checkbox a = new Checkbox("Ajmer  ",cap,false);
		Checkbox b = new Checkbox("Jaipur ",cap,false);
		Checkbox c = new Checkbox("Delhi  ",cap,false);
		Checkbox d = new Checkbox("Chennai",cap,false);
				
		f.add(new Label("Ques. Capital of Rajasthan..?"),"North");

		Panel p = new Panel(new GridLayout(4,1));
		Panel p1 = new Panel();
		p1.add(new Label("A. "));
		p1.add(a);
		p.add(p1);
		
		Panel p2 = new Panel();
		p2.add(new Label("B. "));
		p2.add(b);
		p.add(p2);

		Panel p3 = new Panel();
		p3.add(new Label("C. "));
		p3.add(c);
		p.add(p3);

		Panel p4 = new Panel();
		p4.add(new Label("D. "));
		p4.add(d);
		p.add(p4);

		f.add(p,"West");

		Panel pa = new Panel(new FlowLayout(FlowLayout.CENTER));
		pa.add(new Button("Prev"));
		pa.add(new Button("Next"));
		f.add(pa,"South");		

		f.setVisible(true);
	}
}

