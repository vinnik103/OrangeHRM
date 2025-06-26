package FCT_HW;

import java.util.Scanner;

public class dowhileexpfour
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        int reverse=0, remender;

       do {
            remender = num %10;
            reverse = reverse *10 +remender;
            num = num/10;
        }while (num>0);
        System.out.println("reverse number is :"+reverse);
    }
}
