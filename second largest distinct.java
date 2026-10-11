import java.util.Scanner;

public class Question1 {

    static int secondLargest(int number) {
        int largest = -1;
        int second = -1;

        while (number > 0) {
            int digit = number % 10;

            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit < largest && digit > second) {
                second = digit;
            }

            number = number / 10;
        }

        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = secondLargest(number);

            if (result == -1) {
                System.out.println(
                    "Fewer than two distinct digits exist."
                );
            } else {
                System.out.println(
                    "Second-largest distinct digit: " + result
                );
            }
        }

        sc.close();
    }
}
