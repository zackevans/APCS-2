import java.util.*;
import java.io.*;

public class intread 
{
	public static void main(String[] args) 
	{
		Scanner IN = new Scanner(System.in);
		System.out.print("Enter Numbers: ");
		String s = IN.next();
		
		for(int i = s.length()-1; i > -1; i--) 
		{  
			System.out.println(s.charAt(i));  
		} 
	}
}
