package drunk;

import java.awt.Graphics;
import java.awt.geom.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class RandomWalk 
{	
	final static int  WINDOW_WIDTH = 420;
	final static int WINDOW_HEIGHT = 430;
	
	
	public static void main(String[] args) 
	{	
		final JFrame frame = new JFrame("Drunk Test");
		frame.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		final GridComponents gc = new GridComponents();
		
		SwingUtilities.invokeLater(new Runnable() 
		{
		    public void run() 
		    {
		    	frame.getContentPane().add(new GridComponents());
		    	frame.setVisible(true);
		    }
		});
	}
}

