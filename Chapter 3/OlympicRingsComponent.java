import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class OlympicRingsComponent extends JComponent {
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
	    OlympicRings olyring = new OlympicRings(60, 60, 200);
	    olyring.draw(g2);
	    
	
	}

}
