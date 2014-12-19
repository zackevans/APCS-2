
import javax.swing.JFrame;

public class FaceViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setTitle("An Alien Face");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Drawingwindow component = new Drawingwindow();
      frame.add(component);

      frame.setVisible(true);
   }
}