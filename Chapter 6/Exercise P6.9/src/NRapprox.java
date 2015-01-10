import java.text.NumberFormat; 
import java.text.DecimalFormat; 
import java.util.*;
import java.math.*;

public class NRapprox
{
	static final double difference = 0.00005; 
	double n; 
	double x; 
	double derivative; 
	double function; 
	double xold; 
	double xnew; 
	int i; 
	
	public NRapprox(double n2, int x2) 
	{ 
	    n=n2; 
	    x=x2; 
	    function = Math.pow(n, 2)-x; 
	    derivative = 2*n; 
	    xnew=n-function/derivative; 
	    xold=0; 
	} 
	
	boolean positive() 
	{ 
	    return (n >= 0); 
	} 
	
	public double findXnew(double xold2)
	{
		function = Math.pow(xold2, 2)-x;
		derivative = 2*xold2;
		return xold2-function/derivative;
	}
	
	public void findSqrt()
	{
		i = 0;
		
		while(Math.abs(xnew-xold)> difference)
		{
			xold=xnew;
			xnew = findXnew(xold);
			i++;
			System.out.println(this);
		}
		
		System.out.println("\nIteration Completed, difference is less than 0.00005");
		
	}
	
	public String toString()
	{
		NumberFormat nf = NumberFormat.getInstance();
		DecimalFormat df = (DecimalFormat)nf;
		df.applyPattern("0.00000000");
		
		  return "The approximate value of the square root of "+x+" is " + xnew + "\n" + 
    "The number of iterations is " + i; 
	}


}
