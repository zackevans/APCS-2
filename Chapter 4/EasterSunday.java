import java.util.*;

public class EasterSunday
{
	public static void main(String[] args) 
	{
		//Enters year
		Scanner In = new Scanner(System.in);
		System.out.print("Enter the year: ");
		double y = In.nextDouble();
		//Calculations
		
		double remainderA = y%19;
		double quotientB = y/100;
		double remainderC = y%100;
		double quotientD = quotientB/4;
		double remainderE = quotientB%4;
		double quotientG = ((8*quotientB) + 13)/25;
		double remainderH = ((19*remainderA)+quotientB-quotientD-quotientG+15)/30;
		double quotientJ = remainderC/4;
		double remainderK = remainderC%4;
		double quotientM = ((remainderA+11)*remainderH)/319;
		double remainderR = ((2*remainderE)+(2*quotientJ)-remainderK-remainderH+quotientM+32)/7;
		double quotientN = ((remainderH-quotientM)+(remainderR+90))/25;
		double remainderP = ((remainderH-quotientM)+(remainderR+quotientN+19))/32;
		
		System.out.printf("Month = %f Day = %f", getEasterSundayMonth(quotientN), getEasterSundayDay(remainderP));
	}
	public static double getEasterSundayMonth(double quotientN)
	{
		return quotientN;
	}
	public static double getEasterSundayDay(double remainderP)
	{
		return remainderP;
	}

}
