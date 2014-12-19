
public class Line 
{
	static double m;
	static double b;
	
	//Cases
	
	public Line(double x, double y, double m) //(x,y) slope m
	{
		this.m=m;
		b = y - m*x;
	}
	
	public Line(double x1, double y1, double x2, double y2) //(x1,y1)(x2,y2)
	{
		m = (y2-y1)/(x2-x1);
		b = y1 - m*x1;
	}
	
	public Line(double m, double b) // y = m*x +b
	{
		this.m=m;
		this.b=b;
	}
	
	public Line(double a) // x = a
	{
		boolean isVertical = true;
	}
	
	public static void main(String[] args)
	{
		Line line1 = new Line(5);
		Line line2 = new Line(1,1);
		Line line3 = new Line(1,2,3);
		Line line4 = new Line(1,2,3,4);
		
		boolean equalsreturn = equals(line1,line4);
		System.out.println(equalsreturn);
		
		boolean parallel = isParallel(line2, line3);
		System.out.println(parallel);
		
		boolean intersect = intersects(line1, line2); 
		System.out.println(intersect);
		
	}
	
	//Methods
	public static boolean equals(Line line1, Line line4) //slope and intercept
	{
		if(line1 == line4)
		{
			return true;
		}
		else
			return false;
	}
	
	public static boolean isParallel(Line line2, Line line3) //slope but not intercept
	{
		if(line3.m == line2.m && line2.b != line3.b)
		{
			return true;
		}
		else 
			return false;
	}
	
	public static boolean intersects(Line line1, Line line2) //if not parallel
	{
		if(line1 == line2)
		{
			return false;
		}
		else 
			return true;
	}


}
