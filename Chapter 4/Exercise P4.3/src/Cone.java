
public class Cone 
{
	public static void main(String[] args)
	{
		double coneVolume = coneVolume(2,4);
		double coneSurfaceArea = coneSurface(2,4);
		System.out.print("Volume: ");
		System.out.printf("%.2f",coneVolume);
		System.out.println("");
		System.out.print("Surface Area: "); 
		System.out.printf("%.2f",coneSurfaceArea);
	
		
	}
	
	public static double coneVolume(double radius, double height) 
	{
	    double volume = Math.PI * Math.pow(radius, 2)* height/3;
	    return volume;
	}

	public static double coneSurface(double radius, double height) 
	{
	    double surface = Math.PI * radius * (radius + Math.pow(( Math.pow(radius, 2.0) + Math.pow(height, 2.0)), .5));
	    return surface;
	}

	
	
	

}
