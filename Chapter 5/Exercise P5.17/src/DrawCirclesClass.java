import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;



public class DrawCirclesClass extends JComponent
{
	double r1;
	double r2;

	public DrawCirclesClass (double r1, double r2)
	{
		this.r1 = r1;
		this.r2 = r2;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;	
		Ellipse2D.Double Circle = new Ellipse2D.Double(100-r1, 200-r1, r1*2, r1*2);
		Ellipse2D.Double Circle2 = new Ellipse2D.Double(200-r2, 100-r2, r2*2, r2*2);
		g2.draw(Circle);
		g2.draw(Circle2);
		
		if (r2+r1 > 141.4214)
		{
			g2.setColor(Color.green);	
		}
		
		else
		{
			g2.setColor(Color.RED);
		}
		
		g2.draw(Circle);
		g2.draw(Circle2);
		
	}
}
