import java.util.*;

public class PrimeGenerator
{
	static int num;
	static boolean isPrime;
	
	public PrimeGenerator(int n)
	{
		num = n;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value: ");
		num = in.nextInt();
		
		System.out.println(nextPrime(num));
	}
	public static int nextPrime(int num)
	{
		int x, y, c = 0;
		
		for( x = 2; x < num; x++ )
	    {
	      if( x % 2 != 0 || x == 2 )
	      {
	        for( y = 2; y <= x / 2; y++ )
	        {
	          if( x % y == 0 )
	          {
	            break;
	          }   
	        }
	 
	        if( y > x / 2 )
	        {
	          System.out.println( x );
	          c++;
	        }
	      }

	    }
	
		return num;
	 }
	
}
		
		


				
		
	



