

public class Balloon 
{

	public static void main(String[] args) 
	{
		double balloon = 0;
		
		for (int i = 0;i<3;i++)
		{
			double radius = getRadius(balloon);
			System.out.printf("Surface Area: %f\n",getSurfaceArea(radius));
			System.out.printf("Volume: %f\n",getVolume(radius));
			balloon = addAir(balloon);
		}
	}
	
	public static double addAir (double balloon)
	{
		return balloon + 100;
	}
	
	public static double getRadius (double Volume)
	{
		return 3*Volume/4*Math.PI;
	}
	
	public static double getSurfaceArea (double radius)
	{
		return 4*Math.PI*Math.pow(radius, 2);
	}
	
	public static double getVolume (double Radius)
	{
		return 4/3*Math.PI*Math.pow(Radius,3);
	}

}
