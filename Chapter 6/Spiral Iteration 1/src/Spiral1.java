import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Spiral1 
{
	final static int  WINDOW_WIDTH = 420;
	final static int WINDOW_HEIGHT = 430;
	
	public static void main(String[] args) 
	{
		final JFrame frame = new JFrame("Spiral");
		frame.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SwingUtilities.invokeLater(new Runnable() 
		{
		    public void run() 
		    {
		    	frame.getContentPane().add(new SpiralComponents());
		    	frame.setVisible(true);
		    }
		});
	}

}
