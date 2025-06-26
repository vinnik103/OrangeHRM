package Day_05_OOPS;

class Calculator
{
    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;

    }

    double add(double a, double b)
    {
        return a+b;
    }
}

public class Compile_timepoly
{
    public static void main(String []args)
    {
       Calculator c= new Calculator();
       System.out.println("Addition of 2 num"+(c.add(5,10)));
        System.out.println("Addition of 2 num"+(c.add(5,10,3)));
}
}