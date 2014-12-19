package input_scanner;
import java.io.*;
import java.util.*;

public class inputscanner 
{

	public static void main(String[] args) 
	{
		Scanner kbReader = new Scanner(System.in);
		
		System.out.print("Enter integer Here: ");
		
		
		System.out.print("Enter A Sentence Here: ");
		String s=kbReader.nextLine();
		System.out.println("Your Sentence: " +s);

	}

}
