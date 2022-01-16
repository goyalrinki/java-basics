import java.awt.*;
import java.awt.event.*;

class ColorLine extends Frame implements MouseMotionListener
{
	Frame f;
	int x,y;
	//Graphics g;
	public ColorLine()
	{
		f = new Frame();
		f.setSize(400,400);
		f.addMouseMotionListener(this);
		f.setVisible(true);
	}
	public void mouseMoved(MouseEvent e1)
	{
		
		x= e1.getX();
		y= e1.getY();
		draw();
		
	}
	public void mouseDragged(MouseEvent e2)	{}

	public void draw()
	{
		Graphics g = f.getGraphics();
		g.setColor(Color.red);
		g.drawLine(0,0,x,y);
		g.setColor(Color.green);
		g.drawLine(399,0,x,y);
		g.setColor(Color.blue);
		g.drawLine(399,399,x,y);
		g.setColor(Color.yellow);
		g.drawLine(0,399,x,y);
	}
	
	public static void main(String args[])
	{
		ColorLine cl = new ColorLine();
	}
}	