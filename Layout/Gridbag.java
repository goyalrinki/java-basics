import java.awt.*;
class Gridbag
{
	public static void main(String args[])
	{
		Frame f = new Frame();
		f.setSize(400,300);
		f.setLayout(new GridBagLayout());
	
		Label l1 = new Label("Name");

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0; gbc.gridy=0;
		Insets i = new Insets(8,12,8,12);
		gbc.insets = i;
		gbc.weightx = 1.0; gbc.weighty = 1.0;
		f.add(l1,gbc);

		Label l2 = new Label("Password");
		gbc.gridy = 1;
		f.add(l2,gbc);

		TextField t1 = new TextField();
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		f.add(t1,gbc);

		TextField t2 = new TextField();
		gbc.gridy = 0;
		f.add(t2,gbc);
		
		Button b = new Button("OK");
		gbc.gridx = 0; gbc.gridy = 3;
		gbc.gridwidth = 2;
		i = new Insets(2,130,2,130);
		gbc.insets = i;
		f.add(b,gbc);

		f.setVisible(true);
	}
}
	