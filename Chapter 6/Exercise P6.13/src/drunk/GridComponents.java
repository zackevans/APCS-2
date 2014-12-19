package drunk;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class GridComponents extends JComponent
{
	public void paintComponent(Graphics g)
	{
		super.repaint();
		drawGrid(g);
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
        	g.drawLine(col*lane,0,col*lane,columnCount*lane);
        }	
	}	
	
	public static void drawCircle()
	{
		Ellipse2D.Double Circle = new Ellipse2D.Double(100,100,5,5);
	}
}
