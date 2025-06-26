package Day_3;

import java.util.Scanner;

public class methodofscanner
{

    public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter long number: ");
        long mylong = sc.nextLong();

        System.out.println("enter float number: ");
        float ht = sc.nextFloat();

       System.out.println("enter double number:");
        double lt = sc.nextDouble();

        System.out.println("enter boolean number:");
        boolean num= sc.nextBoolean();

        System.out.println("enter a character:");
        char ch = sc.next().charAt(3);

        System.out.println("enter name:");
        String n = sc.nextLine();

        System.out.println("number:"+mylong);
        System.out.println("height:"+ht);
        System.out.println("length:"+lt);
        System.out.println("number:"+num);
        System.out.println("character:"+ch);
        System.out.println("name"+n);

    }



}
