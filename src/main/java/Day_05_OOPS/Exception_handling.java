package Day_05_OOPS;

public class Exception_handling
{
    public static void main(String []args)
    {
        try
        {
            int a=10;
            int b=0;

            int result = a/b; //this will case an exception

            System.out.println("Result is : "+result);
        }
        catch (ArithmeticException e)
        {
                System.out.println("Error: Cant divisible by zero");
        }
        System.out.println("Program continue after exception handling");
    }
    
}
