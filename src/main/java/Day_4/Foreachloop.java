package Day_4;

public class Foreachloop
{
    public static void main(String []args)
    {
        int []num={3,4,5,6,7,8,9,32,45,66,67};


       /* for(int i=0; i<=num.length;i++)
        {
            System.out.println(num[i]);
        }*/

        for(int a:num)
        {
            System.out.println(a);
        }
    }
}
