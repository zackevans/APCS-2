
public class Bug 
{
	public static void main(String[] args) 
	{
		int bugPosition = 0;
		Boolean BoolBug = true;
		
		for (int i = 0; i <15; i++)
		{
			bugPosition = Move(bugPosition, BoolBug);
			BoolBug = Turn(BoolBug);
			getPosition(bugPosition);
			
		}
		
		
	}
	
	public static boolean Turn (Boolean BoolBug)
	{
		Boolean BoolReturn = null;
		
		if (BoolBug == true)
		{
			BoolReturn = false;
		}
		
		if (BoolBug == false)
		{
			BoolReturn = true;
		}
		
		return BoolReturn;
	}
	
	public static int Move (int BugPosition,Boolean BoolBug)
	{
		if (BoolBug == true)
		{
			BugPosition = BugPosition +1;
		}
		
		else if (BoolBug == false)
		{
			BugPosition = BugPosition -1;
		}
		
		return BugPosition;
		
	}
	
	public static void getPosition(int BugPosition)
	{
		System.out.println("Bug Position: " + BugPosition);
	}

}
