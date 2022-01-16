import java.awt.*;
import java.awt.event.*;
class Cardl implements ActionListener
{

	Frame f;
	TextField t;
	Button b1,b2;
	Panel p1,p2,p3,p4,p5,p6;
	CardLayout cl;
	GridBagConstraints gbc;
	//Panel p; 

	public Cardl()
	{
		f = new Frame();
		f.setSize(400,300);
		f.setLayout(new BorderLayout());
	
		p1 = new Panel();
		b1 = new Button("Prev");
		p1.add(b1);
		b1.addActionListener(this);
		b2 = new Button("Next");
		p1.add(b2);
		b2.addActionListener(this);
		f.add(p1,"South");
	
		cl = new CardLayout();

		p2 = new Panel();
		p2.setLayout(cl);

		p3 = new Panel(new GridBagLayout());
		p4 = new Panel(new GridBagLayout());
		p5 = new Panel(new GridBagLayout());
		p6 = new Panel(new GridBagLayout());

		gbc = new GridBagConstraints();

		Label l1 = new Label("Name");
		gbc.gridx=0; gbc.gridy=0;
		Insets i = new Insets(8,12,8,12);
		gbc.insets = i;
		gbc.weightx = 1.0; gbc.weighty = 1.0;
		p3.add(l1,gbc);

		Label l5 = new Label("H. No.");
		p4.add(l5,gbc);

		Label l9 = new Label("Phone");
		p5.add(l9,gbc);

		Label l13 = new Label("Salary");
		p6.add(l13,gbc);

		Label l2 = new Label("Surname");
		gbc.gridy = 1;
		p3.add(l2,gbc);
		
		Label l6 = new Label("Colony");
		p4.add(l6,gbc);

		Label l10 = new Label("Mobile");
		p5.add(l10,gbc);

		Label l14 = new Label("H.R.A.");
		p6.add(l14,gbc);

		Label l3 = new Label("Age");
		gbc.gridy = 2;
		p3.add(l3,gbc);

		Label l7 = new Label("City");
		p4.add(l7,gbc);

		Label l11 = new Label("Email");
		p5.add(l11,gbc);

		Label l15 = new Label("T.A.");
		p6.add(l15,gbc);
	
		Label l4 = new Label("Qualification");
		gbc.gridy = 3;
		p3.add(l4,gbc);

		Label l8 = new Label("Qualification");
		p4.add(l8,gbc);

		Label l12 = new Label("Fax");
		p5.add(l12,gbc);

		Label l16 = new Label("D.A.");
		p6.add(l16,gbc);

		TextField t1 = new TextField();
		gbc.gridx = 1;	gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		p3.add(t1,gbc);

		TextField t5 = new TextField();
		p4.add(t5,gbc);

		TextField t9 = new TextField();
		p5.add(t9,gbc);

		TextField t13 = new TextField();
		p6.add(t13,gbc);

		TextField t2 = new TextField();
		gbc.gridy = 1;
		p3.add(t2,gbc);

		TextField t6 = new TextField();
		p4.add(t6,gbc);

		TextField t10 = new TextField();
		p5.add(t10,gbc);

		TextField t14 = new TextField();
		p6.add(t14,gbc);
	
		TextField t3 = new TextField();
		gbc.gridy = 2;
		p3.add(t3,gbc);

		TextField t7 = new TextField();
		p4.add(t7,gbc);

		TextField t11 = new TextField();
		p5.add(t11,gbc);

		TextField t15 = new TextField();
		p6.add(t15,gbc);

		TextField t4 = new TextField();
		gbc.gridy = 3;
		p3.add(t4,gbc);

		TextField t8 = new TextField();
		p4.add(t8,gbc);

		TextField t12 = new TextField();
		p5.add(t12,gbc);

		TextField t16 = new TextField();
		p6.add(t16,gbc);

		p2.add(p3);
		p2.add(p4);
		p2.add(p5);
		p2.add(p6);
	
		f.add(p2,"Center");
		
	
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(p3.isVisible())
		{
			if(e.getSource()==b1)
				cl.first(p2);
			else
				cl.next(p2);
		}
		else if(p6.isVisible())
		{
			if(e.getSource()==b1)
				cl.previous(p2);
			else
				cl.last(p2);
		}
		else
		{
			if(e.getSource()==b1)
				cl.previous(p2);
			else
				cl.next(p2);
		}
			
	}
	
	public static void main(String args[])
	{
		Cardl crd = new Cardl();
	}

}