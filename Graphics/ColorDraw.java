import java.awt.*;
import java.awt.event.*;

class ColorDraw extends Frame implements MouseMotionListener
{
	Frame f;
	int x,y,x1,y1;
	public ColorDraw()
	{
		f = new Frame();
		f.setSize(400,400);
		f.addMouseMotionListener(this);
		f.setVisible(true);
	}
	public void mouseMoved(MouseEvent e1)
	{
		x1 = 0;
		y1=0;
		
		
	}
	public void mouseDragged(MouseEvent e2)	{
		x= e2.getX();
		y= e2.getY();
		if((x1 ==0)&&(y1==0))
		{
			x1 = x;
			y1 = y;
		}
		draw();
		x1 = x;
		y1 = y;
		
}

	public void draw()
	{
		Graphics g = f.getGraphics();
		g.setColor(Color.red);
		g.drawLine(x,y,x1,y1);
	}
	
	public static void main(String args[])
	{
		ColorDraw cd = new ColorDraw();
	}
}	