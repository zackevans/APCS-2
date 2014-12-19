import java.util.*;
import java.util.Random;

public class RootAprox 
{
	public static void main(String[] args) 
	{
		Scanner IN = new Scanner(System.in);
		System.out.print("Enter Number: ");
		double a = IN.nextDouble();
		double guess = 1;
		double x=1;
		double actGuess = Math.sqrt(a);
		double aX =1;
		
		while (Math.abs(aX-x) >=.01)
		{
			aX = a/x;
			x = aX+x/2;
			
			System.out.println(x);
			x++;
		}
	}

}
