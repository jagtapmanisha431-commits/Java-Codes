import java.util.Scanner;

public class Question2 {

    static int countDigits(int number) {
        int count = 0;

        while (number > 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    static long power(int base, int exponent) {
        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

    static boolean isArmstrong(int number) {
        int original = number;
        int digits = countDigits(number);
        long sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + power(digit, digits);
            number = number / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        if (start < 1 || end < start) {
            System.out.println("Invalid range.");
        } else {
            System.out.print("Armstrong numbers: ");

            for (int i = start; i <= end; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}

