package Day_3;

import java.util.Scanner;

public class ifstatement
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num: ");
        int a = sc.nextInt();

         if(a>=0)
         {
             System.out.println("number is positive");
         }
    }
}
