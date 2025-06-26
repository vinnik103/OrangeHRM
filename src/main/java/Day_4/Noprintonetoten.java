package Day_4;

public class Noprintonetoten
{
    public static void main(String[] args)
    {
        // 1 2 3 4 5
        // 6 7 8 9 10
        int c=1;
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.print(c+ " ");
                c++;
            }
            System.out.println(" ");
        }
    }
}


