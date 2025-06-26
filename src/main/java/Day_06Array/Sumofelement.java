package Day_06Array;

public class Sumofelement {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40};

        int sum=0;

        for (int i=0; i<num.length; i++)

        {
            sum=sum+num[i];
        }
            System.out.println("sum of element is = " +sum);
    }
}
