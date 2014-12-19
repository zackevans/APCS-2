import java.util.*;

public class exercise7
{
	public static void main(String[] args)
	{
		Scanner In = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		String name1 = In.next();
		
		System.out.print("Enter another name: ");
		String name2 = In.next();
		
		System.out.print("Enter one more name: ");
		String name3 = In.next();
		
		
			if(name1.charAt(0) < name2.charAt(0))
			{
				
				
				if(name2.charAt(0) < name3.charAt(0))
				{
					System.out.println(name1);
					System.out.println(name2);
					System.out.println(name3);
				}
				
				else if(name2.charAt(0) > name3.charAt(0))
				{
					System.out.println(name3);
					System.out.println(name1);
					System.out.println(name2);
					
				}
			}
			
			if (name1.charAt(0) > name2.charAt(0))
			{	
			
			
				if (name2.charAt(0) > name3.charAt(0))
				{
					 System.out.println(name3);
					 System.out.println(name2);
					 System.out.println(name1);
				}
				else if (name2.charAt(0) < name3.charAt(0))
				{
					 System.out.println(name2);
					 System.out.println(name3);
					 System.out.println(name1);
				}
				
	
				
			}
			
		

	}

}
