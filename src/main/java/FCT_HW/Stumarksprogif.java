package FCT_HW;

import java.util.Scanner;

public class Stumarksprogif
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks = sc.nextInt();

        if(marks>50)
        {
            System.out.println("EXAM PASSED");
        }
        else
        {
            System.out.println("EXAM FAILED");
        }
    }
}
