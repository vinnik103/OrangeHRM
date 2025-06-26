package Day_4;

import java.util.Scanner;

public class ReverseNum

{
    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        int reverse=0, remender;

        while(num>0)
        {
            remender = num %10;
            reverse = reverse *10 +remender;
            num = num/10;
        }
        System.out.println("reverse number is :"+reverse);
    }
}
