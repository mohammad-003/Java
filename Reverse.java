import java.util.Scanner;

public class Reverse {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow/underflow BEFORE multiplying
            if (reversed > Integer.MAX_VALUE / 10 || 
                (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }

            if (reversed < Integer.MIN_VALUE / 10 || 
                (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }

            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();

        System.out.println("Enter an integer to reverse:");

        Scanner scanner = new Scanner(System.in);

        int  number = scanner.nextInt();
        scanner.close();

        int reversedNumber = reverse.reverse(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}