import java.util.*;

public class Cannonball
{
	static double deltaT = 0.01;
    static double g = 9.81;
    static double t = 0d;
    static double iV = 0d;
    static double v;
    static double y = 0d;

    public static void main(String[] args)
    {
    	Scanner s = new Scanner(System.in);
        System.out.print("initial velocity = ");
        iV = s.nextDouble();
        v=iV;
        System.out.println("Simulated"+"\t\t"+"Calculus");
        
        while (y >= 0 || t == 0)
        {
        	t = t + deltaT;
            v = v - (g * deltaT); // change in velocity
            y = y + (v * deltaT); // change in position
                        
            if(t%1<=deltaT)
            {
            	System.out.println(y+"\t"+doCalc(t));
            }
        }
    }

    	public static double doCalc(double t)
    	{
                return -0.5 * g * t * t + iV * t;
        }
}