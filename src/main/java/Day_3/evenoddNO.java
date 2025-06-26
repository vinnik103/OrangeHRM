package Day_3;

import java.util.Scanner;

public class evenoddNO
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        if(num %2==0)
        {
            System.out.println("no is even");
        }
        else{
            System.out.println("no is odd");
        }
    }
}
