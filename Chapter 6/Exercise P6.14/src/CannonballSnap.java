import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


/**
   This is a driver for taking a screen snapshot 
   of the CannonballComponent class.
*/
public class CannonballSnap
{
	
	final static JFrame frame = new JFrame();
	static double ivel = 100;

     static double ang = 45;
   public static void main(String[] args)
   {
      

      final  int FRAME_WIDTH = 700;
      final  int FRAME_HEIGHT = 700;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("P6.14");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     

      
      
      SwingUtilities.invokeLater(new Runnable()
      {
    	  public void run()
    	  {
    		  CannonballComponent component = new CannonballComponent(ivel, ang);
    	      frame.getContentPane().add(component);
    		  frame.setVisible(true);
    	  }
      });
      
   }
}
