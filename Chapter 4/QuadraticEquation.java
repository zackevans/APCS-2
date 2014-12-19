import java.util.*;
import java.math.*;

public class QuadraticEquation
{
	static double x;

	public static void main(String[] args)
	{
		Scanner In = new Scanner(System.in);
		//Gets coefficients
		System.out.print("Enter the coefficient for a: ");
		double a = In.nextDouble();
		System.out.print("Enter the coefficient for b: ");
		double b = In.nextDouble();
		System.out.print("Enter the coefficient for c: ");
		double c = In.nextDouble();
		System.out.printf("x1 = %f x2 = %f", getSolution1(a,b,c), getSolution2(a,b,c));
		
		
		
		
		
	}
	public static double getSolution1(double a, double b, double c)
	{
		x = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
		return x;
	}
	public static double getSolution2(double a, double b, double c)
	{
		x = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
		return x;
	}
}
