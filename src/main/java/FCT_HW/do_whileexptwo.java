package FCT_HW;

import java.util.Scanner;

public class do_whileexptwo
{
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number: ");
    int num= sc.nextInt();
    int i=1;

    do {
        System.out.println(num +"*" +i +"=" +(num*i));
        i++;

    }while (i<=10);

    sc.close();
}
}
