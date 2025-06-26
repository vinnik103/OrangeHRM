package FCT_HW;

public class checkAgegroup {

    public static void main(String[] args) {
        int age = 12;

        if (age > 10)
        {
            if (age < 13)
            {
                System.out.println("child");
            } else {
                System.out.println("Adult");
            }
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
