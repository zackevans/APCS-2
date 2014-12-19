import java.util.*;
import java.io.*;

public class RoundNum 
{
	public static void main(String[] args) 
	{
		Scanner IN = new Scanner(System.in);
		
		System.out.print("Enter Num: ");
		double num1 = IN.nextDouble();
		System.out.print("Enter Num: ");
		double num2 = IN.nextDouble();
		
		double numcheck = num1- num2;
		numcheck = Math.abs(numcheck);
		
		if (numcheck < .5)
		{
			System.out.print("Number is same when rounded to .2");
			
			if (numcheck < .01)
			{
				System.out.print("Num is within .01");
			}
		}
		
		else 
		{
			System.out.println("Bitch you Gussing");
			System.out.print("Num is not within .01");
		}
	}

}
