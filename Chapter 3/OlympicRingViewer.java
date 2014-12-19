import javax.swing.JFrame;

public class OlympicRingViewer {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OlympicRingsComponent component = new OlympicRingsComponent();
		frame.add(component);
		frame.setVisible(true);
	}

}
