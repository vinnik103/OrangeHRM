package Day_1;

public class swapwithout3var
{
    public static void main(String[]args)
    {
        int num1 =12; //swap without using third variable
        int num2 =16;

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("After swap");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);


    }

}
