package Day_4;

import java.util.Scanner;

public class Sumofdigit
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int num = sc.nextInt();

        int sum=0;

        while(num>0)
        {
            sum = sum+num %10;
            num = num/10;

        }
        System.out.println("sum of digit :"+sum);
    }
}
