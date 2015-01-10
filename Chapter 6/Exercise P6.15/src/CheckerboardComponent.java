import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CheckerboardComponent extends JComponent
{
	private int x = 0;
	private int y = 0;
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Checkerboard cb1 = new Checkerboard(x, y);  
	    cb1.drawRow1(g2);  
	 
	    Checkerboard cb2 = new Checkerboard(x, y + 40);  
	    cb2.drawRow2(g2);  
	  
	    Checkerboard cb3 = new Checkerboard(x, y + 80);  
	    cb3.drawRow1(g2);  
	  
        Checkerboard cb4 = new Checkerboard(x, y + 120);  
	    cb4.drawRow2(g2);  
	  
	    Checkerboard cb5 = new Checkerboard(x, y + 160);  
	    cb5.drawRow1(g2);  
	  
	    Checkerboard cb6 = new Checkerboard(x, y + 200);  
	    cb6.drawRow2(g2);  
	  
	    Checkerboard cb7 = new Checkerboard(x, y + 240);  
        cb7.drawRow1(g2);  
	  
	    Checkerboard cb8 = new Checkerboard(x, y + 280);  
	    cb8.drawRow2(g2);  
	    
	}
	
}
