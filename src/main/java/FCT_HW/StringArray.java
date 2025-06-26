package FCT_HW;

import java.util.Scanner;

public class StringArray
{
    public static void main(String[] args)
    {
        String[] num = new String[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the strings:");


        for (int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextLine();
        }

        for (String a : num)
        {
            System.out.println(a);
        }
        sc.close();
    }
}
