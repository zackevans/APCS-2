import java.awt.Rectangle;


public class PrimeterTester 
{

	public static void main(String[] args) 
	{
		Rectangle box = new Rectangle(5,10,20,30);
		double width = box.getWidth();
		double height = box.getHeight();
		
		double finalnum = (width*2)+(height*2);
		System.out.print("Answer: ");
		System.out.println(finalnum);

	}

}
