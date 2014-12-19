
public class FizzBuzz 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 100; i++) 
        {
            boolean fizzOrBuzz = false;

            if (i % 3 == 0) 
            {
                System.out.print("Fizz");
                fizzOrBuzz = true;
            }
            if (i % 5 == 0) 
            {
                System.out.print("Buzz");
                fizzOrBuzz = true;
            }

            if (fizzOrBuzz) 
            {
                System.out.println();
            } 
            else 
            {
                System.out.println(String.valueOf(i));
            }
        }
    }
}
