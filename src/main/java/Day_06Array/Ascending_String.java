package Day_06Array;


import java.util.Arrays;

public class Ascending_String
{
    public static void main(String []args) {
        String fruits[] = {"banana", "apple", "orange"};
        //function of Array

        Arrays.sort(fruits);
        System.out.println("Sorted Array: "+Arrays.toString(fruits));

    }
}
