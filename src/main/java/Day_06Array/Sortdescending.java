package Day_06Array;

public class Sortdescending
{
    public static void main(String []args)
    {
        int a[]={5,2,8,1,};

        for(int i=0; i<a.length;i++)
        {
            for(int j=i+1; j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("sorted array as descending");
        for (int num : a)
        {
            System.out.println(num+ " ");
        }
    }
}

