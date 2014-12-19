import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.Graphics;

public class OlympicRings {
	private int x, y, radius;
	Color col[] = {Color.BLUE, Color.BLACK, Color.RED, Color.YELLOW, Color.GREEN};
	
	public OlympicRings (int x, int y, int ra){
		this.x = x;
		this.y = y;
		this.radius = ra;			
	}
	public void draw (Graphics2D g2){
		int step = radius;
		
		for (int i = 0; i <= 2; i++){
			Ellipse2D.Double circ = new Ellipse2D.Double(
				x+(step*i), y,
				radius, radius);
			g2.setColor(col[i]);
			g2.fill(circ);
			g2.draw(circ);
			Ellipse2D.Double circInner = new Ellipse2D.Double(
					x+(step*i)+10, y+10,
					(radius-20), (radius-20));
			g2.setColor(Color.WHITE);
			g2.fill(circInner);
			g2.draw(circInner);
			
			
					
			
				
			
		}
		for (int i = 0; i <= 1; i++)
		{
			g2.setStroke(new BasicStroke(10));
			
			Ellipse2D.Double circ = new Ellipse2D.Double(
					x+(step*i)+(step/2)+(10*i), y + (step/2),
					radius, radius);
			g2.setColor(col[i+3]);
			g2.draw(circ);
		}
    }
}
