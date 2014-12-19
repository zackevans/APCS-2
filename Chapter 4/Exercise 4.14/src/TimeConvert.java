import java.util.*;
import java.io.*;

public class TimeConvert 
{
	private double hours, hours2, minutes, minutes2,totMinutes;
	public TimeConvert(double timeOne, double timeTwo)
	{
		timeOne=timeOne/100;
		timeTwo=timeTwo/100;
		hours = timeOne;
		hours2 = timeTwo;
		
		minutes = timeOne-Math.floor(timeOne);
		minutes2 = timeTwo-Math.floor(timeTwo);
		totMinutes=(minutes+minutes2)*100;
	}
	public double getHours()
	{
		double differenceHours = Math.floor(Math.abs(hours2-hours));
		return differenceHours;
	}
	public double getMinutes()
	{
		double differenceMinutes = Math.abs(totMinutes);
		return differenceMinutes;
	}
	public static void main(String[] args)
	{
		Scanner IN = new Scanner(System.in);
		
		System.out.printf("Enter Time1: ");
		double Time1 = IN.nextDouble();
		System.out.printf("Enter Time2: ");
		double Time2 = IN.nextDouble();
		
		TimeConvert time = new TimeConvert(Time1, Time2);
		//System.out.printf("%.f hours %.0 min",time.getHours(),time.getMinutes());
		
		System.out.println(time.getHours()+" hours");
		System.out.println(time.getMinutes()+" minutes");
	}

}
