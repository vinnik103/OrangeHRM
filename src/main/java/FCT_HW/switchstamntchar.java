package FCT_HW;

import java.util.Scanner;

public class switchstamntchar
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a= sc.nextInt(), b= sc.nextInt();
        System.out.println(" enter your choice");
        char choice =sc.next().charAt(0);


        switch(choice)
        {
            case '+':
                System.out.println("Addition: "+(a+b));
                break;

            case '-':
                System.out.println("substraction : "+(a-b));
                break;

            case '*':
                System.out.println("mulitplication : "+(a*b));
                break;

            case '/':
                System.out.println("division : "+(a/b));
                break;

            case '%':
                System.out.println("modulus : "+(a-b));
                break;

            default:
                System.out.println("invalid choice:");
                break;

        }


    }

}
