import java.util.*;
import java.io.*;

public class Letter 
{
	static Scanner KBR = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		String[] myLetter = Letter();
		String MyText = addLine();
		String MyText2 = addLine();
		
		
		for (int i = 0; i < myLetter.length; i++) 
		{
			if (i == 0)
			{
				System.out.println("Dear, " + myLetter[i] );
				System.out.println(MyText);
				System.out.println(MyText2);
			}
			
			else System.out.println("Sincerely, " + myLetter[i]  );
			
		}
		
		
	}


	public static String[] Letter ()
	{
		System.out.print("To: ");
		String To = KBR.next();
		System.out.print("From: ");
		String From = KBR.next();
		
		//System.out.println("To: " + To);
		//System.out.println("From: " + From);
		
		String[] returnvar = {To,From};
		
		return returnvar;
	}
	
	public static String addLine ()
	{
		
		System.out.print("Text: ");
		String Line = KBR.next();
		
		return Line;
	}
	
	
}
