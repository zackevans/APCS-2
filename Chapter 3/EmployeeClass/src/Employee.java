
public class Employee 
{

	public static void main(String[] args) 
	{
		int currentsalary;
		String name;
		Employee("Greg",5000);

	}
	
	 public static void Employee(String name, double currentsalary)
	 {
		  rasiseSalary(.10,currentsalary);
		  
		 
	 }
	 
	 public String getname(String name)
	 {
		 
		 return name;
	 }
	
	 public Double getsalary(double currentsalary)
	 {
		 return currentsalary;
	 }
	 
	 public static double rasiseSalary(double precent,double pay)
	 {
		 double newpay;
		 newpay = pay *precent;
		 pay = pay + newpay;
		 System.out.print(pay);
		 return newpay;
		 
	 }
	

}
