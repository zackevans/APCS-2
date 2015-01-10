import java.util.Scanner;
import java.math.*;

public class DataSet
{
	 private double s;
     private double sum;
     private double maximum;
     private int count;
  
      public DataSet()
      {
         sum = 0;
         count = 0;
         maximum = 0;
         s = 0;
      }
   
     public void add(double x)
     {
        sum = sum + x;
        if (count == 0 || maximum < x) maximum = x;
         count++;
     }
  

      public double getAverage()
      {
         if (count == 0) return 0;
         else return sum / count;
      }
      public void standardDeviation(double s)
      {
    	  this.s = s;
    	  s = Math.sqrt(Math.pow(getAverage(), 2) - (1/count)*Math.pow(getAverage(), 2) / count - 1);
      }
      
      public double getDeviation()
      {
    	  if (count == 0) return 0;
    	  else return s;
      }
      
      public double getMaximum()
      {
         return maximum;
      }
      
}