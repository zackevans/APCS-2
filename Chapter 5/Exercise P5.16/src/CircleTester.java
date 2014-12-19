import java.awt.*;
import javax.swing.*;
import java.util.*;


public class CircleTester 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		JFrame Frame = new JFrame();
		
		System.out.println("Enter X cordinate: ");
		int px = reader.nextInt();
		System.out.println("Enter Y cordinate: ");
		int py = reader.nextInt();
		Circle newCircle = new Circle(px, py);
		
		Frame.setSize(400, 400);
		Frame.setTitle("Circle Window");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.add(newCircle);
		Frame.setVisible(true);
	}

}




                                                                