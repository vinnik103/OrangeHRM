package FCT_HW;

import java.util.Scanner;

public class voteprogif

{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        if(age>18)
        {
            System.out.println("you are eligible to cast vote");
        }
        else
        {
            System.out.println("you are not eligible to cast vote");
        }
    }
}