import java.lang.*;
import java.util.*;


public class SumPositiveIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int num;

        // prompt the user for input until a negative integer is entered
        do {
            System.out.print("Enter a positive integer (negative integer to quit): ");
            num = input.nextInt();

            // add the positive integer to the sum if it's not negative
            if (num >= 0) {
                sum += num;
            }
        } while (num >= 0);

        System.out.println("The sum of the positive integers is: " + sum);
    }
}
