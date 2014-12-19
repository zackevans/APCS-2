import java.io.*;
import java.util.*;

public class Soda 
{
	public static void main(String[] args) 
	{
		Scanner KBR = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		double Radius = KBR.nextDouble();
		System.out.print("Enter Height: ");
		double Height = KBR.nextDouble();
		
		System.out.printf("Volume: %.2f\n",getVolume(Radius,Height));
		System.out.printf("Surface7 Area: %.2f",getSurfaceArea(Radius,Height));
	}
	
	public static double getVolume(double Radius,double Height)
	{
		return Math.PI*(Math.pow(Radius, 2))*Height;
	}
	
	public static double getSurfaceArea (double Radius,double Height)
	{
		return 2*(Math.PI)*Radius*Height + 2*(Math.PI)*(Math.pow(Radius, 2));
	}
	
	

}
