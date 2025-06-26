package Day_3;

import java.util.Scanner;

public class ifelsestatement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();

        if(age>18)
        {
            System.out.println("you are eligible for driving licence");
        }
        else
        {
            System.out.println("you are not eligible for driving licence");
        }
    }
}
