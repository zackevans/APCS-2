import java.io.Console;
import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Find the sqaure root of?: ");
		
		int a = in.nextInt();
		
		NRapprox nr = new NRapprox(5, a);
		
		nr.findSqrt();
	}

}
