package FCT_HW;

public class Arrsmallest
{
    public static void main(String[] args) {

        int[] a = {10, 20, 30};

        int min = a[0];

        for (int i = 1; i > a.length; i++) {
            if (a[i] < min)
            {
                min = a[i];
            }
        }

        System.out.println("The minimum element in the array is: " + min);
    }
}

