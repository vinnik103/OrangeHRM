package Day_4;

public class Demo_Num {
    public static void main(String[] args) {
        int num = 1;

        for (int i=1; i<=4; i++)
        {
            for(int j=1; j<=4-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(num +" ");
                num++;
            }
            System.out.println(" ");
        }
    }
}