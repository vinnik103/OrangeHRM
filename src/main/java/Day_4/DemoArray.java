package Day_4;

import java.util.Scanner;

public class DemoArray
{
    public static void main(String[] args)
    {
        int []num = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sequence of array: ");

        for(int i=0; i<num.length; i++)
        {
            num[i]=sc.nextInt();

        }
        for(int a: num)
        {
            System.out.println(a);
        }
        sc.close();
    }
}

