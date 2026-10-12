import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] numbers = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int total = 0;
        int count = 0;
        int largest = 0;

        for (int i = 0; i < n; i++) {

            if (numbers[i] >= 0 && numbers[i] % 2 == 0) {

                int square = numbers[i] * numbers[i];

                total = total + square;
                count = count + 1;

                if (count == 1 || square > largest) {
                    largest = square;
                }
            }
        }

        if (count == 0) {
            System.out.println("No valid numbers found.");
        } else {
            System.out.println("Total: " + total);
            System.out.println("Count: " + count);
            System.out.println("Largest squared value: " + largest);
        }

        sc.close();
    }
}
