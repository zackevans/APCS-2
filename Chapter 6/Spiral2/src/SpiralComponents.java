import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;


public class SpiralComponents extends JComponent 
{
	public void paintComponent(Graphics g)
	{
		//drawGrid(g);
		drawSpiral(g);
	}
	
	public void drawSpiral(Graphics g)
	{
		int [] myArray = {360,60,360,340,
						  360,340,40,340};
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.MAGENTA);
		
		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;
		
		for (int i= 0; i<2; i++)
		{
			g2.drawLine(myArray[i+a],myArray[i+b],myArray[i+c],myArray[i+d]);
			a = a + 3;
			b = b + 3;
			c = c + 3;
			d = d + 3;
		}
		
	}
}


//g2.drawLine(360,60, 360, 340);
//g2.drawLine(360, 340, 40, 340);
//g2.drawLine(40, 340, 40, 60);
//g2.drawLine(40, 60, 340, 60);
//g2.drawLine(340, 60, 340, 320);
//g2.drawLine(340, 320, 60, 320);
//g2.drawLine(60, 320, 60, 80);
//g2.drawLine(60, 80, 320, 80);
//g2.drawLine(320, 80, 320, 300);
//g2.drawLine(320, 300, 80, 300);
//g2.drawLine(80, 300, 80, 100);
//g2.drawLine(80, 100, 300, 100);
//g2.drawLine(300, 100, 300, 280);
//g2.drawLine(300, 280, 100, 280);
//g2.drawLine(100, 280, 100, 120);
//g2.drawLine(100, 120, 280, 120);
//g2.drawLine(280, 120, 280, 260);
//g2.drawLine(280, 260, 120, 260);
//g2.drawLine(120, 260, 120, 140);
//g2.drawLine(120, 140, 260, 140);
//g2.drawLine(260, 140, 260, 240);
//g2.drawLine(260, 240, 140, 240);
//g2.drawLine(140, 240, 140, 160);
//g2.drawLine(140, 160, 240, 160);
//g2.drawLine(240, 160, 240, 220);
//g2.drawLine(240, 220, 160, 220);
//g2.drawLine(160, 220, 160, 180);
//g2.drawLine(160, 180, 220, 180);
//g2.drawLine(220, 180, 220, 200);
//g2.drawLine(220, 200, 180, 200);