import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.EventQueue; 
import javax.swing.JComponent;
import javax.swing.JFrame;

	public class Spiral3 extends JComponent
	{
		int length;
		public Spiral3 (int aL){
		this.length = aL;
	}

	public static void main (String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new JFrame();
				frame.setSize(800,800);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new Spiral3(500));
				frame.setVisible(true);
			}
		});
		
	}
	
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		drawSp(500, (int)500/15, (Graphics2D)g);
	}
	
	public void drawSp( int length, int lane, Graphics2D g)
	{
		for (int i = 0; i * lane < length / 2; i++)
		{
			if((i+1)*lane < length / 2)
			{
				g.drawLine(lane*i, length-((i+1)*lane), length-(lane*i), length-((i+1)*lane));
				g.drawLine(lane*i, length-((i+1)*lane), i*lane, i*lane);
			}
		
			else
			{
				g.drawLine(lane*i, length - ((i+1)*lane), length-(lane*i), length-((i+1)*lane));
			}
		}
				
			for(int b = 0; b*lane < length/2; b++)
			{
				g.drawLine(length - (lane *b), (b-1)*lane, (b-1)*lane, (b-1)*lane);
			
	
				if((b+1)*lane < length/2)
				{		
					g.drawLine(length-(lane*b), (b-1)*lane, length-(lane*b), length-((b+1)*lane));
				}
	
				else
				{
					g.drawLine(length-(lane*b), (b-1)*lane, length-(lane*b), length-((b+1)*lane));
				}	
				
			}	
	}
			
}

