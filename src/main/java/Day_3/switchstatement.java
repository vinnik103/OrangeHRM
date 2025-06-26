package Day_3;

import java.util.Scanner;

public class   switchstatement
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter two numbers: ");
       int a= sc.nextInt(), b= sc.nextInt();
        System.out.println("enter your choice: ");
       int choice=sc.nextInt();


       switch(choice)
       {
           case 1:
               System.out.println("Addition: "+(a+b));
           break;

           case 2:
               System.out.println("substraction : "+(a-b));
               break;

           case 3:
               System.out.println("mulitplication : "+(a*b));
               break;

           case 4:
               System.out.println("division : "+(a/b));
               break;

           case 5:
               System.out.println("modulus : "+(a-b));
               break;

           default:
               System.out.println("invalid choice:");
               break;

       }

    }
}
