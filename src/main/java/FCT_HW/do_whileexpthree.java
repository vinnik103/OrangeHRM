package FCT_HW;

import java.util.Scanner;

public class do_whileexpthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int num = sc.nextInt();
        int sum = 0;

        do {
            sum = sum + num % 10;
            num = num / 10;

        } while (num > 0);
        System.out.println("sum of digit: " + sum);
    }
}