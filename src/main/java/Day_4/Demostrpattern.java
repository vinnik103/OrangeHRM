package Day_4;

public class Demostrpattern
{
    public static void main(String[] args)
    {
        for(int i=1; i<=3; i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");

            }
            for(int k=1; k<=3-i+1; k++)
            {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
