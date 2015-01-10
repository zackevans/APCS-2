package drunk;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class GridComponents extends JComponent
{
	public void paintComponent(Graphics g)
	{
		//super.repaint();
		drawGrid(g);
		drawDot(g);
	}
	
	public static void drawGrid(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
	        int lane = 20;
	        int rowCount = 20;
	        int columnCount = 20;
			
		for (int row = 0; row < rowCount; row++)
		{
			g2.drawLine(0, row*lane, rowCount*lane, row*lane);
		}
				
	        for (int col = 0; col < columnCount; col++)
	        {
	        	g2.drawLine(col*lane,0,col*lane,columnCount*lane);
	        }	
	}
	
	public void drawDot (Graphics g)
	{	
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(200,200,5,5);
		int xcord = 200;
		int ycord = 200;
		
		for (int i = 0; i<100; i++)
		{
			Random rn = new Random();
			int movenum = rn.nextInt(4) + 1;
			if (movenum == 1){
				xcord = xcord+20;
			}
			if (movenum == 2){
				ycord = ycord +20;
			}
			if (movenum == 3){
				xcord = xcord -20;
			}
			if (movenum == 4){
				ycord = ycord -20;
			}
			
			circle.y = ycord;
			circle.x = xcord;
			g2.fill(circle);
			g2.draw(circle);
		}	
	}
	
	public void getDirection()
	{
		Random rn = new Random();
		
		for (int i =0; i<10;i++)
		{
			int answer = rn.nextInt(4) + 1;
		   	System.out.println(answer);
		}  	
	}
}
