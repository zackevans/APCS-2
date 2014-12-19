import java.util.*;

public class Numbers 
{
	
	
	public static void main(String[] args) 
	{
		Scanner KBR = new Scanner(System.in);
		
		System.out.print("Enter A Number: ");
		double Num1 = KBR.nextDouble();
		System.out.print("Enter A Number: ");
		double Num2 = KBR.nextDouble();
		
		System.out.printf("Sum: %.2f%n", Sum(Num1,Num2));
		System.out.printf("Difference: %.2f%n", Difference(Num1,Num2),"/n");
		System.out.printf("Product: %.2f%n", Product(Num1,Num2));
		System.out.printf("Avrage: %.2f%n", Avrage(Num1,Num2));
		System.out.printf("Distance: %.2f%n", Distance(Difference(Num1,Num2)));
		System.out.printf("Min: %.2f%n", Max(Num1,Num2));
		System.out.printf("Min: %.2f%n", Min(Num1,Num2));
	}
	
	public static double Sum (double num1,double num2) {return num1+num2;}
	public static double Difference (double num1,double num2) {return num1-num2;}
	public static double Product (double num1,double num2) {return num1*num2;}
	public static double Avrage (double num1,double num2) {return num1/num2;}
	public static double Distance (double Difference) {return Math.abs(Difference);}
	public static double Max (double num1,double num2) {return Math.max(num1,num2);}
	public static double Min (double num1,double num2) {return Math.min(num1,num2);}
	

}
