import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Circle extends JComponent
{
	int x;
	int y;

	public Circle(int X, int Y)
	{
		x = X;
		y = Y;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;	
		Ellipse2D.Double Circle = new Ellipse2D.Double(20, 20, 200, 200);
				
		g2.draw(Circle);
		
		if (Circle.contains(x, y))
		{
			g2.setColor(Color.green);	
		}
		
		else
		{
			g2.setColor(Color.RED);
		}
		
		Ellipse2D.Double Circle2 = new Ellipse2D.Double(x, y, 5, 5);
		g2.draw(Circle2);
	}
}

