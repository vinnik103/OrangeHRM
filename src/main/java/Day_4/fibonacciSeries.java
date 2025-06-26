package Day_4;

public class fibonacciSeries
{
    public static void main(String []args) {


        int first_no = 0;
        int second_no = 1;

        for (int i=1; i<=10; i++) {
            System.out.print( first_no +" ");

            int add = first_no + second_no;
            first_no=second_no;
            second_no=add;

        }

    }

}
