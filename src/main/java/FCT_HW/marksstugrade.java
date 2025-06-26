package FCT_HW;

import java.util.Scanner;

public class marksstugrade
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks :");
        int marks= sc.nextInt();


        if(marks>75)
        {
            System.out.println("Grade :A+");

        }
        else if (marks>60)
        {
         System.out.println("Grade :B+");
        }
        else if (marks>40)
        {
            System.out.println("Grade :C");

        }
        else if (marks>35)
        {
         System.out.println("passed");
        }
        else
        {
            System.out.println("FAIl");
        }
    }

}
