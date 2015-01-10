import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.*;

public class CannonballComponent extends JComponent
{
	double initialV = 100;
	double angle = 45;
	
	public CannonballComponent(double iV, double A)
	{
		this.initialV = iV;
		this.angle = A;
		
	}
	public void paintComponent(Graphics g)
	{
		Cannonball ball = new Cannonball(100, 45);
		Graphics2D g2 = (Graphics2D) g; 
		ball.draw(g2);
		ball.move( g2);
	}
	
}
