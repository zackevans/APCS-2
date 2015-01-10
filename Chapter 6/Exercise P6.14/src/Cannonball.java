import java.util.*;
import java.awt.Graphics2D;
import java.math.*;
import java.awt.geom.*;

public class Cannonball
{
	static double sV = 100;
	static double v = 0;
	static double a = 45;
	static double x = 0;
	static double y = 0;
	static double deltaT = 0.01;
	static double t = 0;
	static double g = 9.81;
	static double velX = 0;
	static double velY = 0;
	
	public Cannonball(double initialV, double angle) //simple calculation of position and velocity of the ball
	{
		this.sV = initialV;
		this.a = angle;
		
		velX = v * Math.cos(a); // horizontal velocity (doesn't change)
    	velY = v * Math.sin(a); // vertical velocity (changes due to gravity)
	}
	public void move( Graphics2D g2)
	{
		
		//while (y >= 0 || t == 0)
		
			t = t + deltaT;
			v = sV - (g * deltaT); // change in velocity
	    	y = y + (velY * deltaT); // change in position (y)
	    	x = x + (velX * deltaT); //change in position (x)
	    	
	    	if(t%1<=deltaT)
	    	{
	    		draw(g2);
	    	}
		
	}
	public void moveAll(Graphics2D g2)
	{
		while (y >= 0 || t ==0)
		{
			move(g2);
		}
	}
	
	public double getX() //gets (x)horizontal position of the ball
	{
		
		return x;
	}
	
	public double getY() //gets (y)vertical position of the ball
	{
		
		return y;
	}
	
	public void draw(Graphics2D g2)
	{
		Ellipse2D.Double ball = new Ellipse2D.Double(x, y, 10, 10);
		
		g2.draw(ball);
		
		moveAll(g2);
	}
	
}