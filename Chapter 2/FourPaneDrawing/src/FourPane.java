import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class FourPane 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawBox component = new DrawBox();
		frame.add(component);
		
		frame.setVisible(true);

	}

}
