import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class Cannonball
{
	static double deltaT = 0.01;
	static double g = 9.81;
	static double t = 0;
	static double iV = 100;
	static double a = 45;
	static double Vy = 0;
	static double Vx = 0;
	static double x = 0;
	static double y = 0;
	
	public Cannonball(double ivel, double ang)
	{
		this.iV = ivel;
		this.a = ang;
		Vy = iV * Math.sin(a);
		Vx = iV * Math.cos(a);
	}
	
	public void move()
	{
			t = t + deltaT;
			Vy = Vy - (g * deltaT);
			x = x + (Vx * deltaT);
			y = y + (Vy * deltaT);
	}
	
	public void drawAll(Graphics2D g2)
	{
		int i = 0;
		
		while(y >= 0)
		{
			move();
			
			if(i%100 == 0)
			{
				draw(g2);
			}
			i++;
		}
	}
	
	public void draw(Graphics2D g2)
	{
		Ellipse2D.Double ball = new Ellipse2D.Double(x, y, 5, 5);
		g2.draw(ball);
		g2.fill(ball);
	}
}
