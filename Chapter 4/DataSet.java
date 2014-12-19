import java.util.*;

public class DataSet 
{
	
	static int myMin, myMax;
	
	public DataSet()
	{
	    myMin = 0;
	    myMax = 0;
	}
	public static void addValue(int x)
	{
		if (x > myMax)
		{
			myMax = x;
		}
		if (x <= myMin )
		{
			myMin = x;
		}
		
	}
	public static int getLargest()
	{
		return myMax;
	}
	public static int getSmallest()
	{
		return myMin;
	}
	public static void main(String[] args)
	{
		Scanner In = new Scanner(System.in);
		int number;
	
		for (int i = 0; i <= 4; i++)
		{
			System.out.print("Enter number: ");
			number = In.nextInt();
			addValue(number);
		}
		
		getSmallest();
		getLargest();
		
		System.out.printf("Min: %d ",myMin);
		System.out.printf("Max: %d", myMax);
		
	}

}
