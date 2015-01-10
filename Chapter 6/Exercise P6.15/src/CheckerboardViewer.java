import javax.swing.JFrame;

public class CheckerboardViewer
{
	static int Frame_Width = 335;
	static int Frame_Height = 370;
	
	public static void main(String [] args)
	{
		final JFrame frame = new JFrame();
		
		//lane dimensions: 40, 40
		
		frame.setSize(Frame_Width, Frame_Height);
		frame.setTitle("P6.15");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CheckerboardComponent component = new CheckerboardComponent();
		frame.add(component);
		
		
		frame.setVisible(true);
	}

}
