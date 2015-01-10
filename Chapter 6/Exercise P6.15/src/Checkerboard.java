import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class Checkerboard
{
	private int xCord;
	private int yCord; 
	
	public Checkerboard(int x, int y)
	{
		this.xCord = x;
		this.yCord = y;
	}
	
	public void drawRow1(Graphics2D g2)
	{ 
        Rectangle bodyBlack1 = new Rectangle(xCord + 40, yCord, 40, 40);  
        Rectangle bodyBlack2 = new Rectangle(xCord + 120, yCord, 40, 40);  
        Rectangle bodyBlack3 = new Rectangle(xCord + 200, yCord, 40, 40);  
        Rectangle bodyBlack4 = new Rectangle(xCord + 280, yCord, 40, 40);  
        
        Rectangle bodyWhite1 = new Rectangle(xCord, yCord, 40, 40);  
        Rectangle bodyWhite2 = new Rectangle(xCord + 80, yCord, 40, 40);  
        Rectangle bodyWhite3 = new Rectangle(xCord + 160, yCord, 40, 40);  
        Rectangle bodyWhite4 = new Rectangle(xCord + 240, yCord, 40, 40);  
		

        g2.setColor(Color.black);  
        g2.draw(bodyBlack1);  
        g2.fill(bodyBlack1);  
   
        g2.setColor(Color.black);  
        g2.draw(bodyBlack2);  
        g2.fill(bodyBlack2);  
   
        g2.setColor(Color.black);  
        g2.draw(bodyBlack3);  
        g2.fill(bodyBlack3);  
  
        g2.setColor(Color.black);  
        g2.draw(bodyBlack4);  
        g2.fill(bodyBlack4);  
  
        g2.setColor(Color.white);  
        g2.fill(bodyWhite1);  
        g2.draw(bodyWhite1);  
        
        g2.setColor(Color.white);  
        g2.fill(bodyWhite2);  
        g2.draw(bodyWhite2);  
  
        g2.setColor(Color.white);  
        g2.fill(bodyWhite3);  
        g2.draw(bodyWhite3);  
  
        g2.setColor(Color.white);  
        g2.fill(bodyWhite4);  
        g2.draw(bodyWhite4);  
  
	}
	
	public void drawRow2(Graphics2D g2)
	{ 
        Rectangle bodyWhite1 = new Rectangle(xCord + 40, yCord, 40, 40);  
        Rectangle bodyWhite2 = new Rectangle(xCord + 120, yCord, 40, 40);  
        Rectangle bodyWhite3 = new Rectangle(xCord + 200, yCord, 40, 40);  
        Rectangle bodyWhite4 = new Rectangle(xCord + 280, yCord, 40, 40);  
    
        Rectangle bodyBlack1 = new Rectangle(xCord, yCord, 40, 40);  
        Rectangle bodyBlack2 = new Rectangle(xCord + 80, yCord, 40, 40);  
        Rectangle bodyBlack3 = new Rectangle(xCord + 160, yCord, 40, 40);  
        Rectangle bodyBlack4 = new Rectangle(xCord + 240, yCord, 40, 40);  
  
        g2.setColor(Color.black);  
        g2.draw(bodyBlack1);  
        g2.fill(bodyBlack1);  
   
        g2.setColor(Color.black);  
        g2.draw(bodyBlack2);  
        g2.fill(bodyBlack2);  
   
        g2.setColor(Color.black);  
        g2.draw(bodyBlack3);  
        g2.fill(bodyBlack3);  
   
        g2.setColor(Color.black);  
        g2.draw(bodyBlack4);  
        g2.fill(bodyBlack4);  
  
        g2.setColor(Color.white);  
        g2.fill(bodyWhite1);  
        g2.draw(bodyWhite1);  
  
        g2.setColor(Color.white);  
        g2.fill(bodyWhite2);  
        g2.draw(bodyWhite2);  
  
        g2.setColor(Color.white);  
        g2.fill(bodyWhite3);  
        g2.draw(bodyWhite3);  
  
        g2.setColor(Color.white);  
        g2.fill(bodyWhite4);  
        g2.draw(bodyWhite4);  
  
	}
}
