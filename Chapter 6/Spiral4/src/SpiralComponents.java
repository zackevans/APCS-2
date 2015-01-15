import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JComponent;


public class SpiralComponents extends JComponent 
{
	int laneWidth = 20;
	
	public void paintComponent(Graphics g)
	{
		//drawGrid(g);
		drawSpiral(g);
	}
	
	public void drawSpiral(Graphics g)
	{
		 Graphics2D g2 = (Graphics2D) g;
		 
		 
	}
	
	public String getDirection()
	{
		String [] Driection = {"Down,Left,Up,Right"};
		for (int i = 0; i<4;i++)
		{
			 
		}
	}

}
