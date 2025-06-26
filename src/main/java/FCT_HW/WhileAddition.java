package FCT_HW;

public class WhileAddition
{
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        while (count < 5)
        {
            sum += count + 1;
            count++;
        }
        System.out.println("The sum of the five numbers is: " + sum);
    }
}

