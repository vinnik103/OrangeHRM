package Day_4;

import java.util.Scanner;

public class PalindromeNo
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int reverse =0, remender,temp=num;

        while(num>0)
        {
            remender=num%10;
            reverse=reverse*10 +num %10;
            num /=10;

        }
        if (temp==reverse)
        {
            System.out.println("no is palindrome");

        }
        else
        {
            System.out.println("no is not palindrome");

        }
    }
}
