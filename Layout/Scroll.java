import java.awt.*;
import java.awt.event.*;
class Scroll implements AdjustmentListener
{
	Frame f;
	Panel p1,p2;
	Scrollbar s1, s2, s3;
	TextField t1, t2, t3;
	Color myColor;
	int rValue, gValue, bValue;
	
	public Scroll()
	{

		f = new Frame();
		f.setSize(500,700);
		f.setLayout(new BorderLayout());

		p1 = new Panel(new GridLayout(1,3,2,2));
		s1 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		s1.setBackground(Color.red);
		s1.addAdjustmentListener(this);
		s2 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		s2.setBackground(Color.green);
		s2.addAdjustmentListener(this);
		s3 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		s3.setBackground(Color.blue);
		s3.addAdjustmentListener(this);
		p1.add(s1);
		p1.add(s2);
		p1.add(s3);
		f.add(p1,"East");

		p2 = new Panel();
		Label l1 = new Label("Red");
		t1 = new TextField(5);
		Label l2 = new Label("Green");
		t2 = new TextField(5);
		Label l3 = new Label("Blue");
		t3 = new TextField(5);
		p2.add(l1);
		p2.add(t1);
		p2.add(l2);
		p2.add(t2);
		p2.add(l3);
		p2.add(t3);
		f.add(p2,"South");

		

		f.setVisible(true);
	}

	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		if(e.getSource() == s1)
		{
			rValue = s1.getValue();
			t1.setText(rValue + "");
			myColor = new Color(rValue, gValue, bValue);
			f.setBackground(myColor);
		}
		if(e.getSource() == s2)
		{
			gValue = s2.getValue();
			t2.setText(gValue + "");
			myColor = new Color(rValue, gValue, bValue);
			f.setBackground(myColor);
		}
		if(e.getSource() == s3)
		{
			bValue = s3.getValue();
			t3.setText(bValue + "");
			myColor = new Color(rValue, gValue, bValue);
			f.setBackground(myColor);
		}
	}

	public static void main(String args[])
	{
		Scroll sc = new Scroll();
	}
}

