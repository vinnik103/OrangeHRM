package FCT_HW;

public class oroperatorlogical
{

    public static void main(String[] args)
    {
        int a=12, b=4, c=22, d=33;

        if(a>b || a>c)
        {
            System.out.println("a is largest");

        }
        else if(b>c || b>d)
        {
            System.out.println("b is largest");

        }
        else if(c>d || c>a)
        {
            System.out.println("c is largest");

        }
        else if(d>a  || d>b)
        {
            System.out.println("d is largest ");
        }
        else {
            System.out.println("invalid no");
        }
    }
}
