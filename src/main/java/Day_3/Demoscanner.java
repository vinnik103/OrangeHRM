package Day_3;

import java.util.Scanner;

public class Demoscanner
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num 1: ");
        int num1=sc.nextInt();

        System.out.println("enter num2: ");
        int num2=sc.nextInt();

        int result = num1 +num2;
        System.out.println("Addition of two no is :"+result);
    }
}
