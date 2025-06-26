package Day_06Array;

import java.util.Scanner;

public class Primenoexone
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();

        for (int i=2;i<num;i++)
        {
            if(num%2 ==0)
            {
                System.out.println("num is prime:");

            }
            System.out.println("num is not prime");
        }
    }
}

