package Day_3;

import java.util.Scanner;

public class checkTemperature
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter temperature: ");
        int temp =sc.nextInt();

        if(temp>=40)
        {
            System.out.println("Its too hot outside ");

        }else if(temp>=30)
        {
            System.out.println("its worm day");
        }
        else if(temp>=20)
        {
            System.out.println("its a nice day");
        }
        else if(temp>=10)
        {
            System.out.println("its getting cold");
        }
    else
        {
            System.out.println("its freezing");
        }
    }

}
